package ejercicios;

public class Vehiculo {
	private String marca;
	private String modelo;
	private Motor motor;

	public Vehiculo(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setmModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Motor getMotor() {
		return motor;
	}
	
	
	public boolean esPotente() {
		return motor.getCilindrada() > 2000; 
	}
	
	public void actualizarTipoMotor(String nuevoTipo) {
		motor.setTipo(nuevoTipo);
	}
	
	public double calcularConsumo() {
		double consumo = 0;
		String tipo = motor.getTipo();
		
		if(tipo.equals("Gasolina")) {
			consumo = motor.getCilindrada() * 0.05;
		}else if(tipo.equals("Diesel")) {
			consumo = motor.getCilindrada() * 0.04;
		}else if(tipo.equals("Electrico")) {
			consumo = motor.getCilindrada() * 0.02;
		}else {
			consumo = motor.getCilindrada() * 0.06;
		}
		return consumo;
	}
	
	@Override
	public String toString() {
		return ("marca = " + marca + ", modelo = " + modelo +  ", cilindrada = " + motor.getCilindrada() + ", tipo = " + motor.getTipo());
	}
	
}
