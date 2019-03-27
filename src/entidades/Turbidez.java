package entidades;

/**
 *
 * @author Hygor
 */
public class Turbidez {

    private int id;
    private double quantidade;
    private String amostra;

    public Turbidez() {
        this.id = 0;
        this.quantidade = 0;
        this.amostra = "";
    }

    public Turbidez(int id, double quantidade, String amostra) {
        this.id = id;
        this.quantidade = quantidade;
        this.amostra = amostra;
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

    public String getAmostra() {
        return amostra;
    }

    public void setAmostra(String amostra) {
        this.amostra = amostra;
    }

}