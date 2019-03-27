package entidades;

/**
 *
 * @author Hygor
 */
public class Adstringente {

    private int id;
    private double quantidade;

    public Adstringente() {
        this.id = 0;
        this.quantidade = 0;
    }

    public Adstringente(int id, double quantidade) {
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
