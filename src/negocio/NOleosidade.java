package negocio;

import entidades.Oleosidade;
import java.util.List;
import persistencia.POleosidade;

/**
 *
 * @author Igor Lobo
 */
public class NOleosidade {
    private POleosidade per;

    public NOleosidade() {
        per = new POleosidade();
    }

    public void salvar(Oleosidade parametro) throws Exception {

        if (parametro.getQuantidade() < 1) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
            per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Oleosidade consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Oleosidade> listar() throws Exception{
        return per.listar();
    } 
}
