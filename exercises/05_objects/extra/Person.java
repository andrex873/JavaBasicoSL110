public class Person {
  
  public String name = "Jonathan";
  public String job = "Ice Cream Taster";

  public void display(String name){
    //1) imprimir el valor local y el valor del atributo
    /*2) apellido =name
     * name = "Javier"
     * imprimir name y apellido
     * analizar las respuestas
    */
   

   System.out.println("Valor local: " + name);
   System.out.println("Valor atributo: " + this.name);

   String apellido = name;
   name = "Javier";
   System.out.println("name: " + name);
   System.out.println("apellido: " + apellido);

  }
} // end of class
