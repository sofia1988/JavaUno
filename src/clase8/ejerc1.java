//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

package clase8;


public class ejerc1 {

    public static void main(String[] args) {
      CuentaBancariaServicioejerc1 servicio = new CuentaBancariaServicioejerc1();
      
    
      
     CuentaBancariaejerc1 cuenta1 = servicio.crearCuenta();
     
    // CuentaBancariaejerc1 n2 = cuenta1.crearCuenta();
   //  Sí, para crear una nueva instancia de una clase, generalmente se utiliza la palabra clave "new". En este caso, la instancia de la clase "CuentaBancariaejerc1" se crea dentro del método "crearCuenta" de la clase "CuentaBancariaServicioejerc1" utilizando la palabra clave "new":
    
   
  servicio.menu(cuenta1); //esta es void por eso no se guarda en una variable .
    
  
    
     //otra forma 1
    // CuentaBancariaejerc1 c = cuenta1.crearCuenta();
//double nuevoSaldo = cuenta1.ingresar(c.getSaldoActual());
//c.setSaldoActual(nuevoSaldo);

//cuando no entra por consola
//public static void main(String[] args) {
  //  CuentaBancariaServicioejerc1 cuenta1 = new CuentaBancariaServicioejerc1();
   // CuentaBancariaejerc1 cuenta = cuenta1.crearCuenta();
    // System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual());
    
// cuenta1.ingresar(cuenta, 5000);
   // 
  //  System.out.println("El nuevo saldo de la cuenta es: " + cuenta.getSaldoActual());

     
   //System.out.println("Su cuenta actualmente tiene un saldo de $" +  n1.toString());
      
       
  //  }
    }
}
