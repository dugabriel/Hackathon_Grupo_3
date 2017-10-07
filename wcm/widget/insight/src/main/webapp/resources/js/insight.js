var Insight = SuperWidget.extend({
    instanceId: "",
    message: null,

    polly: {},
    
    //método iniciado quando a widget é carregada
    init: function() {
        AWS.config.region = 'us-east-1';
        AWS.config.update({
            "accessKeyId": "XXX", //XXX: Não comitar as chaves carai
            "secretAccessKey": "YYY",
        });

        polly = new AWS.Polly({apiVersion: '2016-06-10'});
    },

    bindings: {
        local: {
            'show-message': ['click_showMessage']
        }
    },

    showMessage: function () {
        $div = $('#helloMessage_' + this.instanceId);
        $message = $('<div>').addClass('message').append(this.message);
        $div.append($message);
    }
});