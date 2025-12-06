package ejercicios;

import java.util.Scanner;

public class EstacionamientoMain {
	
	public static void main(String []args) {
		int op = 0;
        Scanner sc = new Scanner(System.in);
        AutoP a = null;
		Estacionamiento e = new Estacionamiento("manuel");
		
		do {
			
			System.out.println("------- MENU -------");
			System.out.println("1. Ingresar Auto");
			System.out.println("2. Retirar Auto");
			System.out.println("3. Salir");
			
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Ingrese la patente");
				int p = sc.nextInt();
				a = new AutoP (p);
				if (e.ingresarAuto(a)) {
					System.out.println("Ingresó con exito");
				}else {
					System.out.println("No hay lugar lerelelel");
				}
				break;
				
			case 2:
				System.out.println("Ingrese la patente a buscar");
                p = sc.nextInt();
                AutoP au = e.retirarAuto(p);
                if(au != null){
                    System.out.println("El auto salió. Patente: " + a.getPatente());
                }else{
                    System.out.println("La patente no existe.");
                }
				break;
				
			case 3:
			}
			
		}	while(op != 3);
	}
}
