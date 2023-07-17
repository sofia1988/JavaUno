/*
 * Los objetos tienen estado y comprtamiento.
Por ejemplo, el perro tiene estado (color, nombre, raza, edad)
y el comportamiento (ladrar, caminar, comer, acostarse, mover la cola)
 * estado = atributos
El comportamiento es una lista de métodos, procedimientos, funciones u operaciones
Los objetos también se conocen como instancias.
modificadores de visibilidad: public, protected, private.
Los constructores con métodos propios del objeto que nos permiten CREARLO. A la creación de un objeto se le denomina INSTANCIACIÓN.
Para diferenciar entre los atributos del objeto y los identificadores de los parámetros del método constructor, se utiliza la palabra this. De esta forma, los parámetros del método pueden tener el mismo nombre que los atributos de la clase.
instancia = objeto
 Al hecho de proteger los datos o atributos con los métodos se denomina encapsulamiento.
abstracion=es dejar de verlo como un todo al objeto y verlo por partes ... raza ,edad ,color
 * Encapsulamiento= que podes usar los metodos desde otros objetos .
Modificadores de Acceso=Public,Private(Es decir, un objeto de una determinada clase puede acceder a los atributos privados de otro objeto de la misma clase.
),Protected.
Métodos propios= funciones que determinan el comportamiento de los objetos. 
tipo de retorno: el tipo de retorno indica el tipo de valor devuelto por el método. Si el método no devuelve un valor, debe ser declarado void.
argumento: permite que los valores de los argumentos sean pasados hacia el método. 
Existen tres tipos de métodos: métodos de consulta, métodos modificadores y operaciones. Los métodos de consulta sirven para extraer información de los objetos, los métodos modificadores sirven para modificar el valor de los atributos del objeto y las operaciones definen el comportamiento de un objeto.
Para acceder a los atributos de un objeto se definen los métodos get y set. Los métodos get se utilizan para consultar el estado de un objeto y los métodos set para modificar su estado.
 Un método get se declara public y a continuación se indica el tipo de dato que devuelve.
La lista de parámetros de un método get queda vacía.
un método set se declara public y devuelve void.
La lista de parámetros de un método set incluye el tipo y el valor a modificar.
Antes de POO, la técnica estándar de programación era la programación procedural. Se denomina programación procedural porque en ella se destacan los procedimientos o tareas que resuelven un problema. Se piensa primero en lo que se quiere hacer: los procedimientos.
 */
package clase7;

public class Persona {

    public String nombre;
    public int edad;
    public String genero;

    Persona() {

    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

}
