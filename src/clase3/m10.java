//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

package clase3;

import java.util.Scanner;


public class m10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      
       int num;
       
        System.out.println("coloca una opcion");
        
        
        num = leer.nextInt();
        for(int i =0;i < num ;i++){
             System.out.print( "*");
            
        }
    }
    
}
