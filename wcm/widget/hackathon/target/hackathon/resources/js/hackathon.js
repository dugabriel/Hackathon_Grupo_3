var MyWidget = SuperWidget.extend({
    //variáveis da widget
    variavelNumerica: null,
    variavelCaracter: null,

    polly: new AWS.Polly({apiVersion: '2016-06-10'}),

    //método iniciado quando a widget é carregada
    init: function() {
        AWS.config.region = 'us-east-1';
        AWS.config.update({
            "accessKeyId": "XXX", //XXX: Não comitar as chaves carai
            "secretAccessKey": "YYY",
        });
    },
  
    //BIND de eventos
    bindings: {
        local: {
            'execute': ['click_executeAction']
        },
        global: {}
    },
 
    executeAction: function(htmlElement, event) {
    }

});

