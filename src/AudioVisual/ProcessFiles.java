/**************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: Stores the results of the tests and who carried out that test to a file for
 * archiving purposes
 **************************************************************************************************/


package AudioVisual;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {
  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {

    p = Paths.get("C:\\LineTests"); // Root directory
    p2 = Paths.get("TestResults.txt");  // Added to the end of the root directory
    p3 = p.resolve(p2);
    System.out.println("Combined: " + p3);
    createDirectory();
  }

  private void createDirectory(){ // Get the folder not the file
    try {
      if (Files.notExists(p)) {
        System.out.println("File was successfully created\n");
        Files.createDirectory(p);
      }
    } catch (Exception ex) {
      System.out.println("Problem creating directory\n");
      ex.printStackTrace(); // Prints the strack trace on the err. output stream.
    }
  }

  public void writeFile(EmployeeInfo emp) throws IOException {
    FileWriter iWriter = new FileWriter(String.valueOf(p3), true);
    PrintWriter oWriter = new  PrintWriter(iWriter);

    oWriter.println(emp.toString());
    oWriter.close(); // Closes the output.

  }

  public void writeFile(ArrayList<Product> products) throws IOException {
    FileWriter iWriter = new FileWriter(String.valueOf(p3), true);
    PrintWriter oWriter = new  PrintWriter(iWriter);

    for (Product p : products) {
      oWriter.println(p.toString());
    }
    oWriter.close(); // Closes the output.
  }
}
  // public void WriteFile(ArrayList<Product> products) throws IOException

  /*
 The following new methods have to be defined:
 private void CreateDirectory()
 public void WriteFile(EmployeeInfo emp) throws IOException
 public void WriteFile(ArrayList<Product> products) throws IOException
   */


