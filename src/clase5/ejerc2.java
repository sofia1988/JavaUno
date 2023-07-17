/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido*/
package clase5;


import java.util.Random;
import java.util.Scanner;


public class ejerc2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloca la longitud del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(4) + 1;
        }

        System.out.println("Ingrese un número a buscar:");
        int numeroBuscado = leer.nextInt();

        boolean encontrado = false;
        int posicion = -1;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                encontrado = true;
                posicion = i;
                contador++;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + posicion);
            System.out.println("El número " + numeroBuscado + " se encontró " + contador + " veces");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector");
        }
    }
}