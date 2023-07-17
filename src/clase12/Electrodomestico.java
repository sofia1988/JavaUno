package clase12;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {

    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodom\u00e9stico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public void comprobarConsumoEnergetico() {
        String letra = String.valueOf(this.consumoEnergetico);
        if (!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("b") && !letra.equalsIgnoreCase("c")
                && !letra.equalsIgnoreCase("d") && !letra.equalsIgnoreCase("e") && !letra.equalsIgnoreCase("f")) {
            this.consumoEnergetico = 'f';
        }
    }

    /* public void  comprobarConsumoEnergetico(char letra) {
        if(letra == 'a' || letra== 'b' || letra== 'c' || letra== 'd' || letra== 'e' || letra== 'f') {
            consumoEnergetico = letra;
        }else {
            letra ='f';
        }
    }*/
    public void comprobarColor() {
        if (!this.color.equals("blanco") && !this.color.equals("negro") && !this.color.equals("rojo") && !this.color.equals("azul")) {
            this.color = "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);

        System.out.println("cual es el color?");
         color = leer.next();
      //  setColor(color);
        comprobarColor();
        System.out.println("cual es el consumo energetico?");
        char consumoEnergetico = leer.next().charAt(0);
        setConsumoEnergetico(consumoEnergetico);
        comprobarConsumoEnergetico();
        System.out.println("cuanto pesa el electrodomestico?");
        int peso = leer.nextInt();
        setPeso(peso);
        setPrecio(1000.0);
        return new Electrodomestico(precio, color, consumoEnergetico, peso);

    }

    public void precioFinal() {

        if (peso >= 1 && peso <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (peso >= 20 && peso <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (peso >= 50 && peso <= 79) {
            setPrecio(getPrecio() + 800);
        } else if (peso >= 80) {
            setPrecio(getPrecio() + 1000);
        }

        switch (consumoEnergetico) {
            case 'a':
                setPrecio(getPrecio() + 1000);
                break;
            case 'b':
                setPrecio(getPrecio() + 800);
                break;
            case 'c':
                setPrecio(getPrecio() + 600);
                break;
            case 'd':
                setPrecio(getPrecio() + 500);
                break;
            case 'e':
                setPrecio(getPrecio() + 300);
                break;
            case 'f':
                setPrecio(getPrecio() + 100);
                break;

        }
    }

}
