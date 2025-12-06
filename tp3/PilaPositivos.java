package tp3;

public class PilaPositivos {
    int [] elementos; 
    int cima;
    final int maxpila = 10;

    public PilaPositivos(){
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return (cima == -1);
    }
    public boolean estaLlena(){
        return (cima == maxpila -1);
    }

    public void meter(int elem){
        if(elem >= 0){
            cima ++;
            elementos[cima] = elem;
        }
    }
    public int sacar(){
        int aux = elementos [cima];
        cima--;
        return aux;
    }
}
