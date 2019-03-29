package negocio;

import entidades.Adstringente;
import entidades.Amendoa;
import java.util.List;
import persistencia.PAmendoa;

/**
 *
 * @author Igor Lobo
 */
public class NAmendoa {
    private PAmendoa per;

    public NAmendoa() {
        per = new PAmendoa();
    }

    public void salvar(Amendoa parametro) throws Exception {

        if (parametro.getIntensidade() < 1) {
            throw new Exception("É necessário preencher a intensidade");
        }
        
        if(parametro.getId() == 0){
            per.incluir(parametro);
        }else{
            per.alterar(parametro);
        }
    }
    
    public void excluir(int id) throws Exception{
        per.excluir(id);
    }
    
    public Amendoa consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Amendoa> listar() throws Exception{
        return per.listar();
    }
}
