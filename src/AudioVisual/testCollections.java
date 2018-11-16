package AudioVisual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testCollections {

  public static ArrayList<Product> myCollections() {
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    Collections.sort(products); // Lists the products in ascending order
    print(products);
    return products;

  }
    public static <T> void print(List<T> allTypes) {
      for(T allProducts : allTypes){  // allProducts is a placeholder.
        System.out.println(allProducts); // The for each loop prints until the end of array
      }
  }
}
