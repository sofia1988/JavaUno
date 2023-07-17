/*Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.*/
package clase13;

public class ejerc1 {

    public static void main(String[] args) {
        ServiciosPersonajerc1 serv = new ServiciosPersonajerc1();
        PersonaEJERC1 per1 = new PersonaEJERC1("sofia", null, 'F', 20, 40);

        try {
            serv.esMayorDeEdad(per1);
        } catch (ExceptionPersonaEJERC1 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
