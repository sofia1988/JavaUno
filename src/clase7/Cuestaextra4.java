
package clase7;

import java.util.Scanner;


public class Cuestaextra4 {
    private int saldo;
    private String titular ;

    public Cuestaextra4() {
        saldo = 5000;
    }

    public Cuestaextra4(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void datos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre = leer.next();
    }
    
    
    public int retirarDinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el importe a retirar");
        int retiro = leer.nextInt();
        int resulado = saldo - retiro;
        return resulado;
    }

   
    
}
