package parcial;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona("Gomez", 23, 44237010, 'H', 23, 1.7);
        Persona p2 = new Persona("Suarez", 15, 13123123, 'M', 5.0, 1.8);

        System.out.println("Ingrese el apellido de la persona.");
        String apellido1 = sc.nextLine();

        System.out.println("Ingrese la edad de la persona.");
        int edad1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el DNI de la persona.");
        int dni1 = sc.nextInt();

        System.out.println("Ingrese el sexo de la persona. ('H', 'M')");
        char sexo1 = 'H';
        if(sexo1 == 'H'){
            sexo1 = sc.next().charAt(0);
        }else if(sexo1 == 'M'){
            sexo1 = sc.next().charAt('M');
        }else{
            System.out.println("Sexo no válido.");
        }

        System.out.println("Ingrese la el peso de la persona.");
        double peso1 = sc.nextDouble();

        System.out.println("ingrese la altura de la persona.");
        double altura1 = sc.nextDouble();


        System.out.println("Calculando peso...");

        if(edad1 >= 18){
            System.out.println("La persona de apellido " + apellido1 + " es mayor de edad." );
        }else{
            System.out.println("La persona de apellido " + apellido1 + " es menor de edad.");
        }
        
       if(peso1 < 18){
            System.out.println("El peso de la persona de apellido " + apellido1 + " está por debajo del ideal.");
        }else if(peso1 > 18 && peso1 < 25){
            System.out.println("La persona de apellido " + apellido1 + " está en su peso ideal.");
        }else{
            System.out.println("La persona de apellido " + apellido1 + " está por encima de su peso ideal.");
        }
 
        System.out.println("-------------------");

        if(p1.calcularIMC() == -1){
            System.out.println("La persona de apellido " + p1.getApellido()+ " está por debajo de su peso ideal.");
        }else if(p1.calcularIMC() == 0){
            System.out.println("La persona de apellido " + p1.getApellido() + " está en su peso ideal.");
        }else{
            System.out.println("La persona de apellido " + p1.getApellido() + " está por encima de su peso ideal.");
        }

        System.out.println("-------------------");

        if(p2.calcularIMC() == -1){
            System.out.println("La persona de apellido " + p2.getApellido()+ " está por debajo de su peso ideal.");
        }else if(p2.calcularIMC() == 0){
            System.out.println("La persona de apellido " + p2.getApellido() + " está en su peso ideal.");
        }else{
            System.out.println("La persona de apellido " + p2.getApellido() + " está por encima de su peso ideal.");
        }

        System.out.println("Calculando edades...");

        if(edad1 >=18){
            System.out.println("La persona de apellido " + apellido1 + " es mayor de edad.");
        }else{
            System.out.println("La persona de apellido " + apellido1 + " es menor de edad.");
        }

        System.out.println("-----------------------");

        if(p1.esMayorDeEdad()){
            System.out.println("La persona de apellido " + p1.getApellido() +  " es mayor de edad.");
        }else{
            System.out.println("La persona de apellido " + p1.getApellido() + " es menor de edad.");
        }

        System.out.println("---------------------");

         if(p2.esMayorDeEdad()){
            System.out.println("La persona de apellido " + p2.getApellido() +  " es mayor de edad.");
        }else{
            System.out.println("La persona de apellido " + p2.getApellido() + " es menor de edad.");
        }

        System.out.println("Viendo quién es mayor...");

        boolean mayor = p1.esMayorQue(p2);
        if(mayor){
            System.out.println("La persona de apellido " + p1.getApellido() + " es mayor que " + p2.getApellido());
        }else{
            System.out.println("La persona de apellido "  + p2.getApellido() + " es mayor que " + p1.getApellido());
        }

        System.out.println("-------------------------");

        System.out.println("[DNIs de las personas] Persona 1: " + p1.getDni() + " Persona 2 " + p2.getDni() + "Persona 3 (creada recién):" + dni1);

        System.out.println("mondongo");

        sc.close();
    }
}
