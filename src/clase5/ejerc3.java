/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package clase5;

import java.util.Scanner;


public class ejerc3 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Coloca la longitud del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int contador =0;
        
   while (contador < n) {
            for(int i = 0; i < n; i++) {
                System.out.println("coloca un numero");
                int p = leer.nextInt();
                vector[i] = p;
               
                contador ++;
            }
        }
        
        System.out.println("este es " + contador);
    }

}
    
    

/* Definir num, dig, i, j Como Entero 
	
    Escribir "Ingrese un número"
    leer num
    j=1
    i= 0 + trunc(num/10)
    Mientras i>0 Hacer
        j=j+1
        i = 0 + trunc(i/10)
    FinMientras
    Escribir "La Cantidad de Digitos de: ", num, " es: ", j*/