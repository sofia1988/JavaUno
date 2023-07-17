package clase10;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosVideo {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<MascotasVideo> mascotas;//saque el tipo de string

    public ServiciosVideo() {
        //this.leer =new Scanner(System.in);
        this.mascotas = new ArrayList();//este constructor inicializa el array
    }

    public MascotasVideo crearMascotas() {
        System.out.println("colocar nombre");
        String nombre = leer.next();
        System.out.println("colocar apodo");
        String apodo = leer.next();
        System.out.println("colocar tipo");
        String tipo = leer.next();
        return new MascotasVideo(nombre, apodo, tipo);
        // mascotas.add(nombre + " " + apodo + " " + tipo);//Entonces la cadena que se agregará al ArrayList será "Firulais Firu perro".
    }

    public void agregarMascota(MascotasVideo x) {
        mascotas.add(x);
    }

    /* public void mostrarMascotas(){
        System.out.println("la mascotas actuales de la lista son : ");
        for (MascotasVideo aux: mascotas) {
            System.out.println(aux.toString());//aux toma la posicion de cada uno de los elementos que tome de esa lista.
        }
        System.out.println("la cantidad de mascotas son :" +mascotas.size());
    }*/
    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista son:");
        for (int i = 0; i < mascotas.size(); i++) {
            MascotasVideo aux = mascotas.get(i);
            System.out.println(aux.toString()); // aux toma la posición de cada uno de los elementos que tome de esa lista.
        }
        System.out.println("La cantidad de mascotas es: " + mascotas.size());
    }

    public void fabricaMascotas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            agregarMascota(crearMascotas());
        }
    }

    /* public void actualizarMascota(int index){// esto se puede ahcer por estos objetos estan pasados por refenrencia.
        MascotasVideo m = mascotas.get(index);//modificando por referencia al objeto.
        m.setApodo("coquito");
    }*/
 /*public void actualizarMascota(int index) {
        if (index < mascotas.size()) {
            MascotasVideo m = crearMascotas();// creando un nuevo objeto y pisando en base al indice .
            mascotas.set(index, m);
        } else {
            System.out.println("el indice es incorrecto");
        }
    }*/

 /*  public void eliminarMascotas(int index) {
        if (index < mascotas.size()) {
            mascotas.remove(index);
        } else {
            System.out.println("el indice es incorrecto");
        }
    }*/
    public void eliminarMascotaNombre(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            MascotasVideo m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);//o m es indistinto.
            }
        }
    }

    public void actualizarMascotaNombre(String nombreViejo, String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            MascotasVideo m = mascotas.get(i);
            if (m.getNombre().equals(nombreViejo)) {//(mascotas.get(i).getNombre().equals(nombre)) tambien se puede poner asi
                mascotas.remove(nombre);
            }
        }
    }
    /*En este caso, se quiere acceder al objeto de la lista que corresponde a la posición actual del bucle. Entonces,
      se utiliza la variable de control del bucle i para obtener el objeto de la lista con mascotas.get(i).
     El objeto de la lista se almacena en la variable m de tipo MascotasVideo.*/
}
