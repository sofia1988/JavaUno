//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
//Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
package clase7;

import java.util.Scanner;

public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println( "coloca los datos del libro");
        libroejer1 libro1 = new libroejer1();
        libro1.ISBN = leer.nextLine();
        libro1.autor =leer.nextLine();
        libro1.aítulo =leer.nextLine();
        libro1.númeroPginas = leer.nextLine();
        
        System.out.println(libro1.ISBN +" " + libro1.autor +" " +libro1.aítulo + " " + libro1.númeroPginas);
     
    }
    
}
