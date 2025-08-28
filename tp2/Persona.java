package tp2;

public class Persona {
   
    String nombre;
    String apellido;
    int edad;
    int dni;

    public Persona(String nombre, String apellido, int edad, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni; 
    }
 public String getNombre(){
return nombre;
 }
public void setNombre(String nombre){
this.nombre=nombre;
}

    public boolean mayorDeEdad( )
    {  
        if(edad>=18)
            return true;
        else
            return false;
    }

}
