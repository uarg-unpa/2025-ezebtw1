package tp6;

// 4. Escribir un método recursivo que calcule la siguiente suma:
//    1 + 2 + 3 + … + (n - 1) + n


public class punto4 {
    public static int Suma(int n){
        if (n == 1){ //caso base
            return 1;
        }
        else{
            return n + Suma(n-1); //caso general: 
            // se llama a si mismo recursivamente sumando n y achica el 
            // problema para llegar al caso base 
        }
    }
}
