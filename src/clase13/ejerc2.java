/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
package clase13;

public class ejerc2 {

    public static void main(String[] args) {
        Animalejerc2 listaPerros = new Animalejerc2();
        PerroEJER2 perro1 = new PerroEJER2("cabrito", 10);
        PerroEJER2 perro2 = new PerroEJER2("cabrito2", 1);
        PerroEJER2 perro3 = new PerroEJER2("cabrito3", 11);

        try {
            listaPerros.getPerros()[0] = perro1;
            listaPerros.getPerros()[1] = perro2;
            listaPerros.getPerros()[2] = perro2;
            for (int i = 0; i < listaPerros.getPerros().length; i++) {
                PerroEJER2 perro = listaPerros.getPerros()[i];
                System.out.println(perro.getNombre());
                System.out.println(perro.getEdad());
                System.out.println();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " esta fuera de los limites del array");
        }
    }

}
