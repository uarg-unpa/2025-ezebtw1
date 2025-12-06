package ejercicios;

import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ColaNombres nombres = new ColaNombres();

        int opcion;
        do{
            System.out.println("\n===MENÚ DE COLA DE NOMBRES===");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Mostrar estado de la cola");
            System.out.println("4. Mostrar nombre más al frente");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch(opcion){
                case 1:

                sc.nextLine();
                System.out.println("Ingrese el nombre del alumno");
                String nombreAlumno = sc.nextLine();
                if(nombres.estaLlena()){
                    System.out.println("Error. La cola está llena.");
                }else{
                    nombres.encolar(nombreAlumno);
                    System.out.println("El nombre: " + nombreAlumno + " ha sido encolado.");
                }
                break;

                case 2:
                if(nombres.estaVacia()){
                    System.out.println("Error. La cola está vacía.");
                }else{
                    String eliminado = nombres.desencolar();
                    System.out.println("El nombre: " + eliminado + " ha sido desencolado");
                }
                break;

                case 3:
                if(nombres.estaVacia()){
                    System.out.println("La cola no tiene nombres.");
                }else if(nombres.estaLlena()){
                    System.out.println("La cola está llena. " + "(" + nombres.cantidadNombres() + " nombres)");
                }else{
                    System.out.println("La cola tiene: " + nombres.cantidadNombres() + " nombres.");
                }
                break;
                
                case 4:
                if(nombres.estaVacia()){
                    System.out.println("Error. La cola está vacía.");
                }else{
                    System.out.println("El elemento más al frente es: " + nombres.verFrente());
                }
                break;

                case 0:
                System.out.println("Saliendo...");
                break;
            }
        }
        while(opcion != 0);
        System.out.println("mondongo");
        sc.close();
    }
}
