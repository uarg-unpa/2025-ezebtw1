package ejercicios;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) {
		saldo = saldo + monto;
	}
	
	public void retirar(double monto) {
		saldo = saldo - monto;
	}
	
	public String mostrarDatos() {
		return ("Titular : " + titular + ", Saldo: " + saldo);
	}
}
