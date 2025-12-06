package ejercicios;

public class DeportistaMain {
 public static void main(String[] args) {
    Deportista d1 = new Deportista("Juan", 17, "Tenis", 5000);
    Deportista d2 = new Deportista("Cavani", 38, "fuchibol", -1);

    System.out.println(d1.toString());
    System.out.println(d2.toString());

    System.out.println("Comparación:");

    boolean masPuntos = d1.esMasExperimentado(d2);
    if(masPuntos){
        System.out.println("El deportista: " + d1.getNombre() + " es más experimentado que " + d2.getNombre());
    }else{
        System.out.println("El codigo esta mal jsjsk");
    }

    System.out.println("mondongo");
 }   
}
