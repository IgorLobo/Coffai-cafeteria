package negocio;

import entidades.GostoAmargo;
import java.util.List;
import persistencia.PGostoAmargo;

/**
 *
 * @author Igor Lobo
 */
public class NGostoAmargo {
    private PGostoAmargo per;

    public NGostoAmargo() {
        per = new PGostoAmargo();
    }

    public void salvar(GostoAmargo parametro) throws Exception {

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
    
    public GostoAmargo consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<GostoAmargo> listar() throws Exception{
        return per.listar();
    }    
}
