/**
 * Clase que determina numero mayor.
 */
public class Extra04{

    public static void main(String[] args){

        double x = Double.parseDouble("5"), y = Double.parseDouble("15");
        if ((Math.pow(x, 2)) + (Math.pow(y, 2)) == 1) {
            System.out.println("El punto ingresado se encuentra en el borde del circulo (centro 0,0 y radio 1)");
            System.exit(0);
        }
        if ((Math.pow(x, 2)) + (Math.pow(y, 2)) < 1) {
            System.out.println("El punto ingresado se encuentra dentro del circulo (centro 0,0 y radio 1)");
        } else {
            System.out.println("El punto indicado se encuentra fuera del circulo (centro 0,0 y radio 1)");
        }
    }   
}