/*Defina una clase llamada DivisionNumero.
En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
package clase13;

import java.util.Scanner;

public class ejerc3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("coloca un numero");
        String uno = leer.next();
        System.out.println("coloca un numero");
        String dos = leer.next();

        try {
            int uno1 = Integer.parseInt(uno);
            int uno2 = Integer.parseInt(dos);

            DivisionNumero div = new DivisionNumero(uno1, uno2);
            System.out.println("el rdo es" + div.division());
        } catch (ExceptionDivisionEJERC3 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
