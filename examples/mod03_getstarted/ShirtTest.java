/**
 * Clase de prueba donde se encuentra el método Main.
 * @version 1
 */
public class ShirtTest {
    
    /**
     * Método Main de la clase
     * @param  args[] Argumentos pasados por pantalla.
     */
    public static void main (String args[]) {

        Shirt myShirt = new Shirt(15);
        myShirt.displayInformation();
        int mival = myShirt.shirtID;
        System.out.println("---------------- " + mival);
   	}
}