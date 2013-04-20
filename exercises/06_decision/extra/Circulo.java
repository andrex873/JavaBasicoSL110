public class Circulo{
    double r;
    Punto p;

    public Circulo(double r, Punto p){
        this.r = r;
        this.p = p;
    }

    public Circulo(double r, double x, double y){
        this.r = r;
        Punto p = new Punto(x, y);
        this.p = p;
    }
}