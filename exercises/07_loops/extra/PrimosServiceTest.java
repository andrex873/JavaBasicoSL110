public class PrimosServiceTest{

    public static boolean esPrimo(int numero){
        int res;
        int div = 2;
        do{
            res = (numero%div);
            if(res == 0)
                return false;
            div++;
        }while(div < numero);        
        return true;
    }

    public static void main(String args[]){        
        for(int numero = 1; numero <= 500; numero++)
            if(PrimosServiceTest.esPrimo(numero))
                System.out.println("Numero primo: " + numero);
    }
}