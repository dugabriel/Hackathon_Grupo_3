var Insight = SuperWidget.extend({
    instanceId: "",
    message: null,

    polly: {},

    //método iniciado quando a widget é carregada
    init: function () {
        AWS.config.region = 'us-east-1';
        AWS.config.update({
            "accessKeyId": "AKIAJJPFW2U6FQYWHJ2Q",
            "secretAccessKey": "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",
        });

        this.polly = new AWS.Polly({ apiVersion: '2016-06-10' });

        this.informUser();
    },

    bindings: {
        // local: {
        //     'show-message': ['click_showMessage']
        // }
    },

    informUser: function(){
        var params = this.getUserInsight();
        if (params != null) {
            this.polly.synthesizeSpeech(
                params
                , function (err, data) {
                    if (err) {
                        this.sorry();
                        console.log(err, err.stack); // an error occurred
                    }
                    else player.play(data.AudioStream); // successful response
                }
            );
        }
    },

    getUserInsight: function () {
        var params = {
            OutputFormat: "mp3",
            SampleRate: "8000",
            Text: "O Vanat é o mais lindo do mundo",
            TextType: "text",
            VoiceId: "Vitoria"
        };
        return params;
    },

    sorry: function () {
        FLUIGC.toast({
            title: '',
            message: 'Não tenho insight para você hoje :(',
            type: 'info'
        });
    }
});