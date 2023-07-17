package clase12;

import java.util.Scanner;

public class Televisorejerc2 extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisorejerc2() {
    }

    public Televisorejerc2(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisorejerc2(int resolucion, boolean sintonizador, Double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public String toString() {
        return super.toString() + ", LavadoraEjerc2{" + "Televisorejerc2{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }

    public Televisorejerc2 crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("cual es la resolucion ?");
        int resolucion = leer.nextInt();
        setResolucion(resolucion);
        System.out.println("tiene sintonizador ?");
        boolean sintonizador = leer.nextBoolean();
        setSintonizador(sintonizador);

        return new Televisorejerc2(resolucion, sintonizador, precio, color, consumoEnergetico, peso);
    }

    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            Double total = getPrecio() * 0.30;
            setPrecio(getPrecio() + total);
        } else if (sintonizador == true) {
            setPrecio(getPrecio() + 500);
        }
    }
}
