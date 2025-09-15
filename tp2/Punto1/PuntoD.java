 //Televisor atributos y métodos

package tp2.Punto1;

public class PuntoD {
    private double pulgadas;
    private int resolucion;
    private boolean smart;

    public void setPulgadas(double pulgadas){
        this.pulgadas = pulgadas;
    }
    public double getPulgadas(){
        return pulgadas;
    }
    public void setResolucion( int resolucion){
        this.resolucion = resolucion;
    }
    public int getResolucion(){
        return resolucion;
    }
    public void setSmart(boolean smart){
        this.smart = smart;
    }
    public boolean getSmart(){
        return smart;
    }
}
