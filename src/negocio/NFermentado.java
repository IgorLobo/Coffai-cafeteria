package negocio;

import entidades.Fermentado;
import java.util.List;
import persistencia.PFermentado;

/**
 *
 * @author Igor Lobo
 */
public class NFermentado {

    private PFermentado per;

    public NFermentado() {
        per = new PFermentado();
    }

    public void salvar(Fermentado parametro) throws Exception {

        if (parametro.getIntensidade().equals("")) {
            throw new Exception("É necessário preencher a intensidade");
        }
        if (parametro.getQuantidade() < 1) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
            per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Fermentado consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Fermentado> listar() throws Exception{
        return per.listar();
    }
}
