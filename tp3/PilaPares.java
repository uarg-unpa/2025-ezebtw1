package tp3;

//TP4 Ejercicio Pila pares

//Se tiene una pila de enteros positivos. Con las operaciones básicas de pilas y colas, escribir un
//programa que coloque todos los elementos pares de la pila en la cola.


public class PilaPares {
    public static void main(String[]args){
        Pila p = new Pila();
        ColaInt c = new ColaInt();
        int elementoPar;
        p.meter(1);
        p.meter(2);
        p.meter(4);
        

        if(p.estaVacia()){
            System.out.println("La pila o la cola están vacías");
        }else{
            if(p.elementoCima() % 2 == 0){
                elementoPar = p.elementoCima();
                p.sacar(0);
                if(!c.estaLlena()){
                    c.insertar(elementoPar);
                }
            }
        }

        System.out.println(c.mostrar());
        System.out.println("mondongo");
    }
   
}
