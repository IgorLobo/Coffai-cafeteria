package persistencia;

import entidades.Oleosidade;
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
public class POleosidade {

    Connection cnn;

    public POleosidade() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Oleosidade parametro) throws SQLException {
        String sql = "INSERT INTO Oleosidade(Quantidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Oleosidade parametro) throws SQLException {
        String sql = "UPDATE Oleosidade"
                + " SET"
                + " Quantidade = ?,"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setInt(2, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Oleosidade"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Oleosidade consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Oleosidade"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        
        Oleosidade oleosidade  = new Oleosidade();
        if (rs.next()) {
            oleosidade.setId(rs.getInt("Id"));
            oleosidade.setQuantidade(rs.getDouble("Quantidade"));
        }

        rs.close();
        cnn.close();

        return oleosidade;
    }

    public List<Oleosidade> listar() throws SQLException {
        String sql = "SELECT * FROM Oleosidade";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Oleosidade> lista = new ArrayList<>();

        while (rs.next()) {
            Oleosidade oleosidade = new Oleosidade();
            oleosidade.setId(rs.getInt("Id"));
            oleosidade.setQuantidade(rs.getDouble("Quantidade"));
            lista.add(oleosidade);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
