//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package clase7;


public class ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Rectanguloejer4 calcular1 = new Rectanguloejer4();
         
         calcular1.crearRectangulo();
         int a = calcular1.area();
         int p = calcular1.perimetro();
         calcular1.dibujar();
                
                                   
         System.out.println(a + " " +p);
      
    }
    
}
