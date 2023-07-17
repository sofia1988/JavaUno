
package clase8;


public class Cafeteraejer2 {
    private double capacidadMáxima;
    private double cantidadActual ;

    public Cafeteraejer2() {
        capacidadMáxima=5000;
    }

    public Cafeteraejer2(double capacidadMáxima, double cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
}
