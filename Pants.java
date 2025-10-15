public class Pants extends Clothing {

  //INstance variables

  private boolean hasBeltLoops;
  private boolean hasZippers;
  private int pockets;


//no argument constructors

  public Pants() {
    this(0.0, "Black", "Unknown", 0, false, false, 4);
  }

//parameterized constructors


  public Pants (double price, String color, String material, int length, boolean hasBeltLoops, boolean hasZippers, int pockets) {
    super(price, color, material, length);
    this.hasBeltLoops = hasBeltLoops;
    this.hasZippers = hasZippers;
    this.pockets = pockets;
  }

  public Pants (double price, String color, String material, int length, boolean hasBeltLoops, int pockets) {
    super(price, color, material, length);
    this.hasBeltLoops = hasBeltLoops;
    this.pockets = pockets;
  }

// accessor method for hasBeltLoops

  public boolean getHasBeltLoops() {
    return hasBeltLoops;
  }

//mutator method for hasBeltLoops

  public void setHasBeltLoops(boolean hasBeltLoops) {
    this.hasBeltLoops = hasBeltLoops;
  }


//accessor method for hasZippers

  public boolean getHasZippers() {
    return hasZippers;
  }


//mutator method for hasZippers


public void setHasZippers(boolean hasZippers) {
    this.hasZippers = hasZippers;
  }



//accessor method for pockets

  public int numOfPockets() {
    return pockets;
    }



//mutator method for pockets



public void setPockets(int pockets) {
    this.pockets = pockets;
  }


  
//toString method

  public String toString() {
    return super.toString() + "\nHas Belt Loops: " + hasBeltLoops + "\nHas Zippers: " + hasZippers + "\nNum of Pockets: " + pockets;
  }
}