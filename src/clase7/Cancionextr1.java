
package clase7;

import java.util.Scanner;


public class Cancionextr1 {
    
      private String titulo;
      private String autor;

    public Cancionextr1() {
    }

    public Cancionextr1(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
     public void cargarDatos() {  
         Scanner leer = new Scanner(System.in);
         System.out.println( "cargar titulo");
         this.titulo = leer.next();
          System.out.println( "cargar autor");
         this.autor = leer.next();
    

    }
     

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancionextr1{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }
      
    
      
}
