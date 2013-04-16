public class CustomerTest{

    public static void main(String[] args){
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.customerID = 100;
        c1.name = "Customer uno";
        c1.emailAddress = "customer1@correo.com";

        c2.customerID = 200;
        c2.name = "Customer dos";
        c2.emailAddress = "customer2@correo.com";

        c1.displayCustomerInfo();
        c2.displayCustomerInfo();

    }
}