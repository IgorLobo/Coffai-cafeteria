package negocio;

import entidades.Cafe;
import java.util.List;
import persistencia.PCafe;

/**
 *
 * @author Igor Lobo
 */
public class NCafe {
    private PCafe per;

    public NCafe() {
        per = new PCafe();
    }

    public void salvar(Cafe parametro) throws Exception {

        per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Cafe consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Cafe> listar() throws Exception{
        return per.listar();
    }
}
