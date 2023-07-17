/* El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  */
package clase9;

import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MesSecretoextra1 mesSecreto = new MesSecretoextra1();

        String ingreso;
        boolean adivino = false;
        do {

            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            ingreso = leer.nextLine();
            if (ingreso.equals(mesSecreto.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                adivino = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (!adivino);

    }

}
/* // Elegimos un mes secreto al azar
        String mesSecreto = meses[(int) (Math.random() * meses.length)];*/
/* Random random = new Random();
    String mesSecreto = meses[random.nextInt(meses.length)];*/