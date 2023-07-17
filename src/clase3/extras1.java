//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

package clase3;

import java.util.Scanner;


public class extras1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
   
        System.out.println( "coloca en minutos");
        num1= leer.nextInt();
        int  dias = num1 /1440;
        int mod = num1 % 1440;
        int horas= mod /60;
     
        System.out.println(num1 + " minutos equivalen a " + dias + " días y " + horas + " horas.");
        
      
    }
    
}
