/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main*/
package clase12;


public class ejerc1 {

   
    public static void main(String[] args) {
      AnimalEJERC1 PerrO1 = new PerroEJERC1("cabrito", "dogui", "calle", 8);
      PerrO1.alimentarse();
      
      AnimalEJERC1 gato1 = new GatoEJERC1("rita", "vital cane", "negrita", 2);
      gato1.alimentarse();
      
      /* una clase abstracta puede contener tanto métodos abstractos como métodos concretos. Los métodos abstractos deben ser implementados por las subclases, 
     mientras que los métodos concretos pueden ser utilizados directamente desde la clase abstracta o sobrescritos en las subclases si es necesario.
    }*/
    } 
}
