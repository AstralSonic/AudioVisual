package AudioVisual;

public class MoviePlayer extends Product implements MultimediaControl{

  // Fields

  Screen screen;                 // Screen
  MonitorType monitorType;       // Monitor Type

  @Override
  public void play() {
    System.out.println("Playing movie");
  }
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }
  @Override
  public void previous() {
    System.out.println("Previous movie");
  }
  @Override
  public void next() {
      System.out.println("Next movie");
    }

  MoviePlayer(String name, Screen screen, MonitorType monitorType){
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;


    // These are giving me null types
    }

  public String toString(){
    return super.toString() + "\n" + screen.toString() + "\n"
        + monitorType.toString();
  }
}