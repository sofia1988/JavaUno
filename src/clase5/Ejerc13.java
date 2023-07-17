//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

package clase5;

import java.util.Scanner;


public class Ejerc13 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String[] equipo = new String[10];
    
      for(int i = 0;i <equipo.length;i++){

       System.out.println("coloca el nombre del alumno" );
       equipo[i]=leer.nextLine();
    }
    for(String equipo1 :equipo){
            System.out.println(equipo1);
}
    
    
}
}
