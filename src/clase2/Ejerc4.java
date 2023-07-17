//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package clase2;

import java.util.Scanner;


public class Ejerc4 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
       int grado;
       int fah;
        System.out.println("coloca grados centigrados");
        
        
        grado = leer.nextInt();
        fah =32+(9* grado /5);
 

       System.out.println( fah

    );
     
    }
    
}
