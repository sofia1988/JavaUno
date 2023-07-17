package clase13;

import java.util.Random;

public class NumeroAleatorioejerc5 {

    private int numeroAleatorio;

    public NumeroAleatorioejerc5() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(10) + 1;
    }

    public NumeroAleatorioejerc5(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public void siesMayorMenor(int adivinador) {
        if (adivinador > numeroAleatorio) {
            System.out.println("el numero es menor");
        } else if (adivinador < numeroAleatorio) {
            System.out.println("el numero es mayor");
        } else {
            System.out.println("acertaste !");
        }
    }
}
