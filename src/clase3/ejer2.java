//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
//Nota: investigar la función equals() en Java.
package clase3;

import java.util.Scanner;


public class ejer2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println( "coloca una palabra");
        String palabra;
        palabra= leer.nextLine();
        if(palabra.equals("eureka")){
            System.out.println( "su mensaje es correcto");
        }else{
            System.out.println( "su mensaje es incorrecto");
        }
    }
    
}
