public class NumberServiceTest{

    public static void main(String args[]){
        int num = 542369;
        int digitos = NumberService.calcularDigitos(num);
        System.out.println("Digitos del número " + num + ": " + digitos);

        int reverso = NumberService.reversoNumero(num);
        System.out.println("Reverso del número " + num + ": " + reverso);
    }
}