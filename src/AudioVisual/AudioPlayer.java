/**************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: This class keeps creates the audioSpecification and mediaType fields that are later
 * used in MultimediaControl. this class inherits fields from Products and implements
 * MultimediaControl
 **************************************************************************************************/

package AudioVisual;

public class AudioPlayer extends Product implements MultimediaControl{

  String audioSpecification;      // Field
  ItemType mediaType;             // Field

  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }


  public String toString(){
    return super.toString() + "\n"
        + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;
  }
}
