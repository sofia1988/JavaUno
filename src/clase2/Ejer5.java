//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
package clase2;

import java.util.Scanner;

public class Ejer5 {

 
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        int num1 ;
        int doble ;
        int triple;
        int raiz;
      
        System.out.println("coloca un numero");
        num1= leer.nextInt();
        doble = num1 * 2;
        triple = num1 *3;
        raiz = (int) Math.sqrt(num1);

        System.out.println(" " + doble+ " "+ triple+ " " + raiz );
      
    }
    
}
