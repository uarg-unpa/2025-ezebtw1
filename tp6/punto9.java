package tp6;

/*Escribe un método recursivo que determine si un número está presente en un arreglo. Devuelve
true si el número se encuentra en el arreglo y false en caso contrario. */

public class punto9 {
    public static boolean presente(int [] arr, int n, int indice){
        if(indice == arr.length){
            return false;
        }
        else 
            if(arr[indice] == n){
                return true;
            }
        else {
            return presente(arr, n, indice +1);
        }
    }

//cambio a ocurrencias

    public static boolean ocurrencias(int [] arr, int n, int indice){
        if(indice == arr.length){ //Caso base, termina si el array no tiene mas elementos
            return false;
        }
        else 
            if(arr[indice] == n){
                return true;
            }
        else {
            return ocurrencias(arr, n, indice +1);
        }
    }


    
}
