//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el 
//resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

package clase3;

import java.util.Scanner;


public class ejer6 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int num1;
        int num2;
        int s,r,m,d;
        String letra;
        
        System.out.println( "coloca un numero");
        num1= leer.nextInt();
        System.out.println( "coloca un numero");
        num2=leer.nextInt();
        System.out.println( "coloca una letra");
        letra=leer.next();
        
        s= num1 + num2;
        r= num1 -num2;
        m =num1 * num2;
        d = num1 /num2;
        
        switch(letra) {
            case "s":System.out.println("la suma es " + s);
            break;
             case "r":System.out.println("la resta es " + r);
            break;
             case "m":System.out.println("la multiplicaion es " + m);
            break;
             case "d":System.out.println("la division es " + d);
            break;
        }
    }
    
}
