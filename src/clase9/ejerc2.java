
package clase9;


public class ejerc2 {

 
    public static void main(String[] args) {
      ParDeNumerosServiceejerc2  servicio = new ParDeNumerosServiceejerc2();
      
      ParDeNumerosejerc2 n1 = new ParDeNumerosejerc2();
      servicio.mostrarValores(n1);
      servicio.devolverMayor(n1);
      System.out.println("tu rdo es : " + servicio.calcularPotencia(n1));
        System.out.println("tu raiz es : "+servicio.calcularRaiz(n1));
    }
    
}
