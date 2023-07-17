/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona,
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package clase4;

import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("coloca un numero de personas");
        int numPersonas = leer.nextInt();
        int contador = 0;

        while (contador < numPersonas) {
            persona(leer);
            contador++;
            System.out.println("¿Quieres seguir? (si/no)");
            String elegir = leer.next();
            if (elegir.equals("si")) {
                continue;
            } else if (elegir.equals("no")) {
                System.out.println("saliste del programa");
                break;
            } else {
                System.out.println("incorrecto");
            }
        }
        
        
        /*     do {
            persona(leer);
            contador++;
            System.out.println("¿Quieres ingresar otra persona? (s/n)");
        } while (leer.next().charAt(0) == 's' && contador < numPersonas);

        System.out.println("Programa finalizado.");
    }*/

    }

    public static void persona(Scanner leer ) {
        System.out.println("coloca tu nombre");
        String nombre = leer.next();
        System.out.println("coloca tu edad");
        int edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println("tu nombre es: " + nombre + " y tu edad es: " + edad + "eres mayor de edad");
        } else {
            System.out.println("tu nombre es: " + nombre + " y tu edad es: " + edad + "eres menor de edad");
        }
    }

}
