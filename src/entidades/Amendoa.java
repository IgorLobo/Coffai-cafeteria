package entidades;

/**
 *
 * @author Hygor
 */
public class Amendoa {

    private int id;
    private double intensidade;

    public Amendoa() {
        this.id = 0;
        this.intensidade = 0.0;
    }

    public Amendoa(int id, Double intensidade) {
        this.id = id;
        this.intensidade = intensidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(Double intensidade) {
        this.intensidade = intensidade;
    }
}
