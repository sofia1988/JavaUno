/*Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.

Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package clase9;

import java.util.Date;
import java.util.Scanner;

public class ServiciosFecha {

    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        System.out.println("que dia naciste ?");
        int Day = leer.nextInt();
        System.out.println("que mes naciste ?");
        int Month = leer.nextInt() - 1;
        System.out.println("que anio naciste ?");
        int Year = leer.nextInt() - 1900;

        return new Date(Year, Month, Day);// retorna una instancia del objeto
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date x) {
        return fechaActual().getYear() - x.getYear();
    }
}
