/**
 * Clase que determina numero mayor.
 */
public class Extra03{

    public static void main(String[] args){

        int[] num = {15, 50, 2};
        int mayor = 0;

        for(int z = 0; z < num.length; z++){
            if(num[z]>mayor)
                mayor = num[z];
        }
        System.out.println( mayor + " es el mayor.");
    }   
}