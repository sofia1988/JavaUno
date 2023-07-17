/* Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea clase de servicio con los métodos "ingresarCoche" y "mostrarCoche".
*/
package clase8;


public class extra11 {

   
    public static void main(String[] args) {
      ServiciosCocheextra11 servicio = new ServiciosCocheextra11();
      
      Cocheextra11 c1 = servicio.ingresarCoche();
       
       servicio.mostrarCoche(c1);
    }
    
}
