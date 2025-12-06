package tp6;

// Escribir un método recursivo para encontrar la suma de los enteros pares hasta N.
// 2 + 4 + 6 + … + (n - 2) + n

public class punto5 {
    public static int sumaPares(int n){
        if(n <= 0){ // caso base: termina cuando n es igual a 0
            return 0; 
        }else if(n%2 == 0){ // 1er caso general: incrementa sumaPares y decrementa n achicando el problema
            return n + sumaPares(n-1);
        }
        else{
            return sumaPares(n-2); //2do caso general: si n no cumple ninguna condicion se decrementa
        }
        
    }
}
