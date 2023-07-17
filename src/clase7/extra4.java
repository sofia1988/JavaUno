//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
//Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

package clase7;


public class extra4 {


    public static void main(String[] args) {
       Cuestaextra4  retiro1 = new Cuestaextra4();
       
       retiro1.datos();
       int rdo =  retiro1.retirarDinero();
       
       
        
        System.out.println(rdo);
    }
    
    
}
