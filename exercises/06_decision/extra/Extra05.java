public class Extra05{

    public static void main(String[] args){
        
        Circulo c = new Circulo(10.5, 10.0, 8.0);
        Punto p = new Punto(10.0, 5.0);

        OperacionesService o = new OperacionesService();
        boolean res = o.puntoDentroDelCirculo(c, p);
    }
    
}