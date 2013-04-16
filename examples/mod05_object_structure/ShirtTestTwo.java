public class ShirtTestTwo {

    public static void main (String args[]) {

        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt.displayInformation();
        yourShirt.displayInformation();

        myShirt.colorCode='R';
        yourShirt.colorCode='G';        
        myShirt = yourShirt;
        
        myShirt.price = 12.3;
        yourShirt.price = 13.2;

        myShirt.displayInformation();    
        yourShirt.displayInformation();

    } 
}

