/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/
package clase11;

public class ejerc1 {

    public static void main(String[] args) {

        PersonaEjerc1 persona2 = new PersonaEjerc1();
        // persona1.setNombre("sofia");
        persona2.setNombre("david");
        PerroEjerci1 perro1 = new PerroEjerci1("pelusa", "callejero", 2, 1.5);
        PerroEjerci1 perro2 = new PerroEjerci1("cabrito", "callejero", 5, 1.1);
        PersonaEjerc1 persona1 = new PersonaEjerc1("sofia", "ruiz", 35, 33689649, perro1);

        // persona1.setPerro(perro2);
        persona2.setPerro(perro2);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}
