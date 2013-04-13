public class Person {
  
    public int ageYears = 80;

    public void calculateAge() {

        
        int ageDays = ageYears * 365;
        long edadMinutos = ageDays * 24L * 60;
        long ageSeconds = edadMinutos * 60;
        long edadMiliSegundos = ageSeconds * 1000;

        System.out.println("Su edad en años es: " + ageYears);
        System.out.println("Su edad en dias es: " + ageDays);
        System.out.println("Su edad en minutos es: " + edadMinutos);
        System.out.println("Su edad en segundos es: " + ageSeconds);
        System.out.println("Su edad en milisegundos es: " + edadMiliSegundos);

        System.out.println();
  
    } // end of calculateAge method
} // end of class