package ejercicios;

public class Deportista {
    private String nombre;
    private int edad;
    private String deporte;
    private int puntos;

    public Deportista(String nombre, int edad, String deporte, int puntos){
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.puntos = puntos;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setDeporte(String deporte){
        this.deporte=deporte;
    }
    public String getDeporte(){
        return deporte;
    }
    public void setPuntos(int puntos){
        this.puntos=puntos;
    }
    public int getPuntos(){
        return puntos;
    }

    public boolean esMasExperimentado(Deportista otro){
        return this.getPuntos() > otro.getPuntos();
    }
    public boolean esMayorDeEdad(){
        return this.getEdad() >= 18;
    }
    public String toString(){
        return "[Datos del deportista] Nombre: " + this.getNombre() + " Edad: " + this.getEdad() + " Deporte: " + this.getDeporte() + " Puntos: " + this.getPuntos();
    }
}
