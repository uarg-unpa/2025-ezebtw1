package tp3;

public class IntercalarPilas {
    public static void main(String[] args) {
        Pila P1 = new Pila();
        Pila P2 = new Pila();
        ColaInt C1 = new ColaInt();
        int intercalar;

        if(C1.estaLlena()){
            System.out.println("La cola esta llena");
        }else{
            if(!P1.estaVacia()){
                intercalar = P1.sacar(0);
                C1.insertar(intercalar);
            }
            while(!P1.estaVacia());
            if(!P2.estaVacia()){
                intercalar = P2.sacar(0);
                C1.insertar(intercalar);
            }
            while(!P2.estaVacia());
        }
        
    }
}
