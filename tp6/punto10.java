package tp6;

/*10. Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros.
Pista: Divide el problema en dos partes: el elemento actual y el mínimo de los elementos restantes del arreglo.
*/

public class punto10 {
    public static int valorMinimo(int[] arr, int indice){
        if(indice == arr.length-1){
            return arr [indice];
        }else{
            int minResto = valorMinimo(arr, indice -1);
            if(arr [indice] < minResto){
                return arr[indice];
            }
            else{
                return minResto;
            }
        }
    }
}
