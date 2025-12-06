package parcial;

public class MainPilaCaracteres {
    public int elementosRepetidos(){
        PilaCaracteres aux = new PilaCaracteres();
        int cont = 0;
        while(!estaVacia()){
            char elemento = sacar();
            if (elemento == buscado){
                cont++;
            }
            aux.meter(elemento);
        }
        while(!aux.estaVacia()){
            meter(aux.sacar);
        }
        return cont;
    }
}
