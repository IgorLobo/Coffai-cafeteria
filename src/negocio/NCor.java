package negocio;

import entidades.Cor;
import java.util.List;
import persistencia.PCor;

/**
 *
 * @author Igor Lobo
 */
public class NCor {
    private PCor per;

    public NCor() {
        per = new PCor();
    }

    public void salvar(Cor parametro) throws Exception {

        if (parametro.getCor().equals("")) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
            per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Cor consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Cor> listar() throws Exception{
        return per.listar();
    }
}
