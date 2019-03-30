package entidades;

/**
 *
 * @author Hygor
 */
public class GostoAmargo {

    private int id;
    private double quantidade;
    private String intensidade;

    public GostoAmargo() {
        this.id = 0;
        this.quantidade = 0;
        this.intensidade = "";
    }

    public GostoAmargo(int id, double quantidade, String intensidade) {
        this.id = id;
        this.quantidade = quantidade;
        this.intensidade = intensidade;
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

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

}
