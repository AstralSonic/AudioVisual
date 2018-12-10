package AudioVisual;

public class TestProductionLine extends EmployeeInfo {

 public static void main(String[]args){
   EmployeeInfo employee = new EmployeeInfo();

   AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
   System.out.println(a1.toString() + employee.toString());
 }
}
