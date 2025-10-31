//Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla en forma inversa
package tp3;

import java.util.Scanner;
import java.util.Stack;

public class Punto3 {
    public static void main(String[] args){

    
        Stack<String> stack = new Stack<String>();    
        Scanner caracteres = new Scanner(System.in);

        System.out.println("Ingrese un caracter(1/5)");

        String caracter1 = caracteres.nextLine();
        stack.push (caracter1);

        System.out.println("Ingrese otro caracter(2/5)");

        String caracter2 = caracteres.nextLine();
        stack.push (caracter2);

        System.out.println("Ingrese otro caracter(3/5)");

        String caracter3 = caracteres.nextLine();
        stack.push (caracter3);

        System.out.println("Ingrese otro caracter(4/5)");

        String caracter4 = caracteres.nextLine();
        stack.push (caracter4);

        System.out.println("Ingrese otro caracter(5/5)");

        String caracter5 = caracteres.nextLine();
        stack.push (caracter5);


        System.out.println(stack);
        System.out.println("Orden original: " + caracter1+ ", " + caracter2 + ", " + caracter3 + ", " + caracter4 + ", " + caracter5);

        System.out.println("Orden inverso: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        caracteres.close();
    }
}
