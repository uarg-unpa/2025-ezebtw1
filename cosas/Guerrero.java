package cosas;

public class Guerrero {
    private String nombreGuerrero;
    private String raza;
    private int vida;
    private int nivelPoder;
    private int dano;

    // Constructor
    
    public Guerrero(String nombreGuerrero, String raza, int vida, int nivelPoder, int dano) {
        this.nombreGuerrero = nombreGuerrero;
        this.raza = raza;
        this.vida = vida;
        this.nivelPoder = nivelPoder;
        this.dano = dano;
    }

    // Getters y setters
    
    public void setNombreGuerrero(String nombreGuerrero) {
        this.nombreGuerrero = nombreGuerrero; 
    }
    public String getNombreGuerrero() {
        return nombreGuerrero; 
    }

    public void setRaza(String raza) {
        this.raza = raza; 
    }
    public String getRaza() {
        return raza;
    }

    public void setVida(int vida) {
        this.vida = vida; }
    public int getVida() { return vida; 
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder; 
    }
    public int getNivelPoder() {
        return nivelPoder; 
    }

    public void setDano(int dano) {
        this.dano = dano; }
    public int getDano() { return dano; 
    }

    // Puede pelear?
    
    public boolean puedePelear() {
        if (vida > 50 && nivelPoder > 1000) {
            System.out.println(nombreGuerrero + " entra en combate!");
            return true;
        } else {
            System.out.println(nombreGuerrero + " Es demasiado débil para pelear!");
            return false;
        }
        
    }

    //Recibir ataque
    
    public void recibirAtaque(int danoRecibido){
        vida = vida - danoRecibido;
        
        if(vida <= 0){
            vida = 0;
            System.out.println(nombreGuerrero + "Ha sido derrotado! "); 
        }
        else
            System.out.println("El guerrero " + nombreGuerrero + " ahora tiene " + vida + " puntos de vida!");
    }

    
}