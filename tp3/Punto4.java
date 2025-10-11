package tp3;
import java.util.Scanner;

public class Punto4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Pila elem = new Pila();

        int opcion;
        do{
            System.out.println("\n===MENU DE ELEMENTOS ===");
            System.out.println("1. Agregar un elemento. (Maximo 5)");
            System.out.println("2. Eliminar un elemento");
            System.out.println("O. Salir");
            System.out.println(Opción: );

            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                if(elem.estaLlena()){
                    System.out.println("Error. La pila está llena.");
                }else{
                    elem.meter(elemento);
                    System.out.println("El elemento"  + elemento + " ha sido ingresado");
                }
            }
        }
    }
}
