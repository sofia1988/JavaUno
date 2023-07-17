/* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método en la clase de servicios para crear al estudiante, uno para mostrarlo y otro para mostrar por pantalla si el estudiante aprobó o no.
*/
package clase8;

import java.util.Scanner;


public class ServiciosEstudianteextra22 {
    Scanner leer = new Scanner(System.in);
    
    public Estudianteextra22 crearEstudiante(){
        System.out.println("coloca tu nombre ");
        String nombre = leer.next();
        System.out.println("coloca tu edad");
        int edad = leer.nextInt();
        System.out.println("coloca tu nota");
        double nota=leer.nextDouble();
        
        return new Estudianteextra22(nombre, edad, nota);
    }
    
    public void mostrarEstudiante(Estudianteextra22 x){
        System.out.println("el estudiante es :"+x.getNombre()+" "+x.getEdad()+" "+x.getNota());
    }
    
    public void siAprobo(Estudianteextra22 x){
        if(x.getNota() >= 7){
            System.out.println("este alumno aprobo");
        }else {
            System.out.println("este alumno no aprobo");
        }
    }
}
