package parcial;

public class PilaIntMain {
    public static void main(String[] args) {
        PilaEnteros p1 = new PilaEnteros();       
        PilaEnteros aux = new PilaEnteros();
       
        while(!p1.estaVacia()){ //vacia la pila
            int elem = p1.sacar(); //quita el elemento mas arriba
            int elem2 = p1.sacar(); //quita otro elemento mas arriba
            if(elem != elem2){ //compara ambos elementos y los mete en el auxiliar si no son identicos
                aux.meter(elem);
                aux.meter(elem2);
            }         
        }
        while(!aux.estaVacia()){ //vuelve a ingresar los elementos a la pila
            p1.meter(aux.sacar());
        }
    }
}
