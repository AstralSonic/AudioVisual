/**================================================================================================
 * Product saves the information of the products.
 =================================================================================================*/

package AudioVisual;

import java.util.Date;

public abstract class Product implements Item {

  //Fields to Product:
  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;

  private static int currentProductionNumber = 1; // Integer class variable.

  Product(String name){
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();

  }

  public void setProductionNumber (int pNum){

  }
  // A method setProductionNumber that would have one integer parameter

  public void setName (String pName){
    name = pName;
  }

  public String getName() {
    return name;
  }

  public Date ManufactureDate(){
    return manufacturedOn;
  }


  public int getSerialNumber(){
    return serialNumber;
  }
}
