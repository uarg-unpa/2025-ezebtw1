package tp2;

public class Mascota{

    private String raza;
    private String nombre_mascota;
    private int edad_mascota;

    public Mascota(String raza, String nombre_mascota, int edad_mascota){
        this.raza=  raza;
        this.nombre_mascota = nombre_mascota;
        this.edad_mascota = edad_mascota;
    }

    public void setRaza(String raza){
        this.raza=raza;
    }
    public String getRaza(){
        return this.raza;
    }
    public void setNombre_mascota(String nombre_mascota){
        this.nombre_mascota = nombre_mascota;
    }
    public String getNombre_mascota(){
        return this.nombre_mascota;
    }
    public void setEdad_mascota(int edad_mascota){
    this.edad_mascota = edad_mascota;
    } 
    public int getEdad_mascota(){
        return this.edad_mascota;
    }
}