package clase13;

public class ServiciosPersonajerc1 {

    public boolean esMayorDeEdad(PersonaEJERC1 x) throws ExceptionPersonaEJERC1 {
        boolean valido = false;
        if (x.getEdad() >= 18) {
            System.err.println("usted es mayor de edad");
            valido = true;
        } else if (x.getEdad() >= 1) {
            System.out.println("usted es menor de edad");
        } else {
           throw new ExceptionPersonaEJERC1("error no es una edad");
        }
        return valido;
    }

}
