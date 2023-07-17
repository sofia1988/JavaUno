package clase10;

import java.util.Objects;

public class Peliculasejer4 {

    private String titulo;
    private String director;
    private Double duracionPelicula;

    public Peliculasejer4() {
    }

    public Peliculasejer4(String titulo, String director, Double duracionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Peliculasejer4{" + "titulo=" + titulo + ", director=" + director + ", duracionPelicula=" + duracionPelicula + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.titulo);
        hash = 37 * hash + Objects.hashCode(this.director);
        hash = 37 * hash + Objects.hashCode(this.duracionPelicula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculasejer4 other = (Peliculasejer4) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.duracionPelicula, other.duracionPelicula)) {
            return false;
        }
        return true;
    }

}
