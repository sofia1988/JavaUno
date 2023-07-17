/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
package clase10;

import java.util.ArrayList;
import java.util.Scanner;


public class ejerc1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        String valor = "si";
        do {
            System.out.println("ingrese la raza de perro");
            String raza = leer.next();
            perros.add(raza);
            System.err.println("quiere guardar otro perro o si quiere salir");
            valor = leer.next();

        } while (valor.equals("si"));

        if (valor != "si") {
            System.out.println("la lista de perros :" + perros.toString());
        }

        do {
            System.out.println("coloque la raza del perro");
            String pRaza = leer.next();
            for (int i = 0; i < perros.size(); i++) {
                if (perros.get(i).equals(pRaza)) {
                    perros.remove(i);
                }else{
                    System.out.println("No esta en la lista! ,la lista de perros :" + perros.toString());
                }
            }
            System.out.println("tu lista de perros es : "+  perros.toString());
            System.err.println("quiere colocar otra raza ?");
            valor = leer.next();
        } while (valor.equals("si"));
        
    }

}
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá  un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro  está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista  ordenada.
Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará  la lista ordenada.*/
