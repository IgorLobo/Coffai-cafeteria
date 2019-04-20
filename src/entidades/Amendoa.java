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

    public Amendoa(int id, double intensidade) {
        this.id = id;
        this.intensidade = intensidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public String toString() {
        return String.format("%.2f%%", getIntensidade());
    }
}
