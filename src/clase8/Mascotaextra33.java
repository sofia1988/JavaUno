/*3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y en la clase servicio crear un método para agregar la mascota y otro para mostrar por pantalla la información de la mascota.
También crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
*/
package clase8;


public class Mascotaextra33 {
    private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascotaextra33() {
    }

    public Mascotaextra33(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
