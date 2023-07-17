package clase9;

import java.util.Arrays;

public class ServicioArreglo {

    public static void inicializarA(double[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 21.0;
            //  Math.random() * 20.0;error
            //x[i] = (double) (Math.random() * 20);de esta forma da 20 
        }

    }

    public static void mostrar(double[] x) {

        System.out.println(Arrays.toString(x));
    }

    public static void ordenar(double[] x) {
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }

    public static void inicializarB(double[] y, double[] x) {

        for (int i = 0; i < y.length; i++) {
            if (y[i] >= 0 && y[i] <= 10) {
                Arrays.fill(y, i, i, x[i]);
            } else {
                Arrays.fill(y, i, i, 0.5);
            }

        }
    }
    
    /*public static void inicializarB(double[] y, double[] x) {
    for (int i = 0; i < y.length; i++) {
        if (y[i] >= 0 && y[i] <= 10) {
            y[i] = x[i];
        } else {
            y[i] = 0.5;
        }
    }
}
*/
/*Recibe como parámetros dos arreglos de números reales: y y x.
Inicia un ciclo for que recorre el arreglo y desde el índice 0 hasta el índice y.length - 1.
Dentro del ciclo for, verifica si el valor en la posición i del arreglo y se encuentra entre 0 y 10, ambos inclusive, utilizando la expresión y[i] >= 0 && y[i] <= 10.
Si el valor se encuentra en ese rango, copia el valor en la misma posición del arreglo x en el arreglo y mediante la expresión Arrays.fill(y, i, i, x[i]).
Si el valor no se encuentra en el rango de 0 a 10, llena la posición correspondiente del arreglo y con el valor 0.5 utilizando la expresión Arrays.fill(y, i, i, 0.5).
Termina el ciclo for.
El método no retorna ningún valor.*/

}
