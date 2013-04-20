/**
 * Clase que determina el estado de un liquido por su temperatura.
 */
public class Extra01{

    private final int MAX_TEMP_LIQUIDO = 20;
    private final int MAX_TEMP_SOLIDO = 40;
    private final int MAX_TEMP_VAPOROSA = 60;

    public void comprobarEstado(int temp){
        String estado = "El estado es: ";

        System.out.println("Temperatura: " + temp);
        if(temp <= MAX_TEMP_LIQUIDO){
            System.out.println(estado + "LIQUIDO");
        } else if(temp <= MAX_TEMP_SOLIDO){
            System.out.println(estado + "SOLIDO");
        } else if(temp <= MAX_TEMP_VAPOROSA){
            System.out.println(estado + "VAPOROSA");
        }
        System.out.println("***********************************");
    }
    public static void main(String[] args){
        Extra01 t = new Extra01();
        t.comprobarEstado(20);
        t.comprobarEstado(32);
        t.comprobarEstado(60);
    }
}