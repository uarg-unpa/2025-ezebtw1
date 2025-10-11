package ejercicios;

public class ColaNombres {
    private final int maxcola = 8;
    private String[]elementos;
    private int frente, ultimo;

    public ColaNombres(){
        frente = 0;
        ultimo = 0;
        elementos = new String[maxcola];
    }

    public boolean estaVacia(){
        return ultimo == 0;
    }

    public boolean estaLlena(){
        return ultimo == maxcola;
    }
}

