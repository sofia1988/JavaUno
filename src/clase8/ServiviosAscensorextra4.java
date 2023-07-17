/* Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
En la clase servicio:
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo,
yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
 */
package clase8;

import java.util.Scanner;

public class ServiviosAscensorextra4 {

    Scanner leer = new Scanner(System.in);

    public Ascensorextra44 crear() {
        System.out.println("ingrese el piso actual");
        int pisoActual = leer.nextInt();
        System.out.println("ingrese el maximo de pisos del edificio");
        int maximoPisos = leer.nextInt();

        return new Ascensorextra44(pisoActual, maximoPisos);
    }

    public void subir(Ascensorextra44 x) {
        if (x.getPisoActual() < x.getMaximoPisos()) {
            x.setPisoActual(x.getPisoActual() + 1);
        } else {
            System.out.println("error estas por encima del maximo");
        }

    }

    public void bajar(Ascensorextra44 x) {
        if (x.getPisoActual() > 0) {
            x.setPisoActual(x.getPisoActual() - 1);
        } else {
            System.out.println("error estas por debajo del maximo");
        }

    }

    public void irA(Ascensorextra44 x) {
        System.out.println("que piso desea ir ?");
        int pisoDesea = leer.nextInt();
        x.setPisoActual(pisoDesea);
        System.out.println("su piso actual es :" + x.getPisoActual());

    }

    public void ascensor(Ascensorextra44 x) {
        boolean salir = false;

        while (!salir) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Ir a un piso específico");
            System.out.println("4. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    subir(x);
                    break;
                case 2:
                    bajar(x);
                    break;
                case 3:
                    irA(x);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }

            System.out.println("El ascensor está en el piso " + x.getPisoActual());
            System.out.println();
        }
    }

}
