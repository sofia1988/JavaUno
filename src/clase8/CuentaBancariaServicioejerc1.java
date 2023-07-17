
package clase8;

import java.util.Scanner;

public class CuentaBancariaServicioejerc1 {
      Scanner leer = new Scanner(System.in);
      
//En el método CuentaBancariaServicioejerc1.crearCuenta(), se devuelve una instancia de la clase CuentaBancariaejerc1, ya que se está creando una nueva cuenta bancaria.
//En cambio, en el método CuentaBancariaServicioejerc1.ingresar(), se espera que se ingrese una cantidad de dinero a una cuenta bancaria que ya fue creada previamente. 
//En este caso, la cuenta bancaria a la que se está ingresando dinero ya es conocida, y se pasa el saldo actual de esa cuenta bancaria como parámetro para poder actualizarlo con el dinero que se va a ingresar.
    
  public CuentaBancariaejerc1  crearCuenta(){
         System.out.println("ingrese su numero de cuenta");
         int numeroCuenta=leer.nextInt();
         System.out.println("ingrese su dni");
         long dniCliente =leer.nextLong();
         double saldoActual =0;
         
       
        return new CuentaBancariaejerc1( numeroCuenta,dniCliente,saldoActual);//se usa si siempre se va usar los mismos parametros.
      
  }
  

 // El método crearCuenta() está definido dentro de la clase CuentaBancariaejerc1, por lo tanto, puede acceder a los atributos privados de esa misma clase. Esto se debe a que en Java, los miembros de una clase pueden acceder a todos los miembros privados de la misma clase, independientemente de si son métodos o atributos. Es decir, la visibilidad privada solo limita el acceso desde fuera de la clase, no desde dentro de ella.
     //otra forma de denis
//  public  double ingresar(CuentaBancariaejerc1 x){
 //     System.out.println("ingrese la cantidad de dinero");
   //   double dinero=leer.nextDouble();
   //   x.setSaldoActual(x.getSaldoActual()+ dinero);
    //  double rdo = x.getSaldoActual();
    //  return rdo;
 // }
  
   //otra forma 1
 // public double ingresar(double saldoActual){
  //  System.out.println("Ingrese la cantidad de dinero:");
  //  double dinero = leer.nextDouble();
  //  double nuevoSaldo = saldoActual + dinero;
 //   return nuevoSaldo;
//}
  
  //Si no se pasan por teclado los valores en el método ingresar(), entonces este método debería tomar como parámetros la instancia de CuentaBancariaejerc1 y la cantidad de dinero que se va a ingresar.
  //Entonces, el método podría ser modificado de la siguiente manera:
 // public void ingresar(CuentaBancariaejerc1 cuenta, double cantidad) {
  //  double saldoActual = cuenta.getSaldoActual();
  //  double saldoFinal = saldoActual + cantidad;
 //   cuenta.setSaldoActual(saldoFinal);
//}


  public void ingresar(CuentaBancariaejerc1 x){ //para darme cuenta si psar parametros o no tengo que ver si hay que modificar el objeto.
      System.out.println("ingrese la cantidad de dinero");
      double dinero=leer.nextDouble();
      x.setSaldoActual(x.getSaldoActual() + dinero); //set es para modificar el valor del atributo.y get es obtener el valor del atributo.
      System.out.println("Se ha depositado $" + dinero + " en su cuenta.");
  }
   
  public void retirar(CuentaBancariaejerc1 x){
      System.out.println("ingrese la cantidad de dinero a retirar");
      double dinero=leer.nextDouble();
       x.setSaldoActual(x.getSaldoActual() - dinero);
       System.out.println("Se ha retirado $" + dinero + " en su cuenta.");
      
  }
  
  public void extraccionRapida(CuentaBancariaejerc1 x ){
      System.out.println("solo puede retirar el 20% de su saldo");
      double dinero=leer.nextDouble();
      double porcentaje =x.getSaldoActual()*0.20;
      double rdo = x.getSaldoActual() - porcentaje;
      if(dinero <= rdo){
           x.setSaldoActual(x.getSaldoActual() - dinero);
         }else{
          System.out.println("error !solo puede retirar el 20% de su saldo");
      }
    }
  
  public void consultarSaldo(CuentaBancariaejerc1 x){
      double tuSaldo = x.getSaldoActual();
      System.out.println("El saldo actual es: " + tuSaldo);
  }
//public double consultarSaldo(CuentaBancariaejerc1 cuenta){
   // return cuenta.getSaldoActual();
//}
  public void consultarDatos(CuentaBancariaejerc1 x){
       System.out.println(x.toString());
  }
  public void menu(CuentaBancariaejerc1 x){
       boolean salir = false;
      do {          
          
      System.out.println("bienvenido a su cuenta: eliga las sigueintes opciones : 1 para ingresar ,2 para retirar ,3 para extraccion rapida,4 para consultar saldo , 5 para consultar datos y 6 para salir del menu");
      int elegir =leer.nextInt();
      switch(elegir){
          case 1:
              ingresar(x);
              break;
         case 2:
              retirar(x);
              break;
         case 3:
              extraccionRapida(x);
              break;
         case 4:
              consultarSaldo(x);
              break;
         case 5:
              consultarDatos(x);
              break;
          case 6:
             salir = true;
              System.out.println("a salido del menu");
                    break;
              default:System.out.println("numero ingresado incorrecto");
          
      }
          System.out.println();    
      } while (!salir);
}
}