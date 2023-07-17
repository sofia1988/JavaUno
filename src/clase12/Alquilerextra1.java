package clase12;

import java.util.Date;
import java.util.Scanner;

public class Alquilerextra1 {

    private Clienteextra1 cliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barcoextra1 barco;

    public Alquilerextra1() {
    }

    public Alquilerextra1(Clienteextra1 cliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barcoextra1 barco) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Clienteextra1 getCliente() {
        return cliente;
    }

    public void setCliente(Clienteextra1 cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barcoextra1 getBarco() {
        return barco;
    }

    public void setBarco(Barcoextra1 barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquilerextra1{" + "cliente=" + cliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

    public Date fechaAlquiler() {
        System.out.println("fecha de alquiler");
        Scanner leer = new Scanner(System.in);
        System.out.println("que dia  ?");
        int Day = leer.nextInt();
        System.out.println("que mes ?");
        int Month = leer.nextInt() - 1;
        System.out.println("que anio ?");
        int Year = leer.nextInt() - 1900;
        this.fechaAlquiler = new Date(Year, Month, Day);
        return getFechaAlquiler();
    }

    public Date fechaDevolucion() {
        System.out.println("fecha devolucion");
        Scanner leer = new Scanner(System.in);
        System.out.println("que dia  ?");
        int Day = leer.nextInt();
        System.out.println("que mes ?");
        int Month = leer.nextInt() - 1;
        System.out.println("que anio ?");
        int Year = leer.nextInt() - 1900;
        setFechaDevolucion(new Date(Year, Month, Day));
        return getFechaDevolucion();
    }

    public Integer diasOcupacion() {
        return fechaDevolucion().getDate() - fechaAlquiler().getDate();

    }

}
