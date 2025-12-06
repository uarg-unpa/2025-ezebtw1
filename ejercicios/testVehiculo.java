package ejercicios;

import java.util.Scanner;

public class testVehiculo {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese la marca del vehiculo.");
		String marca = scan.nextLine();
		
		System.out.println("Ingrese el modelo del vehiculo.");
		String modelo = scan.nextLine();
		
		System.out.println("Ingrese la cilindrada del motor. (de 0 hasta 4000)");
		double cilindrada = scan.nextDouble();
		scan.nextLine(); //para limpiar el buffer
		
		System.out.println("Ingrese el tipo de motor (Gasolina, Diesel o Electrico)");
		String tipo = scan.nextLine();
		
		
		Motor motor1 = new Motor(cilindrada, tipo);
		Vehiculo vehiculo1 = new Vehiculo(marca, modelo, motor1);
		
		System.out.println("Los datos del vehiculo son: ");
		System.out.println(vehiculo1.toString());
		
		if(vehiculo1.esPotente()) {
			System.out.println("El vehiculo es potente(+2000hp)");
		}else {
			System.out.println("El vehiculo no es potente(<2000hp)");
		}
		
		double consumo = vehiculo1.calcularConsumo();
		System.out.println("El consumo del vehiculo es: " + consumo);
		
		System.out.println("\nIngrese un nuevo tipo de motor. (Gasolina, Diesel o Electrico.)");
		String nuevoTipo = scan.nextLine();
		vehiculo1.actualizarTipoMotor(nuevoTipo);
		
		System.out.println("Vehiculo actualizado: ");
		System.out.println(vehiculo1.toString());
		
		scan.close();
	}
}
