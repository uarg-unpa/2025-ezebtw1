package parcial;

public class Rectangulo{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }


    public void calcularArea(double areaRectangulo){
        areaRectangulo = base * altura;
        System.out.println(areaRectangulo);
    }
    public void calcularPerimetro(double perimetroRectangulo){
        perimetroRectangulo = (base * 2.0) + (altura * 2.0);
    }

    public void esMayorElArea(double otroRectangulo){
        otroRectangulo = base * altura;
    }
    
}