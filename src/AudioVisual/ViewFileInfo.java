/**************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: The purpose of this driver class  will read the information from the
 * TestResults.txt file and display the contents to the console. If the file does not exist, a try
 * - catch statement will catch the error and let the user know that the file is not there.
 **************************************************************************************************/



package AudioVisual;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ViewFileInfo {

  public static void main(String[] args) {

    FileReader FR = null;
    try {
      FR = new FileReader("C:\\Linetest\\TestResults.txt");
      int i;
      while ((i = FR.read()) != -1) {
        System.out.println((char) i);
      }
      FR.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
      System.out.println("File could not be found.");
    } catch (IOException ex) {
      ex.printStackTrace();
      System.out.println("Problem with file.");
    }
  }
}
