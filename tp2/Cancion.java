package tp2;

public class Cancion {

 private String artista;
 private String nombre;
 private String album;
 private int duracion;

    public Cancion(String artista, String nombre, String album, int duracion){
        this.artista = artista;
        this.nombre = nombre;
        this.album = album;
        this.duracion = duracion;
    }

    public void setArtista(String artista){
        this.artista=artista;
    }
    public String getArtista(){
        return this.artista;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setAlbum(String album){
        this.album=album;
    }
    public String getAlbum(){
        return this.album;
    }

    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public int getDuracion(){
        return this.duracion;
    }



}