/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].*/

package clase9;

public class MesSecretoextra1 {

    private String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    private String mesSecreto;

    public MesSecretoextra1() {
        mesSecreto = meses[0];
    }

    public MesSecretoextra1(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
