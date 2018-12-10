/***************************************************************************************************
 * NAME: Guilherme Pereira
 * DESCRIPTION: Employee information is stored here. This class will ask the user to input their
 * first and last name and department ID. The code checks to see if the name is put in properly.
 * If the name is input incorrectly, then the name will be displayed as "Guest", is the department
 * is input incorrectly, then the deptID will be put in as "None01". The deptID is in reverse for
 * security measures.
 **************************************************************************************************/
package AudioVisual;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmployeeInfo {

  // Fields of class EmployeeInfo
  Scanner in;
  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Matcher m;

  public StringBuilder getName() {
    return this.name;
  }

  public String getCode() {
    return this.code;
  }

  private void setName() {
    this.name = new StringBuilder(inputName());
  }

  private  void setDeptId(String dID){
    //this.deptId = getDeptId();
    String givenId = getDeptId();
    if (validId(givenId)){
      deptId = givenId;
    }
    else {
      deptId = "None01";
    }
  }

  public String getDeptId(){
    System.out.println("Please type in your department ID.");
    String StringId = in.nextLine();
    return StringId;
  }

  private String getId(){
    return deptId;
  }

  private boolean validId(String id) {
    String REGEX = "([A-Z])([a-z][a-z][a-z]\\d\\d)";
   // boolean idCheck = m.matches();
   // idCheck = p.matcher(id);
    p = Pattern.compile(REGEX);
    m = p.matcher(id);    // Checks if id = REGEX pattern
    boolean idCheck = m.matches();  // Set true if true and false if false

    if (idCheck == true) {
      System.out.println("Matches");
    } else {
      System.out.println("No match");
    }
    return idCheck;
  }


  private void createEmployeeCode(StringBuilder name){
   String nameCopy = name.toString();

    String fname = nameCopy.substring(0, 1);
    //fname.substring(0, 0);

    int space = nameCopy.indexOf(" ");
    String lname = nameCopy.substring(space + 1, nameCopy.length());
    System.out.println(fname + lname);
    code = fname + lname;
  }

  private String inputName(){
    System.out.println("Enter your first and last name");
    String aname = in.nextLine();
    return aname;
  }

  private boolean checkName(StringBuilder name){

    if (name.toString().contains(" ")){
      createEmployeeCode(name);
      return true;
    }
    else{
      code = "Guest";
      return false;
    }
  }

  @Override
  public String toString() {
    return "EmployeeInfo{" +
        "code ='" + code + '\'' +
        ", deptId ='" + deptId + '\'' +
        '}';
  }

  public String reverseString(String id){

    String newPass;
    char letter = id.charAt(id.length());
    if (id.length() == 1){
      
    }
    return letter + reverseString(id.substring(0, id.length() - 1));
  }

  public EmployeeInfo(){
    in = new Scanner(System.in);
    setName();
    checkName(name);

    setDeptId("d");
  }
}