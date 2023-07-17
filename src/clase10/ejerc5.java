/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
package clase10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejerc5 {

    public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String pais;

        // Leer y guardar países hasta que el usuario decida salir
        while (true) {
            System.out.print("Ingrese un país (o 'salir' para terminar): ");
            pais = scanner.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                break;
            }

            paises.add(pais);
        }

        // Mostrar todos los países guardados
        System.out.println("Países guardados:");
        for (String p : paises) {
            System.out.println(p);
        }

        // Ordenar y mostrar el conjunto alfabéticamente
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("Países ordenados alfabéticamente:");
        for (String p : paisesOrdenados) {
            System.out.println(p);
        }

        // Pedir al usuario un país para eliminar
        System.out.print("Ingrese un país para eliminar: ");
        pais = scanner.nextLine();

        // Buscar y eliminar el país del conjunto
        Iterator<String> iterator = paises.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String p = iterator.next();
            if (p.equalsIgnoreCase(pais)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        // Mostrar el conjunto después de eliminar el país (si se encontró)
        if (encontrado) {
            System.out.println("País eliminado. Países restantes:");
            for (String p : paises) {
                System.out.println(p);
            }
        } else {
            System.out.println("El país no se encontró en el conjunto.");
        }

    }

}
