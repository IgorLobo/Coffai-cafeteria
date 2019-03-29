package entidades;

/**
 *
 * @author Hygor
 */
public class Lanche {

    private int id;
    private String Nome;
    private float preco;
    private int quantidade;
    private String descricao;

    public Lanche() {
        this.id = 0;
        this.Nome = "";
        this.preco = 0;
        this.quantidade = 0;
        this.descricao = "";
    }

    public Lanche(int id, String Nome, float preco, int quantidade, String descricao) {
        this.id = id;
        this.Nome = Nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
