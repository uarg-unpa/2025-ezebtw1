package tp2;

  public class Libro{
    private String titulo;
    private String autor;
    private int anioPublicacion; 
    private int cantidadPaginas;

  }

      //Constructores
     public Libro(String titulo, String autor, int anioPublicacion, int cantidadPaginas){

        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion;
        this.cantidadPaginas;
}
    //metodos set y get
    public void setTitulo(String titulo){
    this.titulo=titulo;
    }
    public String getTitulo(){
    return this.titulo;
    }
    public boolean esReciente(){
        if (this.anioPublicacion>2010)
             return true;
        else
            return false;
    }
   //Constructor
     public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
      }
    

