/*3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y en la clase servicio crear un método para agregar la mascota y otro para mostrar por pantalla la información de la mascota.
También crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
*/
package clase8;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

public class ServiciosMascotaextra33 {
    Scanner leer = new Scanner(System.in);
    
    public Mascotaextra33 crearMascota(){
        System.out.println("coloca su nombre");
        String nombre =leer.next();
        System.out.println("coloca su edad");
        int edad= leer.nextInt();
        System.out.println("coloca su raza");
        String raza= leer.next();
        System.out.println("coloca el tipo");
        String tipo =leer.next();
        return new Mascotaextra33(nombre, edad, raza, tipo);
    }
    
    public void mostrar(Mascotaextra33 x){
        System.out.println("tu mascota es : "+x.getNombre()+" " +x.getRaza()+ " "+x.getTipo());
    }
    
    public void cumplirAnios(Mascotaextra33 x){
       x.setEdad(x.getEdad()+1 );
       System.out.println("feliz cumple !"+ x.getNombre()+" hoy cumples :"+x.getEdad());
    }
}
