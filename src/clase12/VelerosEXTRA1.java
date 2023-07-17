package clase12;

public class VelerosEXTRA1 extends Barcoextra1 {

    private Integer mastiles;

    public VelerosEXTRA1() {
    }

    public VelerosEXTRA1(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public VelerosEXTRA1(Integer mastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
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
        return super.alquilerBarco() * this.mastiles;

    }

}
