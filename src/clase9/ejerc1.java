
package clase9;


public class ejerc1 {

   
    public static void main(String[] args) {
      ServiciosCadenaejerc1 servicios = new ServiciosCadenaejerc1();
      
      Cadenaejerc1 c1= servicios.crear();
      servicios.mostrarVocales(c1);
      servicios.invertirFrase(c1);
      servicios.vecesRepetido(c1);
      servicios.compararLongitud(c1);
      servicios.unirFrases(c1);
      servicios.reemplazar(c1);
      servicios.contiene(c1);
    }
    
}
