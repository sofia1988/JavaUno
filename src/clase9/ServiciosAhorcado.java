/* Definir los siguientes métodos en AhorcadoService:

Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra
    en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

Método buscar(letra):  este método recibe una letra dada por el usuario y 
    busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
    muestre cuantas letras han sido encontradas y cuántas le faltan.
    Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 */
 /* Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra: a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4*/
package clase9;

import java.util.Scanner;

public class ServiciosAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        String[] buscar = letras();
        System.out.println("ingrese la cantidad de jugadas maximas");
        int jugadasMaximas = leer.nextInt();

        return new Ahorcado(buscar, jugadasMaximas);
    }

    public String[] letras() {
        System.out.println("Ingrese la palabra:");
        String palabra = leer.nextLine();
        String[] letras = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = "" + palabra.charAt(i);
        }
        return letras;
    }

    /* Character.toString(buscar.charAt(i));
    En el código buscar.charAt(i) obtiene el carácter en la posición i de la cadena buscar, y Character.toString() lo convierte en una cadena de texto. Luego,
    el resultado se almacena en el elemento correspondiente del arreglo caracteres.
    En lugar de utilizar Character.toString(), concatenamos la cadena vacía "" con el carácter en la posición i de la cadena buscar.
    Esta concatenación convierte implícitamente el carácter en una cadena de texto (String).*/
    public void metodoLongitud(Ahorcado x) {
        System.out.println("la longitud de la palabra es : " + x.getBuscar().length);
    }

    public String pedirLetraUsuario() {

        System.out.println("ponga una letra");
        String letra = leer.next();
        return letra;
    }

    public void buscar(Ahorcado x) {
        boolean valor = false;

        for (int i = 0; i < x.getJugadasMaximas(); i++) {
            if (x.getBuscar()[i].equals(pedirLetraUsuario())) {
                valor = true;
                break;
            }
        }
        if (valor) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("ups !la letra no estaba");
        }

    }

    /* Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
    muestre cuantas letras han sido encontradas y cuántas le faltan.
    
    Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.*/

    public void encontradas(Ahorcado x) {
        int encontradas = 0;
      
        boolean valor = false;
        for (int i = 0; i < x.getBuscar().length; i++) {
            if (x.getBuscar()[i].equals(pedirLetraUsuario())) {
                encontradas++;
                valor= true;
            }else{
                 x.setJugadasMaximas(x.getJugadasMaximas()-1);
            }
        }
       
      int cuantasFaltan = x.getBuscar().length -encontradas;
        
      
    }

}
