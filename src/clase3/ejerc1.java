//Crear un programa que dado un número determine si es par o impar.

package clase3;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class ejerc1 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println( "coloca un numero");
        int num;
        num= leer.nextInt();
        
        if(num % 2 ==0){
            System.out.println( "el numero es par");
        }else{
             System.out.println( "el numero es impar");
        }
    }
    
}
