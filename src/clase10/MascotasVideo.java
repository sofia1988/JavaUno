
package clase10;

import java.util.Objects;


public class MascotasVideo implements Comparable<MascotasVideo>{
    
    private String nombre;
    private String apodo;
    private String tipo;

    public MascotasVideo(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public MascotasVideo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {// un codigo numerico en base a la clase .
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {// compara una clase mascota contra otra clase mascota
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MascotasVideo other = (MascotasVideo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "MascotasVideo{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(MascotasVideo t) {
        return t.getNombre().compareTo(this.nombre);
    }

   
}
