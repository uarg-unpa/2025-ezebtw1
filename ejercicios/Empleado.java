package ejercicios;

public class Empleado {    //Atributos privados
    private String nombre;
    private int legajo;
    private double sueldo;

    //Constructor
    public Empleado(String nombre, int legajo, double sueldo){
        this.nombre=nombre;
        this.legajo = legajo;
        this.sueldo=sueldo;
    }

    //Gets & Sets
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setLegajo(int legajo){
        this.legajo=legajo;
    }
    public int getLegajo(){
        return legajo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }

    public boolean ganaMasQue(Empleado otro){      //devuelve true si el sueldo actual es mayor al del otro empleado
        return this.getSueldo() > otro.getSueldo();
    }

    public String toString(){ 
        return "Nombre: " + this.getNombre() + " Legajo: " + this.getLegajo() + " Sueldo: " + this.getSueldo();
    }
}
