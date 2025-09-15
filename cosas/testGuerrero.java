package cosas;

public class testGuerrero{
    public static void main(String[] args){

        Guerrero g1 = new Guerrero("Goku","Sayayin", 100, 15000, 50);
        Guerrero g2 = new Guerrero("Vegeta", "Sayayin", 100, 30000, 40);
        Guerrero g3 = new Guerrero("Puar", "Gato", 10, 1, 0);
        
        g1.puedePelear();
        g2.puedePelear();
        g3.puedePelear();

        System.out.println(g3.getNombreGuerrero() + " Se retira del campo de batalla! ");
        System.out.println(g1.getNombreGuerrero() + " VS " + g2.getNombreGuerrero() +"!");
        System.out.println("La batalla comienza! ");

        System.out.println(g2.getNombreGuerrero() + " ataca a " + g1.getNombreGuerrero() + "!");
        g1.recibirAtaque(g2.getDano());

        System.out.println(g1.getNombreGuerrero() + " Contraataca a " + g2.getNombreGuerrero() + "!");
        g2.recibirAtaque(g1.getDano());

        System.out.println(g2.getNombreGuerrero() + " ataca a " + g1.getNombreGuerrero() + "!");
        g1.recibirAtaque(g2.getDano());

        System.out.println(g1.getNombreGuerrero() + " Contraataca a " + g2.getNombreGuerrero() + "!");
        g2.recibirAtaque(g1.getDano());

        System.out.println(g1.getNombreGuerrero() + " Ha vencido a " + g2.getNombreGuerrero() + "!");

    }
}