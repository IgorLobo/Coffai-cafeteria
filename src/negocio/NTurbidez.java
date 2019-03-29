package negocio;

import entidades.Turbidez;
import java.util.List;
import persistencia.PTurbidez;

public class NTurbidez {

    private PTurbidez per;

  public NTurbidez(){

      per = new PTurbidez();
  }

  public void Salvar(Turbidez parametro) throws Exception{

      if (parametro.getQuantidade()<1) {
          throw new Exception("É necessário preencher a quantidade");
      }

      if (parametro.getId()==0) {
          per.incluir(parametro);
      }else{
          per.alterar(parametro);
      }

  }

  public void excluir(int id) throws Exception{

      per.excluir(id);
  }

  public Turbidez consultar(int id) throws Exception{

      return per.consultar(id);
  }

  public List<Turbidez> listar() throws Exception{

    return per.listar();
  }

}