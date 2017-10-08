var Insight = SuperWidget.extend({
    instanceId: "",
    message: null,

    APPROVE: "5",
    REPROVE: "6",

    netWork: new synaptic.Architect.Perceptron(3,18,2),
    importNetwork: null,

    polly: {},
    voice: {},

    //método iniciado quando a widget é carregada
    init: function () {
        
        var self = this;
    	
    	var x = 60;
    	var y = 40;
    	
    	setTimeout(function(){
    		aprovado.innerHTML = x;
    		reprovado.innerHTML = y;
    	}, 200);

        this.ia();

        this.polly = new AWS.Polly({ apiVersion: '2016-06-10' });
        this.informUser();

        this.voice = listener.initialize(this);
        this.bindKeyboard();
    },

    bindings: {
        local: {
            'listen': ['click_listen'],
            'show-message': ['click_showMessage']
        }
    },

    bindKeyboard: function(){
        var self = this;
        $(window).keydown(function(e){
            if (e.ctrlKey){
                console.log('Control Down');
                self.listen();
            }
        });
    },

    // Capturamos a ação do click no botão e iniciamos a gravação ou a paramos
    // dependendo da variavel de controle isRecording
    listen: function () {
        (this.voice.isRecording) ? this.stopListen() : this.voice.api.start();
    },
    stopListen: function(){
        this.voice.api.stop();
        $("#listening").hide();
    },

    command: function (c) {
        console.log("Commando=" + c);
        var preparedCommand = c.trim().toLowerCase();
        if (preparedCommand.indexOf("aprova") > -1
            || preparedCommand.indexOf("ok") > -1) {
            this.confirm(this.APPROVE);
        }
        else if (preparedCommand.indexOf("reprova") > -1) {
            this.confirm(this.REPROVE);
        }
        else{
            this.stopListen();
            (preparedCommand.indexOf("sim") > -1
                || preparedCommand.indexOf("prossiga") > -1)
                ? this.highFidelityAction()
                : this.cancelResponse();
        }
    },

    confirm: function (actionContext) {
        var self = this;

        var params = player.params();
        params.Text = (actionContext == self.APPROVE)
            ? "Vou prosseguir com a aprovação, tudo bem?"
            : "Tem certeza que deseja reprovar?";
        self.polly.synthesizeSpeech(
            params
            , function (err, data) {
                if (err) {
                    self.sorry();
                    console.log(err, err.stack); // an error occurred
                }
                else {
                    player.play(data.AudioStream); // successful response
                    setTimeout(function(){
                        self.listen();
                    }, 1500);
                }
            }
        );
    },

    highFidelityAction: function () {
        console.log("HIGH");
        var params = player.params();
        params.Text = "Aguarde, assim que finalizar eu te aviso."
        this.polly.synthesizeSpeech(
            params
            , function (err, data) {
                if (err) {
                    self.sorry();
                    console.log(err, err.stack); // an error occurred
                }
                else player.play(data.AudioStream); // successful response
            }
        );
    },

    cancelResponse: function () {
        var params = player.params();
        params.Text = "Sem problemas, fica pra outra hora!"
        this.polly.synthesizeSpeech(
            params
            , function (err, data) {
                if (err) {
                    self.sorry();
                    console.log(err, err.stack); // an error occurred
                }
                else player.play(data.AudioStream); // successful response
            }
        );
    },

    informUser: function () {
        var self = this;
        var params = this.getUserInsight();
        if (params != null) {
            this.polly.synthesizeSpeech(
                params
                , function (err, data) {
                    if (err) {
                        self.sorry();
                        console.log(err, err.stack); // an error occurred
                    }
                    else player.play(data.AudioStream); // successful response
                }
            );
        }
    },

    getUserInsight: function () {
        var params = player.params();
        return params;
    },

    sorry: function () {
        FLUIGC.toast({
            title: ':(',
            message: 'Não tenho insight para você hoje',
            type: 'info'
        });
    },

    getApprovalRate: function(data){
        var self = this;
        return self.importNetwork.activate(data);
    },

    ajustaData: function(data){
        var input = [];
        var output = [];
        var valor = 0;
        var dataset = [];
        var self = this;
        for (i=0; i<data.length; i++) {
            if (data[i].aprova == 's') {
                output = [1,0];
            }else{
                output = [0,1]
            }
            valor = parseInt(data[i].valor) / 10000;
            input = [1,0,valor];

            dataset.push({
                input: input,
                output: output
            });
        }
        console.log(dataset);
        self.trainNeural(dataset);
    },

    getDataToTrain: function(){
        var self = this;
        var param = JSON.stringify(
            {
                "name" : "compras",
                "fields": ["valor", "aprova"],
                "constraints" : [{  
                    "_field" : "aprova",
                    "_initialValue": "",
                    "_finalValue": "",
                    "_type": 3,
                    "_likeSearch": false
                }]
            }
        );
        var dataset = null;
        $.ajax({
			url: '/api/public/ecm/dataset/datasets',
			dataType: 'json',
			contentType: 'application/json',
			type: 'POST',
			async: false,
			data: param,
			success:function(data, status, xhr){
                self.adjustData(data.content.values);
			},
			fail: function(xhr, status, error){
				console.log('fail',error);
			},
			statusCode:{
				500: function(err) {
					console.log('fail',err);
				}
			}
        });
    },

    ia: function(){
        var self = this;
    
        var importJson = self.getLocalStorage();
        if (importJson != null) {
            self.importNetwork = synaptic.Network.fromJSON(importJson);
            console.log("JA TREINADO");
        }else{
            self.getDataToTrain();
            self.importNetwork = this.netWork;
        }

        console.log("+++++++++++++++++++++++++++++");

        var recommendations = self.getApprovalRate([1,0,0.25]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");

        var recommendations = self.getApprovalRate([1,0,0.2589]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");

        var recommendations = self.getApprovalRate([1,0,0.01]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");

        var recommendations = self.getApprovalRate([1,0,0.3945]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");
        
        var recommendations = self.getApprovalRate([1,0,0.2350]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");
        
        var recommendations = self.getApprovalRate([0,1,0.4]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

        console.log("+++++++++++++++++++++++++++++");
        
        var recommendations = self.getApprovalRate([0,1,0.0623]);
        console.log('Aprova ' + recommendations[0]);
        console.log('Reprova ' + recommendations[1]);

    },

    trainNeural: function(dataset){
        var self = this;
        var trainer = new synaptic.Trainer(self.netWork);

        /**
         *  Treina a rede
         */
        trainer.train(
            dataset,
            {   
                rate: .1,
                iterations: 10000,
                error: .001,
                shuffle: true,
                log: 10,
                cost: synaptic.Trainer.cost.CROSS_BINARY
            }
        );

        self.saveLocalStorage(self.netWork)
    },

    saveLocalStorage: function(network){
        console.log("TREINADO");
        var exportJson = network.toJSON();
        localStorage.setItem("exportedJson", JSON.stringify(exportJson));
    },

    getLocalStorage: function(){
        return JSON.parse(localStorage.getItem("exportedJson"));;
    },

    showMessage: function () {
    	var self = this;
    	
    	var selectedState = '';
    	var selectedColleagues = new Array("bob");
    	var password = null;
    	var observation = '';
    	var managerMode = false;
    	var instances = new Array();
    	
     	var approved = 'N';
    	var instancesReceive = new Array("1361", "1362");
  
    	
    	for (var i = 0; i < instancesReceive.length; i++) {
    		if (approved == 'S') {
    			selectedState = "9";
    			instances.push(self.getInstances(instancesReceive[i], '2'));
    			observation = 'Movimento Automátivo APROVADO';
    		} else {
    			selectedState = "11";
    			instances.push(self.getInstances(instancesReceive[i], '2'));
    			observation = 'Movimento Automátivo REPROVADO';
    		}
    		
    	}
    	
    	self.ajaxAPI(selectedState, selectedColleagues, password, observation, instances, managerMode);
    	
    },
    
    getInstances: function(intances, movementSequence) {
    	return { 
    		"instanceId": intances,
    		"movementSequence":movementSequence
    	}
    }, 
    
    ajaxAPI: function(selectedState, selectedColleagues, password, observation, instances, managerMode) {
    	
        var url = WCMAPI.getServerURL();
        var d = $.Deferred();
        var request_data = {
            url: url+'/ecm/api/rest/ecm/centralTasks/batchSend',
            method: 'POST',
            ajaxData: JSON.stringify({
            	"selectedState": selectedState,
        		 "selectedColleagues":selectedColleagues,
        		 "password":password,
        		 "observation":observation,
        		 "instances":instances || [],
        		 "managerMode":managerMode
            }),
            data: {}
        };
        
        
        $.ajax({
            url: request_data.url,
            async: true,
            type: request_data.method,
            data: request_data.ajaxData,
            contentType: "application/json"
        })
        .done(function(result){
        	console.log(result);
            d.resolve(result);
            FLUIGC.message.alert({
            	message: "Solicitações movimentadas com sucesso!",
        		title: 'Message',
        	    label: 'OK'
            });          
        })
        .fail(function(data){
            d.reject
            console.log(data);
            FLUIGC.message.alert({
            	message: "Erro ao movimentar as solicitações em bloco!",
        		title: 'Message',
        	    label: 'OK'
            });
        });
        //return d;
    },
    
    chartLine: function () {
    	var chartLine = FLUIGC.chart('#line', {
    	    id: 'set_an_id_for_my_chart',
    	    width: '700',
    	    height: '200',
    	});
    	
    	var dataLine = {
    		    labels: ["January", "February", "March", "April", "May", "June", "July"],
    		    datasets: [
    		        {
    		            label: "My First dataset",
    		            fillColor: "rgba(220,220,220,0.2)",
    		            strokeColor: "rgba(220,220,220,1)",
    		            pointColor: "rgba(220,220,220,1)",
    		            pointStrokeColor: "#fff",
    		            pointHighlightFill: "#fff",
    		            pointHighlightStroke: "rgba(220,220,220,1)",
    		            data: [65, 59, 80, 81, 56, 55, 40]
    		        },
    		        {
    		            label: "My Second dataset",
    		            fillColor: "rgba(151,187,205,0.2)",
    		            strokeColor: "rgba(151,187,205,1)",
    		            pointColor: "rgba(151,187,205,1)",
    		            pointStrokeColor: "#fff",
    		            pointHighlightFill: "#fff",
    		            pointHighlightStroke: "rgba(151,187,205,1)",
    		            data: [28, 48, 40, 19, 86, 27, 90]
    		        }
    		    ]
    		};
    	var options = null;
    	var lineChart = chartLine.line(dataLine, options);
    },
    
    chartDoughnut: function() {
    	var chartDoughnut = FLUIGC.chart('#doughnut', {
			id: 'set_an_id_for_my_chart',
        	width: '700',
        	height: '200',
		});
	
		var dataDoughnut = [
	            {
	                value: 300,
	                color:"#F7464A",
	                highlight: "#FF5A5E",
	                label: "Red"
	            },
	            {
	                value: 50,
	                color: "#46BFBD",
	                highlight: "#5AD3D1",
	                label: "Green"
	            },
	            {
	                value: 100,
	                color: "#FDB45C",
	                highlight: "#FFC870",
	                label: "Yellow"
	            }
	        ]
		var options = [{
			percentageInnerCutout: 100
		}];
		var doughnutChart = chartDoughnut.doughnut(dataDoughnut, options);
		
		$('#doughnut').on('fluig.chart.doughnut.click', function(data) {
		    alert("opa");
		    console.log(data);
		});
    }

});