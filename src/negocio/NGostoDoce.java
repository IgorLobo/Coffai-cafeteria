package negocio;

import entidades.GostoDoce;
import java.util.List;
import persistencia.PGostoDoce;

/**
 *
 * @author Igor Lobo
 */
public class NGostoDoce {
    private PGostoDoce per;

    public NGostoDoce() {
        per = new PGostoDoce();
    }

    public void salvar(GostoDoce parametro) throws Exception {

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
    
    public GostoDoce consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<GostoDoce> listar() throws Exception{
        return per.listar();
    }    
}
