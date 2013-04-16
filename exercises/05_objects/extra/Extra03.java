public class Extra03 {    


    public void cambiarValor(String datos){
        datos = "Ahora tengo otro valor";
    }

   
  public static void main (String args[]) {
 
    String nombre = "Andrés Méndez Juanias";
    Extra03 obj = new Extra03();    

    System.out.println("Valor inicial: " + nombre);
    obj.cambiarValor(nombre);
    System.out.println("Valor Final: " + nombre);    

  } 
}
