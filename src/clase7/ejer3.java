//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//Método constructor con todos los atributos pasados por parámetro.
//Método constructor sin los atributos pasados por parámetro.
//Métodos get y set.
//Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//Método sumar(): calcular la suma de los números y devolver el resultado al main.
//Método restar(): calcular la resta de los números y devolver el resultado al main
//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

package clase7;

import java.util.Scanner;


public class ejer3 {

    
    public static void main(String[] args) {
      //Scanner leer = new Scanner(System.in);
        
       
        operacionejer3 calcular1 = new operacionejer3();
       // int n1= leer.nextInt();
       // int n2= leer.nextInt();
        calcular1.crearOperacion();
       int r1 = calcular1.sumar();
       int r2= calcular1.restar();
       int r3= calcular1.multiplicar();
       int r4= calcular1.dividir();
        
        System.out.println(r1 +" " +r2+" "+ r3 +" "+r4);
        System.out.println(calcular1.getNumero1());
        System.out.println(calcular1.getNumero2());
    }
    
}
