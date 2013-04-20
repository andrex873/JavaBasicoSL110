public class OperacionesService{

    public final double CUADRADO = 2;

    public boolean puntoDentroDelCirculo(Circulo c, Punto p){

        double r2 = Math.pow(c.r, CUADRADO);
        boolean retorno = true;

        double resultado = Math.pow((c.p.x - p.x), CUADRADO) + Math.pow((c.p.y - p.y), CUADRADO);
        if(r2 == resultado){
            System.out.println("El punto se encuentra sobre la linea del circulo.");
        } else if(r2>resultado){
            System.out.println("El punto se encuentra dentro del circulo.");
        } else if(r2 < resultado){
            System.out.println("El punto se encuentra fuera del circulo.");
            retorno = true;
        }
        return retorno;
    }
}