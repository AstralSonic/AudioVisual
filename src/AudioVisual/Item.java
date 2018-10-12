/**=================================================================================================
 * NAME: Guilherme Pereira
 * DATE: 10/01/98
 * FILE: AudioVisualProject
 * ORG: COP 3003 - 80601
 * DESC: A program that takes in the information of a product, saves that information, and displays
 * it when the user asks for that product.
 =================================================================================================*/

package AudioVisual;

import java.util.Date;

public interface Item {

  String manufacturer = "OracleProduction";

  public void setProductionNumber(int pNum);
  // A method setProductionNumber that would have one integer parameter

  public void setName(String pName);
  // A method setName that would have one String parameter

  public String getName();
  // A method getName that would return a String

  public Date ManufactureDate();
  // A method getManufactureDate that would return a Date

  public int getSerialNumber();
  // A method getSerialNumber that would return an int

}
