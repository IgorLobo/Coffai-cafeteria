package negocio;

import entidades.GraoVerde;
import java.util.List;
import persistencia.PGraoVerde;

/**
 *
 * @author Igor Lobo
 */
public class NGraoVerde {
    private PGraoVerde per;

    public NGraoVerde() {
        per = new PGraoVerde();
    }

    public void salvar(GraoVerde parametro) throws Exception {

        if (parametro.getAmostra().equals("")) {
            throw new Exception("É necessário preencher a amostra");
        }
        if (parametro.getQuantidade() < 1) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
            per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public GraoVerde consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<GraoVerde> listar() throws Exception{
        return per.listar();
    }    
}
