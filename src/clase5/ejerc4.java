/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/
package clase5;

import java.util.Random;

public class ejerc4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        int[][] transpuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                transpuesta[j][i] = matriz[i][j];
            }

        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

    }

}
