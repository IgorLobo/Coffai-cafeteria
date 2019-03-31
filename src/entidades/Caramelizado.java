package entidades;

/**
 *
 * @author Hygor
 */
public class Caramelizado {

    private int id;
    private double intensidade;

    public Caramelizado() {
        this.id = 0;
        this.intensidade = 0;
    }

    public Caramelizado(int id, double intensidade) {
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
        return String.format("%s", getIntensidade());
    }
}
