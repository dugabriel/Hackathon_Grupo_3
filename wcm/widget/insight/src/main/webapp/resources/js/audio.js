/**
 * Executa audio 
 * playByteArray(result.AudioStream)
 * @param {Uint8Array} AudioStream 
 */
var player = {
    context: new AudioContext(),
    play: function (bytes) {
        var buffer = new Uint8Array(bytes.length);
        buffer.set(new Uint8Array(bytes), 0);

        this.context.decodeAudioData(buffer.buffer, this._play);
    },
    _play: function(audioBuffer) {
        //this aqui já é o audio context
        var source = this.createBufferSource();
        source.buffer = audioBuffer;
        source.connect(this.destination);
        source.start(0);
    },
    params:function(){
        return {
            OutputFormat: "mp3",
            SampleRate: "8000",
            Text: "O Vanat é o mais lindo do mundo",
            TextType: "text",
            VoiceId: "Vitoria"
        };
    }
}