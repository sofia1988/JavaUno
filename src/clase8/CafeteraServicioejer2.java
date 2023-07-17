
package clase8;

import java.util.Scanner;


public class CafeteraServicioejer2 {
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafeteraejer2 y){
      y.setCantidadActual(y.getCantidadActual() + y.getCapacidadMáxima());
       
      
    }
     public Tazaejer2 crearTaza(){
         System.out.println("ingrese el tamaño");
         double tamanio=leer.nextDouble();
         return new Tazaejer2(tamanio);
     }
   
    public void servirTaza(Tazaejer2 x ,Cafeteraejer2 y){
        
      if(y.getCantidadActual()> 0){
            if(x.getTamanio() < y.getCantidadActual()){
            y.setCantidadActual(y.getCantidadActual() -x.getTamanio());
            System.out.println("ya se sirvio tu taza!ahora la cafetera tiene: " + y.getCantidadActual());
        }else{
        y.setCantidadActual(y.getCantidadActual() -y.getCantidadActual());
            System.out.println("Ups! solo quedo esto");
    }
      }
    }
    
    public void vaciarCafetera(Cafeteraejer2 y){
         y.setCantidadActual(y.getCantidadActual() - y.getCantidadActual());
            System.out.println("se vacio tu cafetera!ahora la cafetera tiene : " +y.getCantidadActual());
    }
    
    public void agregarCafe(Cafeteraejer2 y){
        System.out.println("ingrese la cantidad de cafe");
        double ml=leer.nextDouble();
        if(y.getCantidadActual()==0){
            if(ml < y.getCapacidadMáxima()){
                y.setCantidadActual(y.getCantidadActual()+ ml);
                System.out.println("listo !ahora tiene: " + y.getCantidadActual());
            }else {
                System.out.println("la cafetera todavia tiene cafe!");
            }
        }
    }
    
     public void menu(Cafeteraejer2 y,Tazaejer2 x){
       boolean salir = false;
      do {          
          
        System.out.println("Bienvenido: elige una de las siguientes opciones: ");
     
        System.out.println("1. servirTaza");
        System.out.println("2. vaciarCafetera");
        System.out.println("3. agregarCafe");
        System.out.println("4. Para salir del menú");
       
        int elegir =leer.nextInt();
      switch(elegir){
         
         case 1:
              servirTaza( x,y);
              break;
         case 2:
               vaciarCafetera(y);
              break;
         case 3:
             agregarCafe(y);
              break;
       
          case 4:
             salir = true;
              System.out.println("Has salido del menú");
                    break;
              default:System.out.println("numero ingresado incorrecto");
          
      }
          System.out.println();    
      } while (!salir);
}
}

