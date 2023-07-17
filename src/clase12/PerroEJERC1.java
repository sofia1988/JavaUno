
package clase12;


public class PerroEJERC1 extends AnimalEJERC1 {

    public PerroEJERC1(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }


    @Override
            public void alimentarse(){
                    System.out.println("el perro " + nombre + " se está alimentando con " + alimento);
            }
}
