public class Order{
    
    long orderValue = 0;

    int itemQuantity = 1000000000;

    int itemPrice = 6000006;

    public void calculateTotal(){

        System.out.println("Cantidad: " + itemQuantity);
        System.out.println("Precio unitario: " + itemPrice);
        System.out.println();
        orderValue = (itemQuantity * itemPrice);
        System.out.println("[SIN CAST] El total de la orden es: " + orderValue);

        orderValue = ((long)itemQuantity * (long)itemPrice);
        System.out.println("[CON CAST] El total de la orden es: " + orderValue);

    }

}