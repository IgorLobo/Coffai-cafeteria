package entidades;

/**
 *
 * @author Hygor
 */
public class Turbidez {

    private int id;
    private double quantidade;

    public Turbidez() {
        this.id = 0;
        this.quantidade = 0;
    }

    public Turbidez(int id, double quantidade, String amostra) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
