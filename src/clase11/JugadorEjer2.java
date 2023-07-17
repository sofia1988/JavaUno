/*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador).


El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.*/
package clase11;

public class JugadorEjer2 {

    private int id;
    private String nombre;
    private boolean mojado;

    public JugadorEjer2() {
    }

    public JugadorEjer2(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "JugadorEjer2{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
