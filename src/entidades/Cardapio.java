package entidades;

import java.util.List;

/**
 *
 * @author Hygor
 */
public class Cardapio {

    private List<Bebida> listaBebida;
    private List<Cafe> listaCafe;
    private List<Lanche> listaLanche;

    public Cardapio() {
        this.listaBebida = null;
        this.listaCafe = null;
        this.listaLanche = null;
    }

    public Cardapio(List<Bebida> listaBebida, List<Cafe> listaCafe, List<Lanche> listaLanche) {
        this.listaBebida = listaBebida;
        this.listaCafe = listaCafe;
        this.listaLanche = listaLanche;
    }

    public List<Bebida> getListaBebida() {
        return listaBebida;
    }

    public void setListaBebida(List<Bebida> listaBebida) {
        this.listaBebida = listaBebida;
    }

    public List<Cafe> getListaCafe() {
        return listaCafe;
    }

    public void setListaCafe(List<Cafe> listaCafe) {
        this.listaCafe = listaCafe;
    }

    public List<Lanche> getListaLanche() {
        return listaLanche;
    }

    public void setListaLanche(List<Lanche> listaLanche) {
        this.listaLanche = listaLanche;
    }

}
