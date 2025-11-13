package ejercicios;

public class Producto {
    private String nombre;
    private int codigo;
    private double precio;

    public Producto(String nombre, int codigo, double precio){
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }

    public boolean masCaroQue(Producto otro){
        return this.getPrecio() > otro.getPrecio();
    }

    public String toString(){
        return "[Informacion del producto] Nombre: " + this.getNombre() + " Código: " + this.getCodigo() + " Precio: " + this.getPrecio();
    }
}
