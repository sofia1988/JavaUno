package clase7;

import java.util.Scanner;

public class Circunferenciaejer2 {

    private float radio;

    public Circunferenciaejer2() {
    }

    public Circunferenciaejer2(float radio) {
        this.radio = radio;
    }

    public float inicialice() {
        Scanner leer = new Scanner(System.in);
        System.out.println("coloca el radio");

        radio = leer.nextInt();
        return radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float crearArea() {

        float area = radio * radio;
        return area;
    }

    public float crearPerimetro() {
        float pi = (float) Math.PI;
        float perimetro = 2 * pi * radio;
        return perimetro;
    }
}
