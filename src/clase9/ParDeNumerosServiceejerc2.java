/*Método mostrarValores que muestra cuáles son los dos números guardados.*/
/*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor*/
/*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
*/
/*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/

package clase9;



public class ParDeNumerosServiceejerc2 {
   
     
   public static void mostrarValores(ParDeNumerosejerc2 x){
       System.out.println("tus numeros : " + x.getNum1()+ " "+ x.getNum2() );
   }
   
   public static void devolverMayor(ParDeNumerosejerc2 x){
       if(x.getNum1() > x.getNum2()){
           System.out.println(x.getNum1()+" es mayor");
       }else {
           System.out.println(x.getNum2()+" es mayor");
       }
   }
   public static double calcularPotencia(ParDeNumerosejerc2 x){
       if(x.getNum1() > x.getNum2()){
           return Math.round(Math.pow(x.getNum1(), x.getNum2())) ;
       }else {
           return Math.round(Math.pow(x.getNum2(), x.getNum1())) ;
       }
   }
   
   public static double calcularRaiz(ParDeNumerosejerc2 x){
       if(x.getNum1() < x.getNum2()){
           return Math.sqrt(Math.abs(x.getNum1()));
       }else {
           return Math.sqrt(Math.abs(x.getNum2()));
       }
   }
}
