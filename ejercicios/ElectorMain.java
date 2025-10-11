package ejercicios;
import java.util.Scanner;

public class ElectorMain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese un apellido");
        String apellido = sc.nextLine();

        System.out.println("Ingrese una matricula (entero)");
        int matricula = sc.nextInt();
        sc.nextLine(); ///para limpiar el buffer

        System.out.println("Ingrese una clase (entero)");
        int clase = sc.nextInt();
        sc.nextLine(); ///para limpiar el buffer x2

        System.out.println("Ingrese un domicilio");
        String domicilio = sc.nextLine();

        Elector e0 = new Elector(nombre, apellido, matricula, clase, domicilio);


        Elector e1 = new Elector("Ezequiel", "Gomez", 321321, 123123, "Pasaje Fenton");
        Elector e2 = new Elector("Martin", "Rodriguez", 123321, 123456, "Avenida Paz");
        Elector e3 = new Elector("Goku", "Son", 000001, 0000, "Monte Paoz");
        Elector e4 = new Elector("Vegeta", "IV", 000002, 1,"Corporación Capsula");
        Elector e5 = new Elector("Jorge", "Jorge", 010101, 101010, "Jorge");

        System.out.println("\nDatos Originales: ");
        System.out.println(e0);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);    

        System.out.println("Datos modificados:");

        e1.setNombre("Exequiel");
        e2.setApellido("Martinez");
        e5.setDomicilio("egroJ");

        System.out.println(e0);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);   

        System.out.println("mondongo");

        sc.close();
    }
    
}
