/* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método en la clase de servicios para crear al estudiante, uno para mostrarlo y otro para mostrar por pantalla si el estudiante aprobó o no.
*/
package clase8;


public class extra22 {

    public static void main(String[] args) {
     ServiciosEstudianteextra22 servicios= new ServiciosEstudianteextra22();
     
     Estudianteextra22 e1 = servicios.crearEstudiante();
     servicios.mostrarEstudiante(e1);
     servicios.siAprobo(e1);
    }
    
}
