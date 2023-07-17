//Escriba un programa en el cual se ingrese un valor límite positivo,
//y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package clase3;

import java.util.Scanner;


public class ejerc5 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println( "coloca un numero");
        int num;
        int v;
        int total= 0;
        num = leer.nextInt();
        if (num > 0 ){
             while (total != num){
             System.out.println( "coloca un numero para sumar");
             v =leer.nextInt();
             total = total + v;
        }
            System.out.println(total);
        }else {
            System.out.println("error tiene que ser positivo");
        }
          
   
    }
}
    
     
     
    
        
    
    

