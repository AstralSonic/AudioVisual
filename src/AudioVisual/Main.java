/**================================================================================================
 * Main will run the program and show the products listed underneath ItemType.
 */
package AudioVisual;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String args[]) {
    //AudioPlayerDriver.testAudioPlayer();
    //ScreenDriver.testScreen();
    ProcessFiles pF = new ProcessFiles(); // When creating an object, you call the constructor.

    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.test1();
    testCollections.myCollections();


    /*
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
*/
  }
}

class Widget extends Product {

  public Widget(String name) {

    super(name);
  }
}
/*
You are going to store a collection of the devices as they come off the production line. Choose an
appropriate Java Collection and create a driver class that demonstrates its use. You should also
demonstrate the Collections.sort method
 */

