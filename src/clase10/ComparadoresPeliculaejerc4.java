package clase10;

import java.util.Comparator;

public class ComparadoresPeliculaejerc4 {

    public static Comparator<Peliculasejer4> ordenardeMenor = new Comparator<Peliculasejer4>() {
        @Override
        public int compare(Peliculasejer4 t, Peliculasejer4 t1) {
            return t.getDuracionPelicula().compareTo(t1.getDuracionPelicula());

        }

    };
    
    public static Comparator<Peliculasejer4> ordenardeMayor = new Comparator<Peliculasejer4>() {
        @Override
        public int compare(Peliculasejer4 t, Peliculasejer4 t1) {
            return t1.getDuracionPelicula().compareTo(t.getDuracionPelicula());

        }

    };
      public static Comparator<Peliculasejer4> ordenarNombreDesc = new Comparator<Peliculasejer4>() {
        @Override
        public int compare(Peliculasejer4 t,Peliculasejer4 t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }
    };
          public static Comparator<Peliculasejer4> ordenarNombreAsce = new Comparator<Peliculasejer4>() {
        @Override
        public int compare(Peliculasejer4 t,Peliculasejer4 t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
}
