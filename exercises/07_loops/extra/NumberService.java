public class NumberService{

    public static int calcularDigitos(int numero){
        int cont = 0;        
        int res;

        for(;;){
            res = numero%10;
            numero = (int)numero/10;
            cont++;            
            if(numero == 0)
                break;        
        }
        return cont;
    }

    public static int reversoNumero(int numero){
        int digitos = NumberService.calcularDigitos(numero);

        int res;
        int total = 0;
        for(;;){
            res = numero%10;
            numero = (int)numero/10;
            total += res * Math.pow(10, --digitos);
            if(numero == 0)
                break;        
        }
        return total;
    }
    
}