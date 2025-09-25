package tp2;

  public class Libro{
    private String titulo;
    private String autor;
    private int anioPublicacion; 
    private int cantidadPaginas;

  

      //Constructores
     public Libro(String titulo, String autor, int anioPublicacion, int cantidadPaginas){

        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.cantidadPaginas=cantidadPaginas;
     }
  

    //metodos set y get
    public void setTitulo(String titulo){
    this.titulo=titulo;
    }
  
    public String getTitulo(){
    return this.titulo;
    }

    public void setAutor(String autor){
      this.autor = autor;
    }
    public String getAutor(){
      return autor;
    }

    public void setAnioPublicacion(int anioPublicacion){
      this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion(){
      return anioPublicacion;
    }

    public void setCantidadPaginas(int cantidadPaginas){
      this.cantidadPaginas = cantidadPaginas;
    }
    public int getCantidadPaginas(){
      return cantidadPaginas;
    }
  
    
    public boolean esReciente(){

      if (this.anioPublicacion>2010){

          System.out.println("El libro es reciente");
          return true;
      }
      else{
        System.out.println("El libro no es reciente");
        return false;
      }
    }
    
}


