package ejercicios;

//cola frente fijo y final movible

public class ColaCaracteres {

    private final int maxcola = 10;
    private int frente, ultimo;
    private char elementos[];

    public ColaCaracteres(){
        frente=0;
        ultimo=0;
        elementos = new char[maxcola];  
    }

    public boolean estaVacia(){  //verifica si la cola está vacía
        return ultimo == 0;
    }

    public boolean estaLlena(){  //verifica si la cola está llena
        return ultimo == maxcola;
    }

    public void ingresar(char caracter){  //ingresa un caracter en la última posicion
        elementos[ultimo]= caracter;
        ultimo++;
    }

    public char borrar(){    //elimina el caracter más al frente
        char caracter = elementos[frente];
        for(int i=0; i < maxcola; i++){
        elementos[i] = elementos[i++];
        }
        return caracter;
    }

    public int cantidad(){  //muestra la cantidad de caracteres
        return ultimo;
    }


    public char mostrar(){  //muestra el caracter mas al frente sin desencolar
        return elementos[frente];
    }

}
