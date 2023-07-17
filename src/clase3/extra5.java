//Una obra social tiene tres clases de socios:
//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

package clase3;

import java.util.Scanner;


public class extra5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        
        switch(letra){
            case "a": System.out.println("el costo del tratamiento es de $20000");
            double porce = 20000 *0.50;
            double descuentoa=20000 - porce;
                System.out.println("su importe total es : "+ descuentoa);
            break;
              case "b": System.out.println("el costo del tratamiento es de $20000");
            double porceb = 20000 *0.35;
            double descuentob = 20000- porceb;
                System.out.println("su importe total es : "+ descuentob);
            break;
              case "c": System.out.println("el costo del tratamiento es de $20000");
              int monto = 20000 ;
                System.out.println("su importe total es : "+ monto);
            break;
            default:System.out.println("incorrecto");
         
        }
    }
    
}
