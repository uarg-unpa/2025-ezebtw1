package ejercicios;

//FIFO: primero entra primero sale

//cola circular con frente y final movible 

/* 
Implementa una clase ColaNombres que use una cola circular con frente y final movibles
implementar métodos:
mostrar estado de la cola (esta vacía, llena)
encolar(), desencolar() (respetando la cola circular) 
mostrar frente sin desencolar (peek) (evitar acceder directamente a elementos[frente])
En el main: probar encolando 8 nombres y desencolando 3
*/

public class ColaNombres {
    private final int maxcola = 8;
    private String[]nombres;
    private int frente, ultimo;

    public ColaNombres(){
        frente = -1;
        ultimo = -1;
        nombres = new String[maxcola];
    }

    public boolean estaVacia(){
        return ultimo == -1;
    }
    public boolean estaLlena(){
        return (ultimo + 1) % maxcola == frente;
    }

    public void encolar(String nombre){
        if(estaVacia()){
            frente = 0;
        }
        ultimo = (ultimo + 1) % maxcola;
        nombres [ultimo] = nombre;
    }
    public String desencolar(){
        String desencolado = this.nombres[frente];
        int nuevoFrente = (frente + 1) % maxcola;
        if(nuevoFrente == ultimo){
            frente = -1;
            ultimo = -1;
        }
        else{
            frente = nuevoFrente;
        }
        return desencolado;
    }
    public String verFrente(){
        return this.nombres[frente];
    }
    public int cantidadNombres(){
        return ultimo;
    }
}

