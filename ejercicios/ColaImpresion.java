package ejercicios;

//FIFO: primero entra primero sale

public class ColaImpresion {
    private int [] tareas;
    private int ultimo, frente;
    private final int maxcola = 5;

    public ColaImpresion(){
        tareas = new int [maxcola];
        frente = -1;
        ultimo = -1;    //índice
    }

    public boolean estaVacia(){ //devuelve true si la cola está vacía
        return frente == -1;
    }
    public boolean estaLlena(){ //devuelve true si la pila está llena
        return ultimo == maxcola -1;
    }

    public void nuevaTarea(int tarea){
        if(estaVacia()){
            frente = 0;
        }
        ultimo ++;
        tareas[ultimo] = tarea;
    }
    public int procesarTarea(){
        int procesado = this.tareas[frente];
        frente ++;
        if(frente>ultimo){
            frente = -1;
            ultimo = -1;
        }
        return procesado;
    }
    public int verFrente(){
        return tareas[frente];
    }
    public int contTareas(int buscado){
        ColaImpresion aux = new ColaImpresion();
        int cont = 0;
        while(!estaVacia()){
            int tarea = procesarTarea();
            if(tarea == buscado){
                cont ++;
            }
            aux.nuevaTarea(tarea);  
        }
        while(!aux.estaVacia()){
            nuevaTarea(aux.procesarTarea());
        }
        return cont;
    }

}
