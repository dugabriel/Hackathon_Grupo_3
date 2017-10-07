/**
 * Executa audio 
 * playByteArray(result.AudioStream)
 * @param {Uint8Array} AudioStream 
 */
var player = {
    context : new AudioContext()
    , play : function( bytes ) {
        var buffer = new Uint8Array( bytes.length );
        buffer.set( new Uint8Array(bytes), 0 );
    
        context.decodeAudioData(buffer.buffer, play);
    }
}