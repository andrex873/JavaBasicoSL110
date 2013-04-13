public class Temperature{

    double tempeF = 50.29;

    public void calculateCelsius(){
            double tempeC = (tempeF - 32) * 5 / 9;
            System.out.println(tempeF + " grados fahrenheit equivalen a " + tempeC + " grados centigrados.");
    }

    
}