var Insight = SuperWidget.extend({
    instanceId: "",
    message: null,

    APPROVE: "9",
    REPROVE: "11",
    isConfirming: "",
    
    datatable: null,
    
    toApprove: [],
    toReprove: [],

    netWork: new synaptic.Architect.Perceptron(3,18,2),
    importNetwork: null,

    polly: {},
    voice: {},

    //método iniciado quando a widget é carregada
    init: function () {
        var self = this;
    	
  
        this.ia();

        this.polly = new AWS.Polly({ apiVersion: '2016-06-10' });
        

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
    
    getOpenProcess: function(){
    	  var self = this;
          var param = JSON.stringify(
              {
                  "name" : "ds_sql_fluig_consulta",
                  "fields": ["select * from ml002004 where aprova is null;"],
                  "constraints" : []
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
                  self.resolveProcess(data.content.values);
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
    
    resolveProcess : function(data){
    	
    	
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
        if(this.toApprove.length == 0 && this.toReprove.length == 0) {
            this.stopListen();
            return;
        }

        console.log("Commando=" + c);
        var preparedCommand = c.trim().toLowerCase();
        if (preparedCommand.indexOf("aprova") > -1
            || preparedCommand.indexOf("ok") > -1) {
            this.confirm(this.APPROVE);
            this.isConfirming = this.APPROVE;
        }
        else if (preparedCommand.indexOf("reprova") > -1) {
            this.confirm(this.REPROVE);
            this.isConfirming = this.REPROVE;
        }
        else{
            this.stopListen();
            (preparedCommand.indexOf("sim") > -1
                || preparedCommand.indexOf("prossiga") > -1)
                ? this.highFidelityAction(this.isConfirming)
                : this.cancelResponse();
            
            this.isConfirming = "";
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

    highFidelityAction: function (targetState) {
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

        this.blockMove(targetState);
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
        params.Text = "Oi lindo!";
        if(this.toApprove.length > 0 || this.toReprove.length > 0){
            params.Text += " Temos tarefas confiáveis para ação imediata ";
            if(this.toApprove.length > 0){
                params.Text += "sendo " + this.toApprove.length + " para aprovação.";
            }
            if(this.toReprove.length > 0){
                params.Text += (this.toApprove.length > 0) ? " e " : " sendo ";
                params.Text +=  + this.toReprove.length + " para reprovação.";
            }
            params.Text += " Deseja ";
            params.Text += (this.toApprove.length > 0) ? "aprovar " : "";
            params.Text += (this.toApprove.length > 0 && this.toReprove.length > 0) ? "ou " : "";
            params.Text += (this.toReprove.length > 0) ? "reprovar " : "";
        }
        else params.Text = "Sem tarefas para ação automática.";
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
                self.ajustaData(data.content.values);
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

        /*console.log("+++++++++++++++++++++++++++++");

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
        console.log('Reprova ' + recommendations[1]);*/
        
        console.log('creating datatable..');
        
        self.startTables();
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

    // showMessage: function () {
    // 	var self = this;
    	
    // 	var selectedState = '';
    // 	var selectedColleagues = new Array("bob");
    // 	var password = null;
    // 	var observation = '';
    // 	var managerMode = false;
    // 	var instances = new Array();
    	
    //  	var approved = 'N';
    // 	var instancesReceive = new Array("1361", "1362");
  
    	
    // 	for (var i = 0; i < instancesReceive.length; i++) {
    // 		if (approved == 'S') {
    // 			selectedState = "9";
    // 			instances.push(self.getInstances(instancesReceive[i], '2'));
    // 			observation = 'Movimento Automátivo APROVADO';
    // 		} else {
    // 			selectedState = "11";
    // 			instances.push(self.getInstances(instancesReceive[i], '2'));
    // 			observation = 'Movimento Automátivo REPROVADO';
    // 		}
    		
    // 	}
    	
    // 	self.ajaxAPI(selectedState, selectedColleagues, password, observation, instances, managerMode);
    	
    // },
    blockMove: function (targetState) {
    	var self = this;
    	
    	var selectedColleagues = new Array("adm2");
    	var password = 'adm';
    	var observation = '';
    	var managerMode = false;
    	var instances = new Array();
        
        if (targetState == self.APPROVE) {
    	    for (var i = 0; i < self.toApprove.length; i++) {
    			instances.push(self.getInstances(self.toApprove[i], '2'));
    			observation = 'Movimento Automátivo APROVADO';
            } 
        }
        else {
            for (var i = 0; i < self.toReprove.length; i++) {
    			instances.push(self.getInstances(self.toReprove[i], '2'));
    			observation = 'Movimento Automátivo REPROVADO';
    		}
    	}
    	self.ajaxAPI(targetState, selectedColleagues, password, observation, instances, managerMode);
    },
    
    getInstances: function(intances, movementSequence) {
    	return { 
    		"instanceId": intances,
    		"movementSequence":movementSequence
    	}
    }, 
    
    ajaxAPI: function(selectedState, selectedColleagues, password, observation, instances, managerMode) {
    	var that = this;
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

            var params = player.params();
            params.Text = "Pronto, terminei!";
            if (params != null) {
                that.polly.synthesizeSpeech(
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
            
            that.datatable.destroy();
            that.startTables();
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
    
    startTables: function() {
    	var self = this;
    	var filter = "select * from ml002004 where aprova is null;";
    	self.getDataSolic(filter)
    		.done(function(data){
				var grid = 'gridRisco';
				var fields = [];
				var dataset = 'ds_sql_fluig_consulta';
			    var template = 'datatable_risco';
				var headerDatatable = [
			        {
			        	'title': 'Processo',
			        	'size' : 'col-md-1'
			        },
			        {
			        	'title': 'Empresa',
			        	'size' : 'col-md-3'
		    		},
			        {
			        	'title': 'Produto',
			        	'size' : 'col-md-4'
		    		},
			        {
			        	'title': 'Requisitante',
			        	'size' : 'col-md-1'
		    		},
			        {
			        	'title': 'Valor',
			        	'size' : 'col-md-1'
		    		},
			        {
			        	'title': 'Porcetagem',
			        	'size' : 'col-md-1'
		    		},
		    		{
		    			'title': 'Status',
			        	'size' : 'col-md-1'
		    		}
		   	    ];
				self.datatable = self.createDatatable(grid, fields, dataset, data.values, template, headerDatatable, false);
		}).fail(function(error){
			console.log(error);
		});
    },
    
    getDataSolic: function(filter){
    	var self = this;
    	fields = [filter];
    	var constraints = [];
        if (filter != null && filter != undefined) {
        	constraints.push(self.createConstraint("aprova", filter));
        }
        return self.getDataset("ds_sql_fluig_consulta", fields, constraints);
    },
    
    createDatatable: function(grid, fields, dataset, myData, template, headerDatatable, enableSearch){
        var self = this;
        var data = myData;   
    	var x = 0;
    	var y = 0;
    	var z = 0;
        
    	for(var i in data){
    		var calculate = new Array();
    		
    		var empresa = data[i].empresa;
    		
    		if (empresa == "VOTORANTIM CIMENTOS S/A") {
    			calculate.push(0,1);
    		} else {
    			calculate.push(1,0);
    		}
    		
    		var valor = (parseInt(data[i].valor)/10000);
    		
    		calculate.push(valor);
    		
    		var recommendations = self.getApprovalRate(calculate);
    	    console.log('Aprova ' + recommendations[0]);
    	    console.log('Reprova ' + recommendations[1]);
    	    if ( parseInt(recommendations[0]) < 1 &&  parseInt(recommendations[1]) < 1) {
                if (recommendations[0] > recommendations[1]) {
                    data[i].porcetagem = (recommendations[0]*100).toFixed(2);
                    data[i].status = "true";
                    x++;
                    self.toApprove.push(data[i].processid);
                } else {
                    data[i].porcetagem = (recommendations[1]*100).toFixed(2);
                    data[i].status = "false";
                    y++;
                    self.toReprove.push(data[i].processid);
                }
    	    } else {
    	    	data[i].status = "nodata";
    	    	z++;
    	    }
    	}
        this.informUser();
        
    	setTimeout(function(){
    		aprovado.innerHTML = x;
    		reprovado.innerHTML = y;
    		aprendizado.innerHTML = z;
    	}, 200);
    	    	   
        self.datatable = FLUIGC.datatable("#"+grid, {
            dataRequest: data,
            renderContent: '.'+template,
            search: {
                enabled: enableSearch,
                onSearch: function(searchText) {
                		self.reloadDatatable(dataset, searchText, fields).done(function(data){
	                    //self.datatable.reload(data);
	                });
                },
                onlyEnterkey: true,
                searchAreaStyle: 'col-md-3'
            },
            navButtons: {
                enabled: false,
            },

            emptyMessage: '',//'<br><div class="text-center"><h2>Nenhum registro encontrado ou falta de permissão do usuário.</h2></div>',
            header: headerDatatable
        }, function(err, data) {
        	console.log(err);
        	console.log(data);
        	
        	$(".status").each(function(index){
        		var text = $( this ).text();
        		
        		if(text == "true") {
        			$(this).html("<span class='fs-xs-space fluigicon fluigicon-arrow-up fluigicon-sm'></span>"); 
        		} else if (text == "false") {
        			$(this).html("<span class='fs-xs-space fluigicon fluigicon-arrow-down fluigicon-sm'></span>");
        		}else {
        			$(this).html("<span class='fs-xs-space fluigicon fluigicon-unchecked fluigicon-sm'></span>");
        		}
        	});

        });
/*      navButtons: {
				enabled: false,
				forwardstyle: 'btn-primary',
				backwardstyle: 'btn-primary',
            },
            scroll:{
            	enabled : false,
            },
            actions: {
                enabled: true,
                template: '.template_area_buttons',
                actionAreaStyle: 'col-md-9'
            },
            emptyMessage: '<br><div class="text-center"><h2>Nenhum registro encontrado ou falta de permissão do usuário.</h2></div>',
            tableStyle: 'table-striped table table-condensed',
            header: headerDatatable
        }, function(err, data) {
            
        });*/
        console.log(self.datatable);
        return self.datatable;
    },
        
    createConstraint: function(field, value, type, likeSearch){
        return {
            "_field":field,
            "_initialValue":value,
            "_finalValue":value,
            "_type": type || 1,
            "_likeSearch" : likeSearch || false
        };
    },
        
    getDataset: function(datasetName, fields, constratins, order) {    
    	var url = WCMAPI.getServerURL()+'/api/public/ecm/dataset/datasets';    
        var d = $.Deferred();
        var request_data = {
        	
            url: url,
            method: 'POST',
            ajaxData: JSON.stringify({
                "name":datasetName,
                "fields": fields || [],
                "constraints":[],
                "order": []
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
        .pipe(function(p){
        	return p.content;
        })
        .done(function(result){ 
        	d.resolve(result);
        })
        .fail(function(error){
        	console.log(error);
        	d.reject
        });
        return d;
    },
    
    reloadDatatable: function(dataset, filtro, campos){
        var d = $.Deferred();
        var self = this;
        var fields = [];
        var constraints = [];
        /*        
        if(filtro != null && filtro != "" && campos.length > 0){
        	for(var i = 0; i < campos.length; i++){
        		constraints.push(self.createConstraint(campos[i],filtro[i],2,true));
        	}
        }
        self.getDataset(dataset,fields,constraints)*/
        //(complementoURL, metodo, filtros){
        self.getDadosAjax()
	        .pipe(function(p){
	            return p;
	        }).done(function(result){
	            d.resolve(result.values);
	        }).fail(function(data){
	            d.reject;
	        }).always(function(){
	        	//self.loading.hide();
	        });
        return d;
    },

});