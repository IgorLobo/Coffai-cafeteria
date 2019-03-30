package negocio;

import entidades.Adstringente;
import java.util.List;
import persistencia.PAdstringente;

/**
 *
 * @author Igor Lobo
 */
public class NAdstringente {
    
    private PAdstringente per;

    public NAdstringente() {
        per = new PAdstringente();
    }

    public void salvar(Adstringente parametro) throws Exception {

        if (parametro.getQuantidade() < 1) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
        per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Adstringente consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Adstringente> listar() throws Exception{
        return per.listar();
    }
}
