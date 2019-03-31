package persistencia;

import entidades.Fermentado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hygor
 */
public class PFermentado {

    Connection cnn;

    public PFermentado() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Fermentado parametro) throws SQLException {
        String sql = "INSERT INTO fermentado(quantidade, intensidade) "
                + "VALUES (?, ?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Fermentado parametro) throws SQLException {
        String sql = "UPDATE fermentado"
                + " SET"
                + " quantidade = ?,"
                + " intensidade = ?"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());
        prd.setInt(3, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM fermentado"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Fermentado consultar(int id) throws SQLException {
        String sql = "SELECT * FROM fermentado"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        
        Fermentado fermentado  = new Fermentado();
        if (rs.next()) {
            fermentado.setId(rs.getInt("id"));
            fermentado.setQuantidade(rs.getDouble("quantidade"));
            fermentado.setIntensidade("intensidade");
        }

        rs.close();
        cnn.close();

        return fermentado;
    }

    public List<Fermentado> listar() throws SQLException {
        String sql = "SELECT * FROM fermentado";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Fermentado> lista = new ArrayList<>();

        while (rs.next()) {
            Fermentado fermentado = new Fermentado();
            fermentado.setId(rs.getInt("id"));
            fermentado.setQuantidade(rs.getDouble("quantidade"));
            fermentado.setIntensidade("intensidade");
            lista.add(fermentado);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
