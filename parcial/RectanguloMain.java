package parcial;
import java.util.Scanner;

public class RectanguloMain {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la base del rectángulo. (real)");
		double base=scan.nextDouble();
		
		System.out.print("la base del rectangulo es " + base);
		
		System.out.println(". Ahora ingrese la altura del rectángulo. (real)");
		double altura=scan.nextDouble();
		
		System.out.println("La altura del rectángulo es: " + altura);
		
		Rectangulo r1 = new Rectangulo(base, altura);
		System.out.println(r1.calcularArea());
		
		
		System.out.println("Ahora ingrese la base del 2do rectángulo. (real)");
		double base2=scan.nextDouble();
		
		System.out.print("La base del 2do rectángulo es: " + base2);
		System.out.println(". Ahora ingrese la atura del 2do rectángulo");
		double altura2 = scan.nextDouble();
		
		System.out.print("La altura del 2do rectángulo es: " + altura2);
		
		Rectangulo r2 = new Rectangulo(base2, altura2);
		System.out.println(r2.calcularPerimetro());
		
		if(r1.esMayorElArea(r2)) {
			System.out.println("El area del rectángulo 1 es mayor.");
		}else {
			System.out.println("El area del rectágulo 2 es mayor.");
		}
		
		System.out.println("mondongo");
		scan.close();
	}
}

