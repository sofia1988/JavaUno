package clase9;

public class estudianteejer {

    public static void main(String[] args) {

        ServiciosEstudiante sv = new ServiciosEstudiante();
        Estudiante[] stu = new Estudiante[2];
        double suma = 0;
        int contador = 0;

        for (int i = 0; i < stu.length; i++) {
            System.out.println("registrando alumno " + (i + 1));
            stu[i] = sv.crearEstudiante();
            suma += stu[i].getNota();

        }
        double promedioGeneral = suma / stu.length;
        System.out.println("promedio de notas del todo el curso: " + promedioGeneral);

        for (int i = 0; i < stu.length; i++) {
            if (stu[i].getNota() > promedioGeneral) {
                if (stu[i].getNota() > promedioGeneral) {
                    System.out.println("este estudiante obtuvo una nota mayor al promedio : " + stu[i].getNombre());
                }
                contador++;
            }

        }
        System.out.println("total de estudiantes con notas mayores al promedio: " + contador);
    }

}

/*public class estudianteejer {

    public static void main(String[] args) {

        ServiciosEstudiante sv = new ServiciosEstudiante();
        Estudiante[] stu = new Estudiante[2];
        double suma = 0;
        int contador = 0;

        for (int i = 0; i < stu.length; i++) {
            System.out.println("registrando alumno " + (i + 1));
            stu[i] = sv.crearEstudiante();
            suma += stu[i].getNota();

            // buscar estudiantes con notas por encima del promedio
            if (stu[i].getNota() > promedioGeneral) {
                System.out.println("este estudiante obtuvo una nota mayor al promedio : " + stu[i].getNombre());
                contador++;
            }
        }
        double promedioGeneral = suma / stu.length;
        System.out.println("promedio de notas del todo el curso: " + promedioGeneral);
        System.out.println("total de estudiantes con notas mayores al promedio: " + contador);
    }

}
 */
 /*public static void main(String[] args) {

    ServiciosEstudiante sv = new ServiciosEstudiante();
    Estudiante[] stu = new Estudiante[2];
    double suma = 0;

    for (int i = 0; i < stu.length; i++) {
        System.out.println("registrando alumno " + (i + 1));
        stu[i] = sv.crearEstudiante();
        suma += stu[i].getNota();
    }
    
    double promedioGeneral = suma / stu.length;
    System.out.println("promedio de notas del todo el curso: " + promedioGeneral);

    Estudiante[] nuevoStu = new Estudiante[4]; // Crear un nuevo vector con capacidad mayor
    for (int i = 0; i < stu.length; i++) {
        nuevoStu[i] = stu[i]; // Copiar los datos del vector actual al nuevo vector
    }

    for (int i = stu.length; i < nuevoStu.length; i++) {
        System.out.println("registrando alumno " + (i + 1));
        nuevoStu[i] = sv.crearEstudiante(); // Agregar nuevos estudiantes al nuevo vector
        suma += nuevoStu[i].getNota();
    }

    promedioGeneral = suma / nuevoStu.length;
    System.out.println("promedio de notas del todo el curso: " + promedioGeneral);

    int contador = 0;
    for (int i = 0; i < nuevoStu.length; i++) {
        if (nuevoStu[i].getNota() > promedioGeneral) {
            System.out.println("este estudiante obtuvo una nota mayor al promedio : " + nuevoStu[i].getNombre());
            contador++;
        }
    }

    System.out.println("total de estudiantes con notas mayores al promedio: " + contador);
}
 */
 /*Inicialización de datos:

String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};


Búsqueda de valores duplicados:

int[] numeros = {1, 2, 3, 2, 4, 5};
for (int i = 0; i < numeros.length; i++) {
  for (int j = i + 1; j < numeros.length; j++) {
    if (numeros[i] == numeros[j]) {
      System.out.println("Valor duplicado encontrado: " + numeros[i]);
    }
  }
}


Ordenamiento de datos:

int[] numeros = {5, 3, 1, 4, 2};
for (int i = 0; i < numeros.length; i++) {
  for (int j = 0; j < numeros.length - 1; j++) {
    if (numeros[j] > numeros[j + 1]) {
      int temp = numeros[j];
      numeros[j] = numeros[j + 1];
      numeros[j + 1] = temp;
    }
  }
}

Recopilación de estadísticas:

double[] valores = {2.5, 3.0, 4.5, 2.0, 5.0};
double suma = 0.0;
for (int i = 0; i < valores.length; i++) {
  suma += valores[i];
}
double media = suma / valores.length;
double varianza = 0.0;
for (int i = 0; i < valores.length; i++) {
  varianza += Math.pow(valores[i] - media, 2);
}
varianza /= valores.length;
double desviacionEstandar = Math.sqrt(varianza);

Gestión de memoria:

int[] tablaDeDispersión = new int[1000];
// Código para agregar y buscar datos en la tabla de dispersión

Partición de datos:

Estudiante[] estudiantes = // Array con información de estudiantes
Estudiante[] estudiantesPrimerAño = new Estudiante[100];
Estudiante[] estudiantesSegundoAño = new Estudiante[200];
for (int i = 0; i < estudiantes.length; i++) {
  if (estudiantes[i].añoDeIngreso == 1) {
    estudiantesPrimerAño[i] = estudiantes[i];
  } else if (estudiantes[i].añoDeIngreso == 2) {
    estudiantesSegundoAño[i] = estudiantes[i];
  }
}

Concatenación de arrays:

String[] nombres = {"Juan", "María", "Pedro"};
String[] apellidos = {"Pérez", "Gómez", "López"};
String[] nombresCompletos = new String[3];
for (int i = 0; i < nombres.length; i++) {
  nombresCompletos[i] = nombres[i] + " " + apellidos[i];
}*/
