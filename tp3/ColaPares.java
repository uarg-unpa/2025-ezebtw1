package tp3;

public class ColaPares {
    private int elementos[];
    private int ultimo;
    private final int maxcola = 10;

    public ColaPares(){
        elementos = new int [maxcola];
        ultimo = -1;
    }

    public boolean estaVacia(){
        return ultimo == -1;
    }
    public boolean estLlena(){
        return ultimo == maxcola -1;
    }

    public void insertar(int elem){
        ultimo++;
        elementos[ultimo] = elem;
    }
}
