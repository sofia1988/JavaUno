
package clase12;


public class GatoEJERC1 extends  AnimalEJERC1{

    public GatoEJERC1(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

        @Override
            public void alimentarse(){
                    System.out.println("el gato " + nombre + " se está alimentando con " + alimento);
            }
    
}
