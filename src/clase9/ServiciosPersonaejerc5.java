/*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.

Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.

Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.

Método mostrarPersona que muestra la información de la persona deseada.
 */
package clase9;

import java.util.Date;
import java.util.Scanner;

public class ServiciosPersonaejerc5 {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre:");
        String nombre = leer.next();

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("¿Qué día nació?");
        int dia = leer.nextInt();
        System.out.println("¿Qué mes nació? (Ingrese un número del 1 al 12)");
        int mes = leer.nextInt() - 1;
        System.out.println("¿En qué año nació?");
        int anio = leer.nextInt() - 1900;

        Date fechaNacimiento = new Date(anio, mes, dia);// retorna dos instancias de objetos 
        return new Persona(nombre, fechaNacimiento);
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Persona x) {
        return fechaActual().getYear() - x.getFechaNacimiento().getYear();
    }

    /*public int calcularEdad(Date fecha){
        Date actual = new Date();
        
        int dia = actual.getDate() - fecha.getDate();
        int mes = actual.getMonth() - fecha.getMonth();
        int year = actual.getYear() - fecha.getYear();
        if ((mes<0)||(mes==0 && dia<0)) {
            return year-1;
            
        }
        return year;*/
    public boolean menorQue(Persona x) {
        boolean valor = false;
        if (diferencia(x) < 18) {
            valor = true;
            System.out.println("es menor!");
        }
        return valor;
    }

    public void mostrarPersona(Persona x) {
        System.out.println(x.toString());
    }

}
