package parcial;

public class ColaInt {
   
   private final int maxcola=5;
   private int elementos[];
   private int frente, ultimo, cantidad;
   
   public ColaInt() {
    elementos=new int[maxcola];
    frente = 0;
    ultimo = 0;
    cantidad = 0;
   }
   
   public boolean estaVacia() {
    return (ultimo==-1);
   }
   
   public boolean estaLlena() {
    return (ultimo==maxcola-1);
   }
   
   public void insertar(int elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   public int cantidadElementos(){
      return elementos[frente];
   }
   
   public int borrar() {
        int aux = elementos[0];
        for(int i=0; i<ultimo; i++) {
        elementos[i] = elementos[i+1];
      }
      ultimo--;     
      return aux;
   }
   
   public boolean masElementosQue(ColaInt q2){
      int cantidad1;
      int cantidad2;
   }
}
