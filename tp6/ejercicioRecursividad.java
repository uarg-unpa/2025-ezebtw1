package tp6;

public class ejercicioRecursividad {

    public static int misterio(int a, int b){
        a = 5;
        b = 10;
        if(a==0){
            return b;
        }else{
            return misterio(a-1, b+1);
        }
    }

    //3. ejercicio caracteres

    //contar cuantas veces aparece 'a' o 'A'
   
    public static int contarA(String s){
        if(s.length()==0){
            return 0;
        }else if(s.charAt(0) == 'a' || s.charAt(0) == 'A'){
            return 1 + s.substring(1);
        }
    }

}
