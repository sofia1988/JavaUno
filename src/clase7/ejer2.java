//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

package clase7;

import java.util.Scanner;


public class ejer2 {

   
    public static void main(String[] args) {
     
        Circunferenciaejer2 calcular1 = new Circunferenciaejer2();
      
        
       calcular1.inicialice();
       float a = calcular1.crearArea();
       float p = calcular1.crearPerimetro();
        
        
       System.out.println("este es el valo de radio guardad: " + calcular1.getRadio()+" el area:  "+a +" el perimetro: "+p);
    }
    
}
