package parcial;

public class Cola{
 private final int maxcola=10;
 private int frente, ultimo;
 private int []elementos;
 private Q2 q2;

 public Cola(){
 frente = -1;
 ultimo = -1;
 elementos=new int[maxcola];
 this.q2 = new Q2(); 
}

public int verFrente(){
   return elementos[frente];
}
 public boolean estaVacia(){
    return frente == -1;
}
 public boolean estaLlena(){
    return ultimo == maxcola -1;
}
 public void insertar(int numero){
   ultimo++;
   elementos[ultimo] = numero;
}
public int cantidad(){
   return ultimo;
}
 public int borrar(int numero){
    int maxcola = elementos [frente];
    for (int i = 0 ; i < maxcola ; i++){
      elementos[i] = elementos [i+1];
      } 
    ultimo --;
    return maxcola;
   }
 
}