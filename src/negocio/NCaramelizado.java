package negocio;

import entidades.Caramelizado;
import java.util.List;
import persistencia.PCaramelizado;

/**
 *
 * @author Igor Lobo
 */
public class NCaramelizado {
    private PCaramelizado per;

    public NCaramelizado() {
        per = new PCaramelizado();
    }

    public void salvar(Caramelizado parametro) throws Exception {

        if (parametro.getIntensidade()< 1) {
            throw new Exception("É necessário preencher a quantidade");
        }
        
            per.incluir(parametro);
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Caramelizado consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Caramelizado> listar() throws Exception{
        return per.listar();
    }
}
