package negocio;

import entidades.Cliente;
import java.sql.SQLException;
import java.util.List;
import persistencia.PCliente;

/**
 *
 * @author aluno
 */
public class NCliente {

    private PCliente per;

    public NCliente() {
        per = new PCliente();
    }

    public void salvar(Cliente parametro) throws Exception {

        if (parametro.getNome().equals("")) {
            throw new Exception("É necessário preencher o nome");
        }

        if (parametro.getLogradouro().equals("")) {
            throw new Exception("É necessário preencher o endereço");
        }
        
        if (parametro.getBairro().equals("")) {
             throw new Exception("É necessário preencher o bairro");
        }
        
        if (parametro.getCep().equals("")) {
             throw new Exception("É necessário preencher o CEP");
        }
        
        if (parametro.getCidade().equals("")) {
             throw new Exception("É necessário preencher a cidade");
        }
        
        if (parametro.getDataNascimento() == null) {
             throw new Exception("É necessário preencher a data de nascimento");
        }
        
        if (parametro.getTelefone().equals("")) {
             throw new Exception("É necessário preencher o telefone");
        }
        
        if(parametro.getId() == 0){
            per.incluir(parametro);
        }else{
            per.alterar(parametro);
        }
            

    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Cliente consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Cliente> listar() throws Exception{
        return per.listar();
    }
    
}