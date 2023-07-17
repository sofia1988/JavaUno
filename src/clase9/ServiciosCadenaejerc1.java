/*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
 /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.*/
 /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase*/
 /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario*/
 /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
 /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
/*Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
package clase9;

import java.util.Scanner;

public class ServiciosCadenaejerc1 {

    Scanner leer = new Scanner(System.in);

    public Cadenaejerc1 crear() {
        System.out.println("ingrese la frase");
        String frase = leer.nextLine();//para colocar frase funciono
        return new Cadenaejerc1(frase);
    }

    public void mostrarVocales(Cadenaejerc1 x) {
        int contador = 0;
        for (int i = 0; i < x.getLongitud(); i++) {
            char c = x.getFrase().charAt(i);//asi se comoca con char
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("la cantidad de vocales son :" + contador);
    }

    public void invertirFrase(Cadenaejerc1 x) {
        for (int i = x.getLongitud() - 1; i >= 0; i--) {
            char c = x.getFrase().charAt(i);
            System.out.print(c);
        }
        System.out.println();
    }

    public void vecesRepetido(Cadenaejerc1 x) {
        System.out.println("ingrese caracter a buscar ");
        char caracter = leer.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < x.getLongitud(); i++) {
            char c = x.getFrase().charAt(i);
            if (caracter == c) {  // para comparar char solo se hace con = en cambio string es solo para  equals.
                contador++;
            }
        }
        System.out.println("el caracter ingresado se repite :" + contador);
    }

    public void compararLongitud(Cadenaejerc1 x) {
        System.out.println("ingrese frase");
        leer.nextLine(); // consumir la línea vacía después de la lectura del número entero
        String frase = leer.nextLine();
        int largo = frase.length();
        if (largo == x.getLongitud()) {
            System.out.println("el largo de las frases son iguales");
        } else {
            System.out.println("no son iguales !");
        }

    }

    public void unirFrases(Cadenaejerc1 x) {
        System.out.println("ingrese frase");
        String frase = leer.nextLine();
        System.out.println(x.getFrase() + " " + frase);
    }

    public void reemplazar(Cadenaejerc1 x) {
        System.out.println("Ingrese el caracter a reemplazar:");
        char caracter = leer.next().charAt(0);
        System.out.println("Ingrese el caracter nuevo:");
        char nuevoCaracter = leer.next().charAt(0);
        String nuevaFrase = "";
        for (int i = 0; i < x.getLongitud(); i++) {
            char c = x.getFrase().charAt(i);
            if (c == caracter) {
                nuevaFrase += nuevoCaracter;
            } else {
                nuevaFrase += c;
            }
        }
        x.setFrase(nuevaFrase);
        System.out.println("La nueva frase es: " + x.getFrase());
    }
    
        public void contiene(Cadenaejerc1 x) {
        System.out.println("ingrese caracter a buscar ");
        char caracter = leer.next().charAt(0);
        boolean lotiene= false;
        for (int i = 0; i < x.getLongitud(); i++) {
            char c = x.getFrase().charAt(i);
            if (caracter == c) {  
                lotiene= true;
            }
        }
        if(lotiene){
            System.out.println("si lo tiene");
        }else{
            System.out.println("no lo tiene!");
        }
            
    }

}
