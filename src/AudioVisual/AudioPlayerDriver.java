package AudioVisual;

public class AudioPlayerDriver {
  public static void testAudioPlayer(){
    AudioPlayer ap1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    ap1.play();
    ap1.stop();
    ap1.next();
    ap1.previous();
    System.out.println(ap1);
    System.out.println(ap2);
  }
}
