/**************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: This is a driver class that tests out the media player class by passing in sample
 * arguments into the parameters.
 **************************************************************************************************/


package AudioVisual;

import javax.management.monitor.Monitor;

public class PlayerDriver {

  public static void test1(){
    MultimediaControl mc1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MultimediaControl ac1 = new AudioPlayer("iPod Mini", "MP3");
  ac1.next();
  ac1.play();
  ac1.previous();
  ac1.stop();
  mc1.next();
  mc1.play();
  mc1.previous();
  mc1.stop();
  }
}
