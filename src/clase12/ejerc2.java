package clase12;

import java.util.ArrayList;
import java.util.Iterator;

public class ejerc2 {

    public static void main(String[] args) {

        Lavadoraejerc2 uno = new Lavadoraejerc2();
        //Lavadoraejerc2 uno1 = new Lavadoraejerc2();

        Televisorejerc2 dos = new Televisorejerc2();
        // Televisorejerc2 dos2 = new Televisorejerc2();

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        listaElectrodomesticos.add(uno.crearLavadora());
        listaElectrodomesticos.add(dos.crearTelevisor());
        // listaElectrodomesticos.add(uno1.crearLavadora());
        // listaElectrodomesticos.add(dos2.crearTelevisor());

        /* double totalPrecioFinal = 0;
        for (Electrodomestico aux : listaElectrodomesticos) {
            aux.precioFinal();
            System.out.println(aux.toString());
            double precioFinal = aux.getPrecio();
            totalPrecioFinal += precioFinal;
        }
        System.out.println("Total precio final: " + totalPrecioFinal);*/

 /* for (Electrodomestico listaElectrodomestico : listaElectrodomesticos) {
            Double precioFinal = listaElectrodomestico.getPrecio();
             System.out.println(precioFinal.toString());
        }*/
        double totalPrecioFinal = 0;
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            Electrodomestico aux = listaElectrodomesticos.get(i);
            aux.precioFinal();
            double precioFinal = aux.getPrecio();
            System.out.println("precio final de cada uno" + precioFinal);
            totalPrecioFinal += precioFinal;
        }
        System.out.println("total precio final " + totalPrecioFinal);

    }

}
