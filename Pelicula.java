
package peliculaapp.entidades;

import java.util.Scanner;


public class Pelicula {
    
    Scanner leer= new Scanner(System.in);
    
    private String titulo;
    private String director;
    private int duracion;
    
    public void Pelicula(){
        
    }
    
    public void Pelicula(String titulo, String director, int duracion){
        this.titulo= titulo;
        this.director= director;
        this.duracion= duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    
    
    
}
