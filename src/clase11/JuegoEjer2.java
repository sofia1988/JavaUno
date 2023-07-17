/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver*/
package clase11;

import java.util.HashSet;

public class JuegoEjer2 {

    private HashSet<JugadorEjer2> jugadores;
    private RevolverEjerc2 revolver;

    public JuegoEjer2() {

        jugadores = new HashSet<>();

    }

    public JuegoEjer2(HashSet<JugadorEjer2> jugadores, RevolverEjerc2 revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public HashSet<JugadorEjer2> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<JugadorEjer2> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverEjerc2 getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverEjerc2 revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "JuegoEjer2{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

}
