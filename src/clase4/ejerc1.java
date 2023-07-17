//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
//La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
package clase4;

import java.util.Scanner;


public class ejerc1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
         System.out.println("ingrese numeros");
         int n1=leer.nextInt();
         int n2=leer.nextInt();
         boolean salir = false;
         do {   
        
         System.out.println("elige 1 para sumar,2 para restar ,3 para multiplicar y 4 para dividir");
          int elegir =leer.nextInt();
         switch(elegir){
             case 1 :
                 int rdo = suma(n1, n2);
                 System.out.println("tu rdo es :"+ rdo);
                 break;
                   case 2:
                 int rdo1 = restar(n1, n2);
                 System.out.println("tu rdo es :"+ rdo1);
                 break;
                 case 3:
                 int rdo2 = multiplicar(n1, n2);
                 System.out.println("tu rdo es :"+ rdo2);
                 break;
                  case 4:
                 int rdo3= dividir(n1, n2);
                 System.out.println("tu rdo es :"+ rdo3);
                 break;
                 case 5:
               salir = true;
                System.out.println("a salido del menu");
                    break;
                 default:System.out.println("numero incorrecto");
         }
         
         
           System.out.println();    
      } while (!salir);
      
       
    }
    
    public static int suma (int a, int b){
        int c = a +b;
        return c;
        
    }
     
    public static int restar (int a, int b){
        int c = a - b;
        return c;
        
    }
      public static int multiplicar (int a, int b){
        int c = a * b;
        return c;
        
    }
      public static int dividir (int a, int b){
        int c = a / b;
        return c;
        
    }
}
