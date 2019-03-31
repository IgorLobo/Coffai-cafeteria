package entidades;

/**
 *
 * @author Hygor
 */
public class Cor {

    private int id;
    private String cor;

    public Cor() {
        this.id = 0;
        this.cor = "";
    }

    public Cor(int id, String cor) {
        this.id = id;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String toString() {
        return String.format("%s", getCor());
    }
}
