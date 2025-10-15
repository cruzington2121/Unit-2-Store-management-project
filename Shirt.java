public class Shirt extends Clothing {


//INstance variables


  private boolean hasSleeves;
  private boolean hasCollar;


//no argument constructors

  public Shirt() {
    this(0.0, "Black", "Unknown", 0, true, false);
  }

//parameterized constructors

  public Shirt(double price, String color, String material, int length, boolean hasSleeves, boolean hasCollar) {
    super(price, color, material, length);
    this.hasSleeves = hasSleeves;
    this.hasCollar = hasCollar;
  }

  //Parameterized constructor

    public Shirt(double price, String color, String material, int length, boolean hasSleeves) {
    super(price, color, material, length);
    this.hasSleeves = hasSleeves;
  }

// accessor method for hasSleeves

  public boolean getHasSleeves() {
    return hasSleeves;
  }

//mutator method for hasSleeves

  public void setHasSleeves(boolean hasSleeves) {
    this.hasSleeves = hasSleeves;
  }


//accessor method for hasCollar

  public boolean getHasCollar() {
    return hasCollar;
  }


//mutator method for hasCollar

  public void setHasCollar(boolean hasCollar) {
    this.hasCollar = hasCollar;
  }

//toString method


  public String toString() {
    return super.toString() + "\nHas Sleeves: " + hasSleeves + "\nHas Collar: " + hasCollar;
  }

}