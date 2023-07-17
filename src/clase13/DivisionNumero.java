package clase13;

public class DivisionNumero {

    private int uno;
    private int dos;

    public DivisionNumero() {
    }

    public DivisionNumero(int uno, int dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public int division() throws ExceptionDivisionEJERC3 {
        int rdo;
        if (uno >= dos) {
            rdo = uno / dos;
        } else {
            throw new ExceptionDivisionEJERC3("no se pueden sumar");
        }
        return rdo;
    }
}
