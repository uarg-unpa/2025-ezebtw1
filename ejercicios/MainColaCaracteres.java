package ejercicios;
import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres();

        int opcion;
        do{
            System.out.println("\n===MENÚ DE COLAS DE CARACTERES===");
            System.out.println("1. Ingresar caracter (ingresar una letra)");
            System.out.println("2. Eliminar un caracter (eliminar una letra)");
            System.out.println("3. Ver caracter al frente (peek)");
            System.out.println("4. Mostrar estado (Vacía, llena, etc.)");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");

            opcion =sc.nextInt();

            switch(opcion){
                case 1:
                sc.nextLine();      //(limpiar buffer)

                System.out.println("Ingrese un caracter");
                char caracter = sc.next().charAt(0);

                if(cola.estaLlena()){
                    System.out.println("Error. No se puede ingresar un caracter, la cola está llena.");
                }
                else{
                    cola.ingresar(caracter);
                    System.out.println("El caracter: " + caracter + " ha sido ingresado.");
                }
                break;

                case 2:
                if(cola.estaVacia()){
                    System.out.println("Error. No se puede eliminar un caracter, la cola está vacía.");
                }
                else{
                    char eliminado = cola.borrar();
                    System.out.println("El caracter: " + eliminado + " ha sido eliminado.");
                }
                break;

                case 3:

                if(cola.estaVacia()){
                    System.out.println("Error. La cola está vacía");
                }
                else{
                    System.out.println("El caracter más al frente es: " + cola.mostrar());
                }
                break;

                case 4:
                if(cola.estaVacia()){
                    System.out.println("Estado: La cola está vacía.");
                }
                else if(cola.estaLlena()){
                    System.out.println("Estado: La cola está llena.");
                }
                else{
                    System.out.println("Estado: La cola tiene " + cola.cantidad() + " elemento(s).");
                }
                break;

                case 0:
                System.out.println("Saliendo del programa...");
                break;

                default:
                System.out.println("Opción inválida. Intente de nuevo.");

            }
            
        } 
        while(opcion!=0);
        sc.close();
        

    }
}
