package entidades;

/**
 *
 * @author Hygor
 */
public class GostoAmargo {

    private int id;
    private double quantidade;
    private String gostoAmargo;

    public GostoAmargo() {
        this.id = 0;
        this.quantidade = 0;
        this.gostoAmargo = "";
    }

    public GostoAmargo(int id, double quantidade, String gostoAmargo) {
        this.id = id;
        this.quantidade = quantidade;
        this.gostoAmargo = gostoAmargo;
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

    public String getGostoAmargo() {
        return gostoAmargo;
    }

    public void setGostoAmargo(String gostoAmargo) {
        this.gostoAmargo = gostoAmargo;
    }

}
