//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

package clase3;

import java.util.Scanner;


public class ejer8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
   
        System.out.println( "coloca un numero");
        num1= leer.nextInt();
        for (int i = 1; i <=num1; i++) {
            for (int j = 1; j <= num1; j++) {
                if( i>1 && i<num1 && j>1 && j<num1){
                    System.out.print(" ");
            }else {
                    System.out.print("*");
                }
           
            }
             System.out.println("");
        }
      
       
    }
    
}
