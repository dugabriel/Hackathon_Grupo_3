var Insight = SuperWidget.extend({
    instanceId: "",
    message: null,

    polly: {},
    voice: {},

    //método iniciado quando a widget é carregada
    init: function () {
        this.polly = new AWS.Polly({ apiVersion: '2016-06-10' });
        this.informUser();

        this.voice = listener.initialize(this);
        this.listen();
    },

    bindings: {
        local: {
             'listen': ['click_listen']
        }
    },

    // Capturamos a ação do click no botão e iniciamos a gravação ou a paramos
    // dependendo da variavel de controle isRecording
    listen: function(){
        (this.voice.isRecording) ? this.voice.api.stop() : this.voice.api.start();
    },

    command: function(c){
        console.log("Commando="+c);
    },

    informUser: function(){
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
    }
});