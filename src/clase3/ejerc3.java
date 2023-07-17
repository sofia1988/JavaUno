//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//Nota: investigar la función Lenght() en Java.
package clase3;

import java.util.Scanner;


public class ejerc3 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println( "coloca una palabra");
        String palabra;
        palabra= leer.nextLine();
        if(palabra.length()==8){
            System.out.println( "su mensaje es correcto");
        }else{
            System.out.println( "su mensaje es incorrecto");
        }
    }
    }
    

