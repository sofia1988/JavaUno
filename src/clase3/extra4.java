//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
package clase3;

import java.util.Scanner;


public class extra4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
   
        System.out.println( "coloca un numero");
        num= leer.nextInt();
        
        if (num >= 1 && num <=10) {
           switch(num){
               case 1:System.out.println("tu numero romano es I");
               break;
               case 2:System.out.println("tu numero romano es II");
               break;
                case 3:System.out.println("tu numero romano es III");
               break;
               case 4:System.out.println("tu numero romano es IV");
               break;
               case 5:System.out.println("tu numero romano es V");
               break;
               case 6:System.out.println("tu numero romano es VI");
               break;
               case 7:System.out.println("tu numero romano es VII");
               break;
               case 8:System.out.println("tu numero romano es VIII");
               break;
               case 9:System.out.println("tu numero romano es IX");
               break;
               case 10:System.out.println("tu numero romano es X");
               break;
           }
            
        } else {
            System.out.println("incorrecto");
        }
    }
    
}
