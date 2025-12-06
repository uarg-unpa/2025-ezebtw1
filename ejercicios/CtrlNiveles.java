package ejercicios;
/* Implementar pila de enteros
   1. que permita agregar nuevos niveles a la pila
   2. Mostrar el valor más arriba de la pila
   3. Pedir un valor X y contar cuantas veces aparece en la pila
   (sin modificarla)
*/

public class CtrlNiveles {
	
	private int [] niveles;
	private int cima, tope = 5;
	
	public CtrlNiveles() {          //constructor que inicializa el array
		niveles = new int [tope];
		cima = -1;
	}
	
	public boolean estaVacia() {    //verifica si la pila está vacía
		return cima == -1;
	}
	public boolean estaLlena() {    //verifica si la pila está llena
		return cima == tope -1;
	}
	public void nuevoNivel(int nivel) { //añade niveles a la pila
		cima ++;
		niveles[cima] = nivel;
	}
    public int sacar(){             //quita un nivel de la pila
        int aux1 = niveles[cima];
		cima --;
		return aux1;
    }
	public int mostrarCima() {  //saca y muestra el ultimo elemento ingresado
		return niveles[cima];
	}

	public int contNiveles(int buscado){  		//cuenta y devuelve las veces que se repite un nivel
		CtrlNiveles aux = new CtrlNiveles();
		int cont = 0;
		while(!estaVacia()){
			int nivel = sacar();
		if(nivel == buscado){
			cont++;
		}
		aux.nuevoNivel(nivel);
	}
	while(!aux.estaVacia()){
		nuevoNivel(aux.sacar());
	}
	return cont;
	}

}

