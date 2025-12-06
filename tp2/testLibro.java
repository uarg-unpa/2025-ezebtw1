package tp2;

public class testLibro {
    public static void main(String[] args){
        Libro libro1 = new Libro("El Quijote", "Miguel Servante", 1605, 863);

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 2011, 811);

        System.out.println("El libro: " + libro1.getTitulo());
        System.out.println("Es reciente? "+ libro1.esReciente());

        System.out.println("El libro: " + libro2.getTitulo());
        System.out.println("Es reciente? " + libro2.esReciente() );

    }
}
