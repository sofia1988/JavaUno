package clase12;

import java.util.Scanner;

public class Lavadoraejerc2 extends Electrodomestico {

    private int carga;

    public Lavadoraejerc2() {
    }

    public Lavadoraejerc2(int carga) {
        this.carga = carga;
    }

    public Lavadoraejerc2(int carga, Double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String toString() {
        return super.toString() + ", LavadoraEjerc2{"
                + "carga=" + carga
                + '}';
    }

    public Lavadoraejerc2 crearLavadora() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("cual es la carga ?");
        int carga = leer.nextInt();
        setCarga(carga);

        return new Lavadoraejerc2(carga, precio, color, consumoEnergetico, peso);
    }

    public void precioFinal() {
        super.precioFinal();

        if (carga > 30) {
            setPrecio(getPrecio() + 500);
        }
    }
}
