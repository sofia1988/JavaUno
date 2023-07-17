/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente.
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática. */
package clase9;

public class Cadenaejerc1 {

    private String frase;
    private int longitud;

    public Cadenaejerc1() {
        /* 
        this.frase = "";
        this.longitud = 0;
    */
    }

    public Cadenaejerc1(String frase) {
        this.frase = frase;
        setLongitud(frase.length());
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
/*el método setLongitud() puede funcionar en el constructor incluso si está declarado antes del constructor en la clase.
Esto se debe a que los métodos y variables de instancia se pueden invocar y utilizar en cualquier parte de la clase, siempre y cuando tengan el nivel de acceso adecuado (en este caso, public para los métodos setLongitud() y getLongitud() y private para las variables frase y longitud).
Además, al utilizar el método setLongitud() en el constructor, se asegura que el valor de longitud esté siempre actualizado y sea consistente con el valor de frase.*/