/*
 ICSI 213 Data Structure
 Chae Bean Kang
 */
 
import java.util.Scanner;

/*
 This class tests the parent class Item and its child classes, Armor, Food, and Weapon.
 */
public class Main
{
  
public static void main(String[] args) //using for testing
  {
  
    /*
     Tests Item Class
     */
    Item objectItemOne = new Item();
    System.out.println("This is general item's name: "+objectItemOne.getName());
    System.out.println("This is general item's weight: "+objectItemOne.getWeight());
    objectItemOne.examine(); //prints the description of general item
    System.out.print("\n"); //to separates outputs of one class from another class -- organizes things
    
    /*
     Tests Weapon Class
     */
    Weapon objectWeaponOne = new Weapon();
    System.out.println("This is weapon's name: "+objectWeaponOne.getName());
    System.out.println("This is weapon's weight: "+objectWeaponOne.getWeight());
    objectWeaponOne.examine();
    System.out.println("This is weapon's damage: "+objectWeaponOne.getDamage() + "\n");
    
    /**
     * Tests Armor Class
     */
    Armor objectArmorOne = new Armor();
    System.out.println("This is armor's name: "+objectArmorOne.getName());
    System.out.println("This is armor's weight: "+objectArmorOne.getWeight());
    objectArmorOne.examine();
    System.out.println("This is armor's defense: "+objectArmorOne.getDefense() + "\n");
    
    /**
     * Tests Food Class
     */
    Food objectFoodOne = new Food();
    System.out.println("This is food's name: "+objectFoodOne.getName());
    System.out.println("This is food's weight: "+objectFoodOne.getWeight());
    objectFoodOne.examine();
    System.out.println("This is food's nutrition: "+objectFoodOne.getNutrition());
    
    Scanner h = new Scanner(System.in); //Creating Scanner object
    System.out.println("Please input quantity:"); //Asking the user to input new quantity
    objectFoodOne.setQuantity(h.nextInt()); //takes the entered input and sends to Food class's set method
    
    System.out.println("This is food's new quantity: "+objectFoodOne.getQuantity());
    
  } //end main
}