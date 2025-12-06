package ejercicios;

public class Estacionamiento {
	private String nombre;
	private PilaAuto lugares;
	
	public Estacionamiento(String n) {
        lugares = new PilaAuto();
		this.nombre=n;
	}
	
	public boolean noHayLugar() {
		return lugares.estaLlena(); //retorna true cuando PilaAuto esta llena
	}
	
	public boolean ingresarAuto(AutoP a) {
		boolean valor = false;
		if(!lugares.estaLlena()) {
			lugares.meter(a);
			valor = true;
		}
		return valor;
	}

    public AutoP retirarAuto(int p){
        boolean encontre = false;
        AutoP a = null;
        PilaAuto aux = new PilaAuto();
        while(!encontre & !lugares.estaVacia()){
            a = lugares.sacar();
            if(a.getPatente() == p){
                encontre = true;
            }
            else{
                aux.meter(a);
            }  
        }
        while(!aux.estaVacia()){
            lugares.meter(aux.sacar());
        }
        if(encontre){
            return a;
        }else{
            return null;
        }

    }
	
}
