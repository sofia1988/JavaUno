//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

package clase7;

public class extra5 {

    public static void main(String[] args) {
        EmpleadoEXTRA5 empledo1 = new EmpleadoEXTRA5();
        
        empledo1.datos();
        

        
        System.out.println(" "+empledo1.calcularAumento());
        
       
    }
    
}
