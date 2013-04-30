public class Shirt {

    /**
     * Atributo que contine el id de la camiseta
     */
    public int shirtID = 0; 

    /**
     * Atributo que contiene la descripción de la camiseta
     */
    public String description = "-description required-"; 

    /**
     * Atrinuto que contiene el pecio de la camiseta.
     */
    public double price = 0.0; 

    /**
     * Atrinuto que contiene la cantidad de camisetas.
     */
    public int quantityInStock = 0; 

    /**
     * Descripción del método displayInformation e imprime las salida standar
     * de los aributos
     * @author amendez
     * @version 1
     */
    public void displayInformation() {        

        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    /**
     * Atributo que contiene el codigo de color de una camiseta.
     */
    public char colorCode = 'U';
} 
