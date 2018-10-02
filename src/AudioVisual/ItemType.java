/**================================================================================================
 * This is where the items/products are stored when the customer or client asks for them. An acronym
 * will also be shown next to the product.
 =================================================================================================*/

package AudioVisual;

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  public final String info;

  ItemType(String info) {
    this.info = info;
  }
}
