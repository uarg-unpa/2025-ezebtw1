package ejercicios;
/*codificar cola tipo string, 
implementar metodo que muestre los elementos, 
obtenga y muestre la dimension de cada uno.
No se debe perder informacion
*/
public class ColaString {
    private String elementos[];
    private int frente;
    private final int maxCola=5;

    public ColaString(){
        elementos = new String[maxCola];
        frente = 0;
    }
}
