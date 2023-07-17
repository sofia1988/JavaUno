
package clase9;


public class mainAhorcado {

    public static void main(String[] args) {
       ServiciosAhorcado sv= new  ServiciosAhorcado();
       Ahorcado juego1= sv.crearJuego();
       sv.metodoLongitud(juego1);
      sv.pedirLetraUsuario();
      sv.buscar(juego1);
       
     
    }
    
}
