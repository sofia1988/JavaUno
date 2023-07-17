/*El comparador (Comparator) es una interfaz funcional que define un método compare que compara dos objetos. 
El método compare devuelve un número negativo si el primer objeto es menor que el segundo, cero si son iguales y un número positivo si el primer objeto es mayor que el segundo.

El uso de Collections.sort es útil cuando se necesita ordenar una lista de objetos en una determinada forma, por ejemplo, para ordenar una lista de cadenas en orden alfabético
o para ordenar una lista de objetos personalizados según un cierto criterio definido por el programador.*/
package clase10;


import java.util.Comparator;

public class ComparadoresVideo {
     // ArrayList<ArrayList<String>> matriz= new ArrayList();//dentro las filas y el de afuera las columnas.
    public static Comparator<MascotasVideo> ordenarNombreDesc = new Comparator<MascotasVideo>() {
        @Override
        public int compare(MascotasVideo t, MascotasVideo t1) {// hace una comparacion entre atributos u objetos y devulve un valor.si es un numero tiene que ser integer no int .
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
  
}
/*Si se usa t1.getNombre().compareTo(t.getNombre()), estás comparando t1 con t en orden descendente. 
Esto significa que el resultado de la comparación será negativo si el nombre de t1 es mayor alfabéticamente que el nombre de t, y positivo si es menor.
Por lo tanto, al invertir el orden en la comparación, se obtiene un orden descendente según el nombre.

Si en cambio se utilizara t.getNombre().compareTo(t1.getNombre()), estarías comparando t con t1 en orden ascendente.
En este caso, el resultado de la comparación sería negativo si el nombre de t es mayor alfabéticamente que el nombre de t1, y positivo si es menor. Esto resultaría en un orden ascendente según el nombre.*/


/*Ejemplo: Si t1 es "Perro" y t es "Gato", entonces t1 es mayor que t porque "Perro" viene después de "Gato" alfabéticamente.*/

/*Ejemplo: Si t es "Elefante" y t1 es "Gato", entonces t es mayor que t1 porque "Elefante" viene después de "Gato" alfabéticamente.*/