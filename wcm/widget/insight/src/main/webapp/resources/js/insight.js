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
        this.ia();

        this.polly = new AWS.Polly({ apiVersion: '2016-06-10' });
        this.informUser();

        this.voice = listener.initialize(this);
        this.bindKeyboard();
    },

    bindings: {
        local: {
            'listen': ['click_listen']
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
                    }, 150);
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
        params.Text = "Tudo bem, fica pra outra hora!"
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
    }
});