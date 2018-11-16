package AudioVisual;

public class Screen implements ScreenSpec {


  String resolution;
  int refreshrate;
  int responsetime;


  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public void setResolution(String sRes) {
    resolution = sRes;
  }

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }

  public String toString() {
    return "Screen : Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime;
  }
}
