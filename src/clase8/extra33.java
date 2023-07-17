/* Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y en la clase servicio crear un método para agregar la mascota y otro para mostrar por pantalla la información de la mascota.
También crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
*/
package clase8;


public class extra33 {

   
    public static void main(String[] args) {
       ServiciosMascotaextra33 servicios= new ServiciosMascotaextra33();
       
       Mascotaextra33 m1= servicios.crearMascota();
       servicios.mostrar(m1);
       servicios.cumplirAnios(m1);
       //servicios.cumplirAnios(m1);
          
    }
    
}
