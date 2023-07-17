/*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
solicitando en cada repetición que se ingrese el nombre de cada alumno.

Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos

Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
y la cantidad de días a la semana que se repite el encuentro.
 */
package clase9;

import java.util.Scanner;

public class ServiciosCursosejerc6 {

    Scanner leer = new Scanner(System.in);

    public void cargarAlumnos(Cursoejerc6 x) {
        for (int i = 0; i < x.getAlumno().length; i++) {
            System.out.println("coloca el nombre del alumno");
            x.getAlumno()[i] = leer.next();
        }
    }

    public Cursoejerc6 crearCurso() {
        System.out.println("coloca el nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("coloca la cantidadHorasPorDia");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("coloca la cantidadDiasPorSemana");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("coloca que turno es ");
        String turno = leer.next();
        System.out.println("coloca el precio x hora");
        int precioPorHora = leer.nextInt();
        Cursoejerc6 x = new Cursoejerc6(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);
        cargarAlumnos(x);
        return x;

    }

    public void calcularGananciaSemanal(Cursoejerc6 x) {
        int ganancia = x.getCantidadHorasPorDia() * x.getCantidadDiasPorSemana() * x.getAlumno().length * x.getPrecioPorHora();
        System.out.println("La ganancia semanal del curso " + x.getNombreCurso() + " es de: " + ganancia + " pesos.");
    }
    
    public void mostrarDatosCurso(Cursoejerc6 x){
        System.out.println("tus datos del curso son"+ x.toString());
    }

  
}
