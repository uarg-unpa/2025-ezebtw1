package tp3;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima, contador;
    private final int MAX = 10; // Capacidad máxima de la pila
    

    // Constructor: inicializa el array, la cima y el contador
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
            cima = -1;
            contador = 0;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia()  {
      return (cima == -1); // devuelve true si cima indica que la pila está vacía
        }
    // Verifica si la pila está llena
    public boolean estaLlena() {
       return (cima == MAX - 1); // devuelve true si cima está en el límite del array
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        cima++;
    elementos [cima] = elem; // incrementa cima y asigna el elemento

    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        int aux = elementos[cima];
        cima--;
        return aux;   // guarda el elemento de la cima, decrementa cima y lo devuelve
        }

    public int cantOcurrencias(int buscado){ // calcula la cantidad de ocurrencias
        PilaEnteros aux = new PilaEnteros();
        contador = 0;

        while(!estaVacia()){
            int elemento = sacar();
            if(elemento == buscado){
                contador++;
            }
            aux.meter(elemento);
        }
        while(!aux.estaVacia()){ //restaurar pila
            meter(aux.sacar());
        }
        return contador;
    }

}