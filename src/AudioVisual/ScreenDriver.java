package AudioVisual;

public class ScreenDriver {

  public static void testScreen() {
    Screen s1 = new Screen("600x400", 40, 22, MonitorType.LED);
    System.out.println(s1);
  }
}