package entidades;

/**
 *
 * @author Hygor
 */
public class Lanche {
	private String Nome;
	private float preco;
	private int quantidade;
	private String descricao;
	
		
	public Lanche() {

	}


	public Lanche(String nome, float preco, int quantidade, String descricao) {
		super();
		Nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
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
