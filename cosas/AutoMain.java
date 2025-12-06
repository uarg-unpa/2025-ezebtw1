package cosas;

public class AutoMain {
    public static void main(String[] args) {
        Auto a1 = new Auto("Nissan", "Skyline GT-R R34", 2002, 240.0);
        Auto a2 = new Auto("Renault", "12", 1977, 145.0);
        Auto a3 = new Auto("Nissan", "350z", 2002, 195.0);

        System.out.println("INFORMACIÓN DE VEHÍCULOS");
        System.out.println("---------------------");
        System.out.println(a1.mostrarInfo());
        System.out.println(a2.mostrarInfo());
        System.out.println(a3.mostrarInfo());

        System.out.println("---------------------");

        boolean esElMasRapido = a1.esMasRapido(a2);
        if(esElMasRapido){
            System.out.println("El auto: " + a1.getMarca() + " " + a1.getModelo() + " es mas rápido que el " + a2.getMarca() + " " + a2.getModelo());
        }else{
            System.out.println("El auto: " + a2.getMarca() + " " + a2.getModelo() + " es mas rápido que el " + a1.getMarca() + " " + a1.getModelo());
        }

        if(a1.esAutoClasico()){
            System.out.println("El auto: " + a1.getMarca() + " " + a1.getModelo() + " es un auto clásico");
        }else{
            System.out.println("El auto: " + a1.getMarca() + " " + a1.getModelo() + " no es un auto clásico");
        }
        if(a2.esAutoClasico()){
            System.out.println("El auto: " + a2.getMarca() + " " + a2.getModelo() + " es un auto clásico");
        }else{
            System.out.println("El auto: " + a2.getMarca() + " " + a2.getModelo() + " no es un auto clásico");
        }
        if(a3.esAutoClasico()){
            System.out.println("El auto: " + a3.getMarca() + " " + a3.getModelo() + " es un auto clásico");
        }else{
            System.out.println("El auto: " + a3.getMarca() + " " + a3.getModelo() + " no es un auto clásico");
        }

        System.out.println("mondongo");
    }
}
