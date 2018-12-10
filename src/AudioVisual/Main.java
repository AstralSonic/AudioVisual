/***************************************************************************************************
 * NAME: Guilherme Pereira
 * COURSE: OP 3003
 * DESCRIPTION: This program is similar to a shopping list program in which the user will be able
 * view products that have been put into the system. Employees will be able to create their own
 * profile with their name and user ID for the system to keep track of and can add new items into
 * the line of their sale products.
 * Main will run the program and show the products listed underneath ItemType.
 **************************************************************************************************/
package AudioVisual;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String args[]) {
    //AudioPlayerDriver.testAudioPlayer();
    //ScreenDriver.testScreen();


    EmployeeInfo EI = new EmployeeInfo();
    System.out.println(EI.toString());

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