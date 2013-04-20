/**
 * Clase que determina numero par o impar.
 */
public class Extra02{    

    public static void main(String[] args){

        for(int z = 1; z <= 10; z++){
            if( (z%2) == 0){
                System.out.println( z + " es par");
            } else {
                System.out.println( z + " es impar");
            }
        }
    }
}