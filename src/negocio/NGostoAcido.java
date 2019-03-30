/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.GostoAcido;
import java.util.List;
import persistencia.PGostoAcido;

/**
 *
 * @author Igor Lobo
 */
public class NGostoAcido {
    private PGostoAcido per;

    public NGostoAcido() {
        per = new PGostoAcido();
    }

    public void salvar(GostoAcido parametro) throws Exception {

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
    
    public GostoAcido consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<GostoAcido> listar() throws Exception{
        return per.listar();
    }
}
