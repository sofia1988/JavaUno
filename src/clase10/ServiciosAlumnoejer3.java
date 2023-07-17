package clase10;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosAlumnoejer3 {

    Scanner leer = new Scanner(System.in);
    ArrayList<AlumnoEjer3> alumnos;

    public ServiciosAlumnoejer3() {
        alumnos = new ArrayList<>();
    }

    public AlumnoEjer3 crearAlumno() {
        System.out.println("coloca el nombre del alumno :");
        String nombre = leer.next();
        ArrayList<Integer> notas = crearNotas();

        return new AlumnoEjer3(nombre, notas);
    }

    public ArrayList<Integer> crearNotas() {
        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("ingresa la nota: ");
            Integer nota = leer.nextInt();
            notas.add(nota);
        }
        return notas;
    }

    public void agregarAlumno(AlumnoEjer3 x) {
        alumnos.add(x);

    }

    public void quiereCrearAlumno() {
        String valor;
        do {
            System.out.println("¿Quiere crear otro alumno?");
            valor = leer.next();
            if (valor.equals("si")) {
                agregarAlumno(crearAlumno());
            }
        } while (valor.equals("si"));
    }

    public void notaFinal(AlumnoEjer3 x) {
        String valor;
        do {
            System.out.println("ingrese el nombre del alumno");
            valor = leer.next();
            double suma = 0;

            for (int i = 0; i < alumnos.size(); i++) {
                AlumnoEjer3 al = alumnos.get(i);
                if (al.getNombre().equals(valor)) {
                    for (int j = 0; j < al.getNotas().size(); j++) {
                        suma = suma + al.getNotas().get(j);
                    }
                }
            }
            System.out.println("La nota final del alumno " + valor + " es: " + suma /x.getNotas().size());
            System.out.println("¿Desea conocer la nota final de otro alumno?");
            valor = leer.next();

        } while (valor.equals("si"));
    }

}
