// Name: Johnny Zavala            ID: 001161399
public class Food extends Item
{
  /*Declares instance variables*/
  private int nutrition;
  private int quantity;
  
  /**
   * Gets the value of the instance variable nutrition in this class.
   * @return the name of the object
   */
  public int getNutrition()
  { 
    return nutrition;
  }
  
  /**
   * Gets the value of the instance variable quantity in this class.
   * @return the name of the object
   */
  public int getQuantity()
  {
    return quantity;
  }
  
  /**
   * Sets the value of the instance variable quantity in this class.
   * @param newQuantity the new quantity as set by the user
   */
  public void setQuantity(int newQuantity)
  {
    quantity = newQuantity;
  }
  
} // end class