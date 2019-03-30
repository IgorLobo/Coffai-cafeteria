package negocio;

import entidades.Queimado;
import java.util.List;
import persistencia.PQueimado;

public class NQueimado {

    private PQueimado per;

  public NQueimado(){

      per = new PQueimado();
  }

  public void Salvar(Queimado parametro) throws Exception{

      if (parametro.getQuantidade()<1) {
          throw new Exception("É necessário preencher a quantidade");
      }

      per.incluir(parametro);

  }

  public void excluir(int id) throws Exception{

      per.excluir(id);
  }

  public Queimado consultar(int id) throws Exception{

      return per.consultar(id);
  }

  public List<Queimado> listar() throws Exception{

    return per.listar();
  }

}