package tp3;

public class Cola{
 private final int maxcola=10;
 private int frente, ultimo;
 private int []elementos;

 public Cola(){
 frente=0;
 ultimo=0;
 elementos=new int[maxcola];
}

public int verFrente(){
   return elementos[frente];
}
 public boolean estaVacia(){
    return ultimo == 0;
}
 public boolean estaLlena(){
    return ultimo == maxcola;
}
 public void insertar(int numero){
    elementos[ultimo] = numero;
    ultimo++;
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