public class Extra01 {

    protected String param;


    public void myMethod(){
        System.out.println("Utilizando myMethod con return");
        return;
    }

    public static void main(String[] args){
        Extra01 o = new Extra01();
        o.myMethod();        
    }
    
}