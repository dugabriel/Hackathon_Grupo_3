var listener = {
    // Fazemos que o código só funcione apos o carregamento completo da pagina
    // window.addEventListener('DOMContentLoaded', function () {
    result: null,
    speechAsText: '',
    isRecording: false,
    api: {},
    _invoker: {},

    initialize: function (invoker) {
        this._invoker = invoker;
        if (window.SpeechRecognition || window.webkitSpeechRecognition) {
            var speechApi = window.SpeechRecognition || window.webkitSpeechRecognition;
            // Criamos um novo objeto com a API Speech
            this.api = new speechApi();
            // Defino se a gravação sera continua ou não
            // Caso deixamos ela definida como false a gravação tera um tempo estimado 
            // de 4 a 5 segundos
            this.api.continuous = false;
            // Especifico se o resultado final pode ser alterado ou não pela compreenção da api
            this.api.interimResults = true;
            // Especifico o idioma utilizado pelo usuario
            this.api.lang = "pt-BR";

            // uso o metodo onstart para setar a minha variavel esta_gravando como true
            // e modificar o texto do botão
            this.api.onstart = function () {
                console.log('Gravando! Parar gravação.');
                listener.isRecording = true;
                listener.result = "";
                document.getElementById('texto').value = listener.result;
            };
            // uso o metodo onend para setar a minha variavel esta_gravando como false
            // e modificar o texto do botão
            this.api.onend = function () {
                listener.isRecording = false;
                console.log('Iniciar Gravação');
                console.log(listener.result);
            };
            this.api.onerror = function (event) {
                console.log(event.error);
            };
            // Com o metodo onresult posso capturar a transcrição do resultado 
            this.api.onresult = function (event) {
                // Defino a minha variavel interim_transcript como vazia
                var interim_transcript = '';

                // Utilizo o for para contatenar os resultados da transcrição 
                for (var i = event.resultIndex; i < event.results.length; i++) {
                    // verifico se o parametro isFinal esta setado como true 
                    //com isso identico se é o final captura
                    if (event.results[i].isFinal) {
                        // Contateno o resultado final da transcrição
                        listener.speechAsText += event.results[i][0].transcript;
                    } else {
                        // caso ainda não seja o resultado final vou contatenado os resultados obtidos
                        interim_transcript += event.results[i][0].transcript;
                    }
                    // Verifico qual das variaveis não esta vazia e atribuo ela no variavel resultado
                    listener.result = listener.speechAsText || interim_transcript;
                    // Escrevo o resultado no campo da textarea
                    document.getElementById('texto').value = "";
                    document.getElementById('texto').value = listener.result;
                    setTimeout(function(){
                        var response = document.getElementById('texto').value;
                        if(response != ""){
                            FLUIGC.toast({
                                title: ':)',
                                message: 'Recebi seu comando, aguarde um instante!',
                                type: 'info'
                            });
                            setTimeout(function(){
                                listener._invoker.command(response);
                            }, 150);
                        }
                        listener.result = "";
                        document.getElementById('texto').value = "";

                    }, 4000);
                }
            };
        }
        else {
            // Caso não o navegador não apresente suporte ao Speech API apresentamos a seguinte mensagem
            console.log('Navegador não apresenta suporte a web speech api');
        }
        return this;
    }
}