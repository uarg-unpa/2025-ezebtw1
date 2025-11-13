package parcial;

//Parcial tema 1

public class Q2{
    private int [] elementos;
    private int frente, ultimo;
    private final int maxcola = 10;

    public Q2(){
        elementos = new int[maxcola];
        frente = -1;
        ultimo = -1;
    }

    //calcula y devuelve si la cola de enteros es mayor a q2
    public boolean estaVacia(){
        return frente == -1;
    }
    public boolean estaLlena(){
        return ultimo == maxcola -1;
    }
    public int cantidad(){
        return ultimo;
    }

}
