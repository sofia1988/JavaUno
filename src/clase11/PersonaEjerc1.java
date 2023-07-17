package clase11;

public class PersonaEjerc1 {

    private String nombre, apellido;
    private Integer edad, documento;
    private PerroEjerci1 perro;

    public PersonaEjerc1() {
    }

    public PersonaEjerc1(String nombre, String apellido, Integer edad, Integer documento, PerroEjerci1 perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public PerroEjerci1 getPerro() {
        return perro;
    }

    public void setPerro(PerroEjerci1 perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "PersonaEjerc1{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
}
