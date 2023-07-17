package clase12;

public class Motorextra1 extends Barcoextra1 {

    private Integer potenciaCV;

    public Motorextra1() {
    }

    public Motorextra1(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Motorextra1(Integer potenciaCV, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
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
        return super.alquilerBarco() * this.potenciaCV;
    }

}
