package negocio;

import entidades.Venda;
import java.util.List;
import persistencia.PVenda;

/**
 *
 * @author Igor Lobo
 */
public class NVenda {
     private PVenda per;

    public NVenda() {
        per = new PVenda();
    }

    public void salvar(Venda parametro) throws Exception {
        per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Venda consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Venda> listar() throws Exception{
        return per.listar();
    }
}
