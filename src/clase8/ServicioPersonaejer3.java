package clase8;

import java.util.Scanner;

public class ServicioPersonaejer3 {

    Scanner leer = new Scanner(System.in);

    public Personaejerc3 crearPersona() {
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println("ingrese su edad");
        int edad = leer.nextInt();
        char sexo;
        boolean valido = false;

        do {
            System.out.println("ingrese su sexo: M = mujer ,H= hombre u O = otro");
            sexo = leer.next().charAt(0);
            if (sexo == 'M' || sexo == 'H' || sexo == 'O') {
                valido = true;
            } else {
                System.out.println("letra incorrecta");
            }

        } while (valido == false);

        System.out.println("ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("ingrese su altura");
        double altura = leer.nextDouble();
        return new Personaejerc3(nombre, edad, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(Personaejerc3 x) {
        boolean valido = false;
        if (x.getEdad() >= 18) {
            System.err.println("usted es mayor de edad");
            valido = true;
        } else {
            System.out.println("usted es menor de edad");
        }

        return valido;
    }

    public double calcularIMC(Personaejerc3 x) {
        double rdo = x.getPeso() / x.getAltura();
        if (rdo < 20) {
            System.out.println("estas por debajo de tu peso");
            return -1;
        } else if (rdo >= 20 && rdo <= 25) {
            System.out.println("estas bien de peso");
            return 0;
        } else {
            System.out.println("estas por encima de tu peso");
            return 1;
        }
    }

}
