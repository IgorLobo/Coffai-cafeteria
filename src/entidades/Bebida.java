package entidades;

/**
 *
 * @author Hygor
 */
public class Bebida {

    private int Id;
    private String nome;
    private double preco;
    private int quantidade;

    public Bebida() {
        this.Id = 0;
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
    }

    public Bebida(int Id, String nome, double preco, int quantidade) {
        this.Id = Id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
