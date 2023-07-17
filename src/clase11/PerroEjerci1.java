package clase11;

public class PerroEjerci1 {

    private String nombre;
    private String raza;
    private Integer edad;
    private Double tamanio;

    public PerroEjerci1() {
    }

    public PerroEjerci1(String nombre, String raza, Integer edad, Double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "PerroEjerci1{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    
}
