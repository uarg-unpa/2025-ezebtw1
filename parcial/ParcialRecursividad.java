package parcial;

/*
1.caso base en 0. 1+2+3+4...

2.recibir string, ir cortando y mostrando de forma inversa, imprimir al llegar al caso base, mostrar letra por letra

*/

public class ParcialRecursividad{
    public static int sumaPares(int n){
        if(n <= 0){
            return 0;
        }else if(n%2 == 0){
            return n + sumaPares(n-1);
        }
        else{
            return sumaPares(n-2);
        }

    } 


    public static int cadenaInversa(String cadena, char cadenaAux){
        if(cadena.length() == 0){
            return 0;
            System.out.println(cadenaAux);
        
        }else if(cadena.charAt(0) == 'A' | cadena.charAt(0) == 'B'){ // a, b, c... etc.  
            cadenaAux = cadena.charAt(0);          
            return 1 + cadena.substring(1);
        }else{
            return cadena.substring(1);
        }
    }





}
