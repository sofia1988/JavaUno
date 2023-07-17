//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package clase3;

import java.util.Scanner;


public class extra6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas;
        double altura;
        int contador=0;
        double sumador = 0;
   
        System.out.println( "coloca el numero de personas");
        personas= leer.nextInt();
      
        
        while (contador < personas ) {            
             altura =leer.nextDouble();
              sumador = sumador + altura ;
              contador = contador + 1;
        }
     
        
      double promedio = sumador / personas ;
      if (promedio < 1.60){
          System.out.println("su promedio por debajo de 1.60" +  promedio);
      }else{
          System.out.println("No hay estaturas por debajo de 1.60 mts.");
      }
      
    }
    
}
