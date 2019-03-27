package entidades;

/**
 *
 * @author Hygor
 */
public class Caramelizado {

    private int id;
    private String intensidade;

    public Caramelizado() {
        this.id = 0;
        this.intensidade = "";
    }

    public Caramelizado(int id, String intensidade) {
        this.id = id;
        this.intensidade = intensidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }
}
