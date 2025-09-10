package tp1;

    public class testpersonaje {
        public static void main(String [] args){
            Personaje p1 = new Personaje("Goku", 50, 50, "Kamehameha" );

            Personaje p2 = new Personaje("Vegeta", 30, 120, "Resplandor Final");

            System.out.println(p1);
            System.out.println(p2);

            p1.setNiveldenergia(50);
            p1.setPtsdevida(100);

            p2.setNiveldenergia(30);
            p2.setPtsdevida(120);


            System.out.println("El jugador: " + p1.getNombre() + "Puede pelear? " + p1.puedePelear());
            System.out.println("El jugador: " + p2.getNombre() + "Puede pelear? " + p2.puedePelear());

            System.out.print("El jugador: " + p1.getNombre() + "Recibe 50 de daño ");
            System.out.print("El jugador: " + p2.getNombre() + "Recibe 50 de daño ");
        }
    
}
