package ejercicios;

public class TiendaMain {
    public static void main(String[]args){
        Producto p1 = new Producto("Ferrari", 100100100, 9999999.1);
        Producto p2 = new Producto("Jugo Baggio", 23412312, 3000);
        Producto p3 = new Producto("Pepsi", 5353535, 3500);

        System.out.println("Productos:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        boolean masCaro = p1.masCaroQue(p2);

        System.out.println("Comparando precios...");
        if(masCaro){
            System.out.println("El producto " + p1.getNombre() + " es mas caro.");
        }else{
            System.out.println("El preducto " + p2.getNombre() + " es mas caro.");
        }
        System.out.println("mondongo");
    }
}
