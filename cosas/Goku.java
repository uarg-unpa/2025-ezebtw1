package cosas;

    //clase y atributos

public class Goku {
    private int fase;
    private String ataque;
    private String enemigo;

    //constructor

 public Goku(int fase, String ataque, String enemigo){
    this.fase = fase;
    this.ataque = ataque;
    this.enemigo = enemigo;

 }

    //setters y getters (metodos)

    public void setFase(int fase){
        this.fase = fase;
    }
    public int getFase(){
        return fase;
    }
    public void setAtaque(String ataque){
        this.ataque = ataque;
    }
    public String getAtaque(){
        return ataque;
    }
    public void setEnemigo(String enemigo){
        this.enemigo = enemigo;
    }
    public String getEnemigo(){
        return enemigo;
    }

    public String toString(){
        return "Goku [fase " + fase + " atacó con " + ataque + " a " + enemigo + " !!! " + "]";
    }

   
}
