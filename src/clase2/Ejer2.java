//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package clase2;

import java.util.Scanner;

public class Ejer2 {
     public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
      
       String nombre;
        System.out.println("coloca tu nombre");
        
        
        nombre= leer.nextLine();
       
       
        System.out.println("tu nombre es " + nombre);
        
     }
     
    
}
