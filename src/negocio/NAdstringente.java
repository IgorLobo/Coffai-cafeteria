/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Adstringente;
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
            throw new Exception("É necessário preencher o endereço");
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
    
    public Cliente consultar(int id) throws Exception{
        return per.consultar(id);
    }
    
    public List<Cliente> listar() throws Exception{
        return per.listar();
    }
}
