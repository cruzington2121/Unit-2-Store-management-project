public class Clothing { 
// set instance variables

  private double price;
  private String color;
  private String material;
  private int length;


// no arguement consutrctor


 public Clothing() {
   this(0.0, "Black", "Unknown", 0);
 }


//Parameterized constructor

  public Clothing(double price, String color, String material, int length) {
    this.price = price;
    this.color = color;
    this.material = material;
    this.length = length;
  }


//Parameterized constructor 2

  public Clothing (double price, String color) {
    this.price = price;
    this.color = color;
  }


//   accessor method for price

  public double getPrice() {
    return price;
  }


//   mutator method for price

  public void setPrice(double price) {
    this.price = price;
  }


//ACCESSOR METHOD FOR color

  public String getColor() {
    return color;
  }

//MUTATOR METHOD FOR color

  public void setColor(String color) {
    this.color = color;
  }

//ACCESSOR METHOD FOR material

  public String getMaterial() {
    return material;
  }

//MUTATOR METHOD FOR material

  public void setMaterial(String material) {
    this.material = material;
  }

//ACCESSOR METHOD FOR LENGTH

  public int getLength() {
    return length;
  }

//MUTATOR METHOD FOR LENGTH

  public void setLength(int length) {
    this.length = length;
  }

//toString Method

  public String toString() {
    return "Price: " + price + "\nColor: " + color + "\nMaterial: " + material + "\nLength: " + length;
  }
  
}