// Colecciones
package clase10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class videomain {

    public static void main(String[] args) {
        ServiciosVideo sv = new ServiciosVideo();
        // ArrayList<MascotasVideo> mascotas = new ArrayList();
        // Set<MascotasVideo> mascotas = new HashSet();// conjuntos: no soportan elementos duplicados.
        TreeSet<MascotasVideo> mascotas = new TreeSet();// son para ordenar. y soporta como parametro un comparator.

        // sv.fabricaMascotas(2);
        // sv.mostrarMascotas();
        // sv.actualizarMascota(0);
        // sv.mostrarMascotas();
        // sv.eliminarMascotas(0);
        //sv.mostrarMascotas();
        mascotas.add(new MascotasVideo("colette", "gris", "gata"));
        mascotas.add(new MascotasVideo("colette", "gris", "gata"));
        mascotas.add(new MascotasVideo("rita", "negrita", "gata"));
        mascotas.add(new MascotasVideo("rita", "negrita", "gata"));
        // Collections.sort(mascotas, ComparadoresVideo.ordenarNombreDesc);
        for (MascotasVideo mascota : mascotas) {
            System.out.println(mascota);
        }
        
        //mapas
      /*  HashMap<Integer, String> nombres =new HashSet();//llave y valor
        nombres.put(1, "rita");//puede ser string la llave o sea "1".pero tengo que poner en vez de integet poner string
        nombres.put(Integer.MAX_VALUE, "colette");
        
        ejemplo de mascota que seria un objeto:
         mascotas.put(1,new MascotasVideo("rita", "negrita", "gata"));
        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            
        }*/
    }
}
