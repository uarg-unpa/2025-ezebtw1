package ejercicios;

public class Elector {
    private String nombre;
    private String apellido;
    private int matricula;
    private int clase;
    private String domicilio;

    public Elector(String nombre, String apellido, int matricula, int clase, String domicilio){
    this.nombre = nombre;
    this.apellido = apellido;
    this.matricula = matricula;
    this.clase = clase;
    this.domicilio = domicilio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setClase(int clase){
        this.clase = clase;
    }
    public int getClase(){
        return clase;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public String getDomicilio(){
        return domicilio;
    }

    @Override
    public String toString(){
        return ("Nombre: " + nombre + ", apelido: " + apellido + ", matricula: " + matricula + ", clase: " + clase + ", domicilio: " + domicilio +  ".");
    }
}
