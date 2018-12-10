/***************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: This class extends from Product (inherits the fields from Product) and implements
 * MultimediaControl (because it is an interface, therefore it cannot be inherited). The purpose of
 * this class is to give commands for movie player devices to let the user know when the audio is
 * playing, stopping, going next or returning to a previous audio.
 ***************************************************************************************************/


package AudioVisual;

public class MoviePlayer extends Product implements MultimediaControl{

  Screen screen;
  MonitorType monitorType;

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
    }

  public String toString(){
    return super.toString() + "\n" + screen.toString() + "\n"
        + monitorType.toString();
  }
}