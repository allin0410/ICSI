import java.util.Random;

public class Character {
  // Properties:
  // HP, strength, mana, speed
  private int[] stats = new int[4]; 
  // current location of Character: x,y coordinate
  private int[] location = new int[2]; 
  // location where Character starts: x,y coordinate
  private int[] spawnLocation = new int[2];; 

  // Constructor:
  public Character(int[] stats, int[] location, int[] spawnLocation) {
    this.stats = stats;
    this.location = location;
    this.spawnLocation = spawnLocation;
  }
  
  /*@Override */
  public Character(int[] spawnLocation) {
    Random rand = new Random();  // generates random integers
    this.spawnLocation = spawnLocation;  // starting position
    this.stats[0] = rand.nextInt(500);  // stats: HP
    this.stats[1] = rand.nextInt(100);  // stats: strength
    this.stats[2] = rand.nextInt(100);  // stats: mana
    this.stats[3] = rand.nextInt(100);  // stats: speed
    this.location[0] = spawnLocation[0];  // location: x coordinate
    this.location[1] = spawnLocation[1];  // location: y coordinate
  }
  
  // Methods:

  // getters/setters
  public int[] getStats() {
    return this.stats;
  }
  
  public int[] getLocation() {
    return this.location;
  }
  
  public int[] getSpawnLocation() {
    return this.spawnLocation;
  }
  
  public void setSpawnLocation(int[] spawnLocation) {
    this.spawnLocation = spawnLocation;
  }
  
  public void setStats(int[] stats) {
    this.stats = stats;
  }
  
  public void setLocation(int[] location) {
    this.location = location;
  }

  // Move Methods
  public boolean moveUp() {
    this.location[1] += this.stats[3];
    return true;
  }
  
  public boolean moveDown() {
    this.location[1] -= this.stats[3];
    return true;
  }
  
  public boolean moveRight() {
    this.location[0] += this.stats[3];
    return true;
  }
  
  public boolean moveLeft() {
    this.location[0] -= this.stats[3];
    return true;
  }
  
  
}