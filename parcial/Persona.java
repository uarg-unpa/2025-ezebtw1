package parcial;

public class Persona {
    private String apellido;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String apellido, int edad, int dni, char sexo, double peso, double altura){
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public int getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public char getSexo(){
        return sexo;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public double getAltura(){
        return altura;
    }

    public boolean esMayorDeEdad(){
        return this.getEdad() >= 18;
    }

    public boolean esMayorQue(Persona p){
        return this.getEdad() > p.getEdad();
    }

    public int calcularIMC(){
        double imc = this.getPeso() / this.getAltura();
        if(imc < 18){
            return -1;
        }else if(imc > 18 && imc < 25){
            return 0;
        }else{
            return 1;
        }
    }
}

