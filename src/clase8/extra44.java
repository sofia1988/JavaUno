/*Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
En la clase servicio:
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
*/
package clase8;

public class extra44 {

  
    public static void main(String[] args) {
       ServiviosAscensorextra4 servicios= new ServiviosAscensorextra4();
       
       Ascensorextra44 a1 = servicios.crear();
       servicios.ascensor(a1);
    }
    
}
