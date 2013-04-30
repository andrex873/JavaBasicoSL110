public class Extra02 {

    protected String param;


    public void myMethod(){
        System.out.println("Metodo principal");
        public void myMethod2(){
            System.out.println("Metodo interno");
        }
        
    }

    public static void main(String[] args){
        Extra01 o = new Extra01();
        o.myMethod();        
    }
    
}