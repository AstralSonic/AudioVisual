/**================================================================================================
 * Main will run the program and show the products listed underneath ItemType.
 */
package AudioVisual;

public class Main {

  public static void main(String args[]) {
    AudioPlayerDriver.testAudioPlayer();
    /*
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());
*/
    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }

  }
}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

}

