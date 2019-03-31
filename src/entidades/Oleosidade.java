package entidades;

/**
 *
 * @author Hygor
 */
public class Oleosidade {

    private int id;
    private double quantidade;

    public Oleosidade() {
        this.id = 0;
        this.quantidade = 0;
    }

    public Oleosidade(int id, double quantidade) {
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
    
     public String toString() {
        return String.format("%.2f%%", getQuantidade());
    }
}
