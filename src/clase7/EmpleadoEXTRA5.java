
package clase7;

import java.util.Scanner;

public class EmpleadoEXTRA5 {
    private String nombre;
    private int edad ;
    private int salario;

    public EmpleadoEXTRA5() {
    }

    public EmpleadoEXTRA5(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void datos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = leer.next();
        System.out.println("ingrese su edad");
        edad = leer.nextInt();
        System.out.println("ingrese su salario");
        salario = leer.nextInt();
        
    }
    
    public double calcularAumento(){
        double aumento ;
        if(edad >= 30 ){
             aumento = salario * 0.1;
            
        
        }else{
            aumento = salario * 0.05;
            
        }
      return aumento;
      
    }
    
}
