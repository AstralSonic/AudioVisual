/**================================================================================================
 * Product saves the information of the products.
 =================================================================================================*/

package AudioVisual;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product>{

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

  public void setProductionNumber(int pNum){
    currentProductionNumber = pNum;
  }
  // A method setProductionNumber that would have one integer parameter

  public void setName(String pName){
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

  public String toString(){
    return "Manufacturer : " + Item.manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.name);     // I am comparing the name field of one object to the other
  }
}