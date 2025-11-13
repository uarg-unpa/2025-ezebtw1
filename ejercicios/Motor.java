package ejercicios;

public class Motor {
	private double cilindrada;
	private String tipo;
	
	public Motor(double cilindrada, String tipo) {
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
}
