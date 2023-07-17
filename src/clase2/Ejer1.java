//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
//suma
package clase2;

import java.util.Scanner;


public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 ;
        int num2;
        System.out.println("coloca un numero");
        num1= leer.nextInt();
        num2= leer.nextInt();
        int suma = num1 + num2;
        System.out.println("la suma es " + suma);
                
        
    }
    
}
