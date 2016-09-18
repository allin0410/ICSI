// Name: Johnny Zavala            ID: 001161399
public class Item
{
  /*Declares instance variables*/
  private String name;
  private int weight;
  
  /**
   * Gets the value of the instance variable name in this class.
   * @return the name of the object
   */  
  public String getName()
  {
    return name;
  }
  
  /**
   * Gets the value of the instance variable weight in this class.
   * @return the weight of the object
   */  
  public int getWeight()
  {
    return weight;
  }
  
  /**
   * Prints the description of the object, including name and weight.
   */
  public void examine()
  {
    System.out.println("Description: This is item #n. The name is "+getName()+". The weight is "+getWeight()+".");
  }
  
  
} //end class