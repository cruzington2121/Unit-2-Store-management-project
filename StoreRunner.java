public class StoreRunner {
  public static void main(String[] args) {


  //----- Clothing Objects -----
  //Using no-argument constructor
  Clothing basicClothing = new Clothing();
    System.out.println("Basic Clothing: ");
    System.out.println(basicClothing);
    System.out.println();

  //Using full parameterized constructor
  Clothing jacket = new Clothing(49.99, "Blue", "Leather", 32);
    System.out.println("Jacket: ");
    System.out.println(jacket);
    System.out.println();

  // ----- Shirt Objects -----
  //Using no argument constructor
  Shirt defaultShirt = new Shirt();
    System.out.println("Default Shirt: ");
    System.out.println(defaultShirt);
    System.out.println();

  //Using parameterized constructor
  Shirt cottonShirt = new Shirt(9.99, "White", "Cotton", 28, true, true);
    System.out.println("Cotton Shirt: ");
    System.out.println(cottonShirt);
    System.out.println();

  //Modifying using mutator methods
  cottonShirt.setColor("Dark Blue");
  cottonShirt.setHasCollar(false);
  System.out.println("Updated Cotton Shirt");
  System.out.println(cottonShirt);
  System.out.println();

  // ----- Pants Objects -----
  //Using a no-argument constructor
  Pants defaultPants = new Pants();
    System.out.println("Default Pants:");
    System.out.println(defaultPants);
    System.out.println();

  //Using a parameterized constructor
  Pants jeans = new Pants(39.99, "Blue", "Denim", 34, true, true, 5);
    System.out.println("Jeans:");
    System.out.println(jeans);
    System.out.println();  

  //Modifying Pants using mutator methods
  jeans.setPockets(6);
  jeans.setHasZippers(false);
  System.out.println("Updated Jeans:");
  System.out.println(jeans);
  }
}