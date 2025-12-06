package cosas;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private double velocidadMax;

    public Auto(String marca, String modelo, int año, double velocidadMax){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.velocidadMax=velocidadMax;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAño(int año){
        this.año=año;
    }
    public int getAño(){
        return año;
    }
    public void setVelocidadMax(double velocidadMax){
        this.velocidadMax=velocidadMax;
    }
    public double getVelocidadMax(){
        return velocidadMax;
    }

    public boolean esMasRapido(Auto otro){
        return this.getVelocidadMax() > otro.getVelocidadMax();
    }

    public boolean esAutoClasico(){
        return this.getAño() >= 2000;
    }

    public String mostrarInfo(){
        return "[Informació del auto] Marca: " + this.getMarca() + " Modelo: " + this.getModelo() + " Año: " + this.getAño() + " Velocidad Máxima: " + this.getVelocidadMax() + "km/h";
    }
}
