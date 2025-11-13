package ejercicios;

public class EmpresaMain {
    public static void main(String[]args){
        System.out.println("GESTOR DE EMPLEADOS");

        Empleado e1 = new Empleado("Manuel", 9292929, 800000);
        Empleado e2 = new Empleado("Sofia", 1234567, 800001);
        Empleado e3 = new Empleado("Jorge", 7654321, 480000);

        System.out.println("Datos de empleados: ");
        System.out.println("Empleado 1: " + e1.toString());
        System.out.println("Empleado 2: " + e2.toString());
        System.out.println("Empleado 3: " + e3.toString());

        boolean ganaMas = e1.ganaMasQue(e2);
        if(ganaMas){
            System.out.println("El empleado " + e1.getNombre() + " gana más.");
        }else{
           System.out.println("El empleado " + e2.getNombre() + " gana más.");
        }
        System.out.println("mondongo");
    }
}
