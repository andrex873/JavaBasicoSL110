public class Shirt {

  public int shirtID = 0; // Default ID for the shirt
  public String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'Z';
  public double price = 0.0; // Default price for all shirts
  public int quantityInStock = 0; // Default quantity for all shirts
  
  // This method displays the values for an item
  public void displayInformation() {
  
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description: " + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);
    System.out.println("*****************************************");

  } // end of display method
} // end of class



