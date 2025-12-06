package tp6;

/* 
punto 6{ñlñl{ñlñ{{{ññññññññññññññjklkm}}}}}
*/

public class PruebaFuncion {
    public static void main(String[] args) {
        System.out.println(g(23, 7));
    }

    public static int g (int x, int y){
        if(x <= y){
            return 1;
        }else{
            return g(x, y +1) + 1;   
        }
    }
}
