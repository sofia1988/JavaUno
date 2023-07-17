package clase12;

public class Yatesextra1 extends Motorextra1 {

    private Integer camarotes;

    public Yatesextra1() {
    }

    public Yatesextra1(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Yatesextra1(Integer camarotes, Integer potenciaCV) {
        super(potenciaCV);
        this.camarotes = camarotes;
    }

    public Yatesextra1(Integer camarotes, Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Integer alquilerBarco() {
        return super.alquilerBarco() * this.camarotes;
    }

}
