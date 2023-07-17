package clase7;

public class ejerPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona primeraPersona = new Persona("sofia", 35, "femenino");
        Persona segundaPersona = new Persona("alexis", 30, "masculino");
        System.out.println(primeraPersona.nombre);
    }

}
