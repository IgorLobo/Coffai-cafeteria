package entidades;

/**
 *
 * @author Hygor
 */
public class Fermentado {
    private int id;
    private String intensidade;
    private double quantidade;

    public Fermentado() {
        this.id = 0;
        this.intensidade = "";
        this.quantidade = 0;

    }

    public Fermentado(int id, String intensidade, double quantidade) {
        this.id = id;
        this.intensidade = intensidade;
        this.quantidade = quantidade;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
