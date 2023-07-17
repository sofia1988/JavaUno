package clase12;

public class Circuloejer4 implements calculosFormasejer4 {

    private double radio;

    public Circuloejer4() {
    }

    public Circuloejer4(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;

    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;

    }

}
