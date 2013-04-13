public class Customer{

    private int id = 1;

    private char estado = 'N';

    private double totalComprasAnio = 0;

    public void displayCustomerInfo(){
        System.out.println("Id = " + id);    
        System.out.println("Estado actual = " + estado);    
        System.out.println("Compas al año = " + totalComprasAnio);    
    }

}