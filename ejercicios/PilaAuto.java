package ejercicios;


public class PilaAuto {
	final int maxpila = 10;
	AutoP [] elementos;
	int cima;
	
	public PilaAuto() {
		elementos = new AutoP [maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	public boolean estaLlena() {
		return (cima == maxpila -1);
	}
	
	public void meter(AutoP e) {
		cima++;
		elementos[cima] = e;
	}
	public AutoP sacar() {
		AutoP aux = elementos[cima];
		cima++;
		return aux;
	}
}
