package entidades;

import java.util.Date;

/**
 *
 * @author Hygor
 */
public class Cliente {

    private String nome;
    private Date dataNascimento;
    private String logradouro;
    private String quadra;
    private String lote;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, Date dataNascimento, String logradouro, String quadra, String lote, String numero,
            String cep, String bairro, String cidade, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.logradouro = logradouro;
        this.quadra = quadra;
        this.lote = lote;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
