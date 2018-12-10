/***************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: This driver class tests (or runs) the contents from MoviePlayer by giving it some
 * sample input for each field, such as name, resolution, refreshrate, response time, and monitor
 * type.
 **************************************************************************************************/


package AudioVisual;

public class MoviePlayerDriver {
  public static void testMoviePlayer() {
    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
        40, 22), MonitorType.LCD);
    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",
        40, 22), MonitorType.LED);

    System.out.println(mp1);
    System.out.println(mp2);
  }
}