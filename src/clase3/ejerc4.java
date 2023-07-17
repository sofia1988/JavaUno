//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Substring y equals() de Java.
package clase3;

import java.util.Scanner;


public class ejerc4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println( "coloca una palabra");
        String palabra;
        palabra= leer.nextLine();
       
        if(palabra.substring(0).equals("a")){
            System.out.println( "su mensaje es correcto");
        }else{
            System.out.println( "su mensaje es incorrecto");
        }
     
    }
    
}
