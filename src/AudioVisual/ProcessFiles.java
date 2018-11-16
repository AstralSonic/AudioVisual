package AudioVisual;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProcessFiles {
  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {
    p = Paths.get("C:\\LineTests"); // Root directory
    p2 = Paths.get("TestResults.txt");  // Added to the end of the root directory
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  private void CreateDirectory(){ // Get the folder not the file
    try {
      if (Files.notExists(p)) {
        Files.createDirectory(p);
        System.out.println("File was successfully created\n");
      }
    } catch (Exception ex) {
      System.out.println("Problem creating directory\n");
    }
  }

  public void WriteFile(String emp) throws IOException{
  }
  // public void WriteFile(ArrayList<Product> products) throws IOException

  /*
 The following new methods have to be defined:
 private void CreateDirectory()
 public void WriteFile(EmployeeInfo emp) throws IOException
 public void WriteFile(ArrayList<Product> products) throws IOException
   */

}
