package tp6;

public class RecursividadPra {

	//resta
	public static void contar(int n) {
		if(n == 0) {
			return;
		}
		else {
			System.out.println(n);
			contar(n-1);
		}
	}
	
	//suma
	public static int sumarHasta(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + sumarHasta(n-1);
		}
	}
	
	//contar digitos
	public static int contarDigitos(int n, int d) {
		System.out.println(contarDigitos(45551, 5)); // debería dar 3
		System.out.println(contarDigitos(202020, 0)); // debería dar 3
		System.out.println(contarDigitos(1234, 9));   // debería dar 0

		
		if(n == 0) {
			return 0; //casirijillo base vecinirijillo
		}else{
			int ultimo = n & 10;
			int coincidencia = (ultimo == d) ? 1 : 0;
			return coincidencia + contarDigitos (n/10 ,d);
		}
	}
	
	//recursividad Strings
	public static int contarVocales(String cd) {
		
		if(cd.length() == 0) {
			return 0;
		}else{
			char c = cd.charAt(0);
			int suma = 0;
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				suma = 1;
			}
			
			return suma + contarVocales(cd.substring(1)) ;
		}
	}
}
