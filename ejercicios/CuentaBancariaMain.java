package ejercicios;

public class CuentaBancariaMain {
	public static void main(String[]args) {
		CuentaBancaria cb1 = new CuentaBancaria("Manuel", 2000);
		CuentaBancaria cb2 = new CuentaBancaria("leunaM", 2);
		
		System.out.println("Saldo actual: " + cb1.getSaldo());
		System.out.println("Ingresar monto");
		double monto1 = 100;
		if(monto1 <= 0) {
			System.out.println("Monto no válido." + monto1);
		}else {
			cb1.depositar(monto1);
			System.out.println("Monto ingresado: " + monto1);
		}
		System.out.println("Saldo actual: " + cb1.getSaldo());
		
		System.out.println("Retirar monto" );
		double retirarMonto = 1000;
		if(retirarMonto <= 0) {
			System.out.println("Monto a retirar no válido " + retirarMonto);
		}else if(retirarMonto > cb1.getSaldo()){
			System.out.println("Monto a retirar no válido " + retirarMonto);
		}else {
			cb1.retirar(retirarMonto);
			System.out.println("Monto a retirar: " + retirarMonto);
		}
		System.out.println("Datos finales: " + cb1.mostrarDatos());
		
			
		System.out.println("-------------------------"); //separador
		
		
		System.out.println("Saldo actual: " + cb2.getSaldo());
		System.out.println("Ingresar monto");
		double monto2 = -1;
		if(monto2 <= 0.0) {
			System.out.println("Monto no válido." + monto2);
		}else {
			cb2.depositar(monto2);
			System.out.println("Monto ingresado: " + monto2);
		}
		System.out.println("Saldo actual: " + cb2.getSaldo());
		
		System.out.println("Retirar monto" );
		double retirarMonto2 = 3;
		if(retirarMonto2 <= 0) {
			System.out.println("Monto a retirar no válido " + retirarMonto2);
		}else if(retirarMonto2 > cb2.getSaldo()){
			System.out.println("Monto a retirar no válido " + retirarMonto2);
		}else {
			cb2.retirar(retirarMonto2);
			System.out.println("Monto a retirar: " + retirarMonto2);
		}
		System.out.println("Datos finales: " + cb2.mostrarDatos());
		
		
		System.out.println("mondongo");
	}
}
