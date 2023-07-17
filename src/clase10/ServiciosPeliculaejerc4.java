package clase10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiciosPeliculaejerc4 {

    Scanner leer = new Scanner(System.in);
    ArrayList<Peliculasejer4> peliculas;

    public ServiciosPeliculaejerc4() {
        peliculas = new ArrayList<>();
    }

    public Peliculasejer4 crearPelicula() {
        System.out.println("coloca el nombre de la pelicula :");
        String nombre = leer.next();
        System.out.println("coloca el nombre del autor:");
        String autor = leer.next();
        System.out.println("coloca la duracion de la pelicula:");
        Double duracionPelicula = leer.nextDouble();

        return new Peliculasejer4(nombre, autor, duracionPelicula);
    }

    public void agregarPelicula(Peliculasejer4 x) {
        peliculas.add(x);

    }

    public void quiereCrearPelicula() {
        String valor;
        do {
            System.out.println("¿Quiere crear otra pelicula?");
            valor = leer.next();
            if (valor.equals("si")) {
                agregarPelicula(crearPelicula());
            }
        } while (valor.equals("si"));
    }

    public void mostrarPeliculas() {
        System.out.println("Las peliculas actuales de la lista son:");
        for (int i = 0; i < peliculas.size(); i++) {
            Peliculasejer4 aux = peliculas.get(i);
            System.out.println(aux.toString());
        }
    }

    public void mayorUnaHora() {
        System.out.println("las peliculas mayores a una hora son : ");
        for (int i = 0; i < peliculas.size(); i++) {
            Peliculasejer4 al = peliculas.get(i);

            if (al.getDuracionPelicula() > 60) {
                System.out.println(al.toString());
            }

        }
    }

    public void ordenarMenor() {
        Collections.sort(peliculas, ComparadoresPeliculaejerc4.ordenardeMenor);
        System.out.println("las peliculas de menor a mayor son : ");
        for (Peliculasejer4 pelis : peliculas) {
            System.out.println(pelis);
        }
    }

    public void ordenarMayor() {
        Collections.sort(peliculas, ComparadoresPeliculaejerc4.ordenardeMayor);
        System.out.println("las peliculas de mayor a menor son : ");
        for (Peliculasejer4 pelis : peliculas) {
            System.out.println(pelis);
        }
    }

    public void ordenarNombreDesc() {
        Collections.sort(peliculas, ComparadoresPeliculaejerc4.ordenarNombreDesc);
        System.out.println("las peliculas en orden descendente : ");
        for (Peliculasejer4 pelis : peliculas) {
            System.out.println(pelis);
        }
    }

    public void ordenarNombreAsce() {
        Collections.sort(peliculas, ComparadoresPeliculaejerc4.ordenarNombreAsce);
        System.out.println("las peliculas en orden ascendente : ");
        for (Peliculasejer4 pelis : peliculas) {
            System.out.println(pelis);
        }
    }
}
