package tp6;

//7. Escribir un método recursivo int vocales(String cd) para calcular el número de vocales de una
//   cadena.

public class punto7 {
    public static int Vocales(String cadena){
        if(cadena.length()==0){
            return 0;
        }else if(cadena.charAt(0) == 'a' ||cadena.charAt(0) == 'e' || cadena.charAt(0) =='i'){
            return 1 + cadena.substring(1);
        }else{
            return cadena.substring(1);
        }
    }
}
