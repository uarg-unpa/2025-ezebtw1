package ejercicios;

public class PilaLibros {
    int maxpila=10;
    Libro [] elementos;
    int cima;

    public PilaLibros(){
        elementos = new Libro[maxpila];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima == -1);
    }
    public boolean estaLlena(){
        return (cima == maxpila -1);
    }
    public void meter(Libro e){
        cima++;
        elementos[cima] = e;
    }
    public Libro sacar(){
        Libro aux = elementos[cima];
        cima--;
        return aux;
    }
}
