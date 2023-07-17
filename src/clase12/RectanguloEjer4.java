package clase12;

public class RectanguloEjer4 implements calculosFormasejer4 {

    private double base;
    private double altura;

    public RectanguloEjer4() {
    }

    public RectanguloEjer4(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);

    }

}
