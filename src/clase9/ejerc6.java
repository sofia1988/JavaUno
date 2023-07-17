package clase9;

public class ejerc6 {

    public static void main(String[] args) {
        ServiciosCursosejerc6 sv = new ServiciosCursosejerc6();

        Cursoejerc6[] cursos = new Cursoejerc6[2];

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Creando curso " + (i + 1));
            cursos[i] = sv.crearCurso();

        }

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Datos del curso " + (i + 1));
            sv.mostrarDatosCurso(cursos[i]);
            sv.calcularGananciaSemanal(cursos[i]);
        }
    }

}
