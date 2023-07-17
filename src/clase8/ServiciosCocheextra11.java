
package clase8;

import java.util.Scanner;


public class ServiciosCocheextra11 {
       Scanner leer = new Scanner(System.in);
    
    
    public Cocheextra11 ingresarCoche(){
        System.out.println("ingrese el nombre de la marca");
        String marca = leer.next();
        
        System.out.println("ingrese el modelo del auto");
        int modelo= leer.nextInt();
        
        System.out.println("ingre el precio del auto");
        double precio = leer.nextDouble();
        
        return new Cocheextra11(marca,modelo,precio);
    }
    
    public void mostrarCoche( Cocheextra11 x){
        System.out.println("tu coche es  :" + x.getMarca()+" "+ x.getModelo()+" "+ x.getPrecio());
    }
}
