package clase7;

import java.util.Scanner;

public class operacionejer3 {

    private int numero1;
    private int numero2;

    public operacionejer3() {
    }

    public operacionejer3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("coloca el numero");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();

    }

    public int sumar() {
        int sumar = numero1 + numero2;
        return sumar;
    }

    public int restar() {
        int restar = numero1 - numero2;
        return restar;
    }

    public int multiplicar() {
        if (numero1 > 0 && numero2 > 0) {
            int multiplicar = numero1 * numero2;
            return multiplicar;
        } else {
            System.out.println("error");
            return 0;
        }

    }

    public int dividir() {
        if (numero2 != 0) {

            return numero1 / numero2;
        } else {
            System.out.println("error");
            return 0;

        }

    }

}
