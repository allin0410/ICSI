//import java.util.Math;

public class Character {
  // Properties:
  // HP, strength, mana
  private int[] stats = new int[3];
  // current location of Character, x, y coordinate
  private int[] location = new int[2];
  // location where Character stars: x,y coordinate
    //x,y coordinate
  private int[] spawnLocation = new int[2];
  
  // Constructor:
  public Character(int[] stats, int[] location, int[] spawnLocation) {
    this.stats = stats;
    this.location = location;
    this.spawnLocation = spawnLocation;
    
  }
  
  @Override
  public Character(int[] spawnLocation) {
    this.spawnLocation = spawnLocation;
   this.stats[0] = Math.random();
     this.stats[1] = Math.random();
     this.stats[2] = 
     this.location[0] =
     this.location[1] =
  }
  // Methods: 
  
  // getters/setters
  public int[] getStats(){
    return this.stats;
  }
  public int[] getLocation(){
    return this.location;
  }
  public int[] getSpawnLocation(){
    return this.spawnLocation;
  }
  /*stats
   * location
   * spawnlocation*/
  
  public void setStats(int[] setStats){
    this.stats;
  }
  public void setLocation(int[] setLocation){
    this.location;
  }
  public void setSpawnLocation(int[] spawnLocation){
    this.spawnLocation;
  }
  
  
}