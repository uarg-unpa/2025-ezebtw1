package tp3;

public class Pila {
    private int[]elementos;
    private int cima;
    private final int MAX = 5;

    public Pila(){
        elementos = new int[MAX];
        cima = -1;
    }
    public boolean estaVacia(){
        return (cima == -1);
    }
    public boolean estaLlena(){
        return(cima == MAX-1);
    }

    public void meter(int elem){
        cima++;
        elementos [cima]= elem;
    }

    public int sacar(int sacar){
        int aux = elementos[cima];
        cima--;
        return aux;
    }

    public int elementoCima(){
        return elementos[cima];
    }
    

}
