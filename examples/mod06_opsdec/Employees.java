public class Employees {

  //public String name1 = "Andres";
  //public String name2 = "Andres";

  public String name1 = new String("Andres");
  public String name2 = "Andres";



  public void areNamesEqual() {

    if (name1.equals(name2)) {
      System.out.println("Same name.");
    } else {
      System.out.println("Different name.");
    }

    System.out.println();
    System.out.println("Same? " + (name1 == name2));
    System.out.println("Same? " + (name1.equals(name2)));
    System.out.println("Same? " + (name1 == "Andres"));


  }
}
