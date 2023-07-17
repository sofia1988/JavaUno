/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
package clase11;

import java.util.Scanner;

public class ServiciosEjerc2 {

    public RevolverEjerc2 llenarRevolver() {
        int posicionActual = (int) (Math.random() * 6) + 1;
        int posicionAgua = (int) (Math.random() * 6) + 1;

        return new RevolverEjerc2(posicionActual, posicionAgua);
    }

    public boolean mojar(RevolverEjerc2 x) {
        return x.getPosicionActual() == x.getPosicionAgua();
    }

    public int siguienteChorro(RevolverEjerc2 x) {
        int siguiente = x.getPosicionActual() + 1;
        if (siguiente > 6) {
            siguiente = 1;
        }
        return siguiente;

    }

    public void info(RevolverEjerc2 x) {
        System.out.println(x.toString());
    }

    /*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    public boolean disparo(RevolverEjerc2 x) {
        if (mojar(x)) {
            return true;
        } else {
            x.setPosicionActual(siguienteChorro(x));
            return false;
        }
    }
    /*
    clase juego
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.*/
    Scanner leer = new Scanner(System.in);

    public JugadorEjer2 llenarJuego(JuegoEjer2 z) {
        System.out.println("coloca el id del jugador");
        int id = leer.nextInt();
        System.out.println("coloca el nombre del jugador");
        String nombre = leer.next();
        boolean mojado = false;
        JugadorEjer2 jugador = new JugadorEjer2(id, nombre, mojado);
        z.getJugadores().add(jugador);

        return jugador;

    }

    public void quiereCrearJugador(JuegoEjer2 z) {
        String valor;
        do {
            System.out.println("quiere crear otro jugador?");
            valor = leer.next();
            if (valor.equals("si")) {
                llenarJuego(z);
            }
        } while (valor.equals("si"));
    }

    /*• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja
    y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó*/
    public void ronda(RevolverEjerc2 x, JuegoEjer2 z) {

        for (JugadorEjer2 ju : z.getJugadores()) {
            if (disparo(x)) {
                ju.setMojado(true);
                System.out.println("se termino el juego " + ju.getNombre());

            } else {
                System.out.println("se salvaste! " + ju.getNombre());
            }
        }

    }

}
