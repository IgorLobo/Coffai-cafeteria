package entidades;

/**
 *
 * @author Hygor
 */
public class Lanche {

    private int id;
    private String nome;
    private float preco;
    private int quantidade;
    private String descricao;

    public Lanche() {
        this.id = 0;
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
        this.descricao = "";
    }

    public Lanche(int id, String nome, float preco, int quantidade, String descricao) {
        this.id = id;
        this.nome = nome;
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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
