
package clase7;

public class extra1 {

  
    public static void main(String[] args) {
        Cancionextr1 objeto1 = new Cancionextr1("cancion1","sofia");
       Cancionextr1 objeto2 = new Cancionextr1();
          
          System.out.println(objeto1.getAutor());
           System.out.println(objeto1.getTitulo());
           objeto1.cargarDatos();
  
        System.out.println(objeto2.toString());
        
          
        
    
    }
    
}
