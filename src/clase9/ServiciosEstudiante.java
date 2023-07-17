
package clase9;

import java.util.Scanner;


public class ServiciosEstudiante {
    
    Scanner leer = new Scanner(System.in);
    
    public Estudiante crearEstudiante(){
        System.out.println("coloca el nombre del alumno");
        String nombre = leer.next();
        System.out.println("coloca la nota final del alumno");
        double nota= leer.nextDouble();
        return new Estudiante(nombre, nota);
    }
    
  
    
}
