package clase9;

import java.util.Date;

public class ejerc4 {

    public static void main(String[] args) {
        ServiciosFecha sv = new ServiciosFecha();
        Date f1 = sv.fechaNacimiento();

        System.out.println("tus edad es : " + sv.diferencia(f1));
    }

}
