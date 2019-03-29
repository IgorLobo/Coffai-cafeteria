package entidades;

import java.util.List;

/**
 *
 * @author Hygor
 */
public class Cardapio {

    private int id;
    private List<Bebida> listaBebida;
    private List<Cafe> listaCafe;
    private List<Lanche> listaLanche;

    public Cardapio() {
        this.id = 0;
        this.listaBebida = null;
        this.listaCafe = null;
        this.listaLanche = null;
    }

    public Cardapio(int id, List<Bebida> listaBebida, List<Cafe> listaCafe, List<Lanche> listaLanche) {
        this.id = id;
        this.listaBebida = listaBebida;
        this.listaCafe = listaCafe;
        this.listaLanche = listaLanche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
