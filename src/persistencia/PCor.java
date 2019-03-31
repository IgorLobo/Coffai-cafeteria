package persistencia;

import entidades.Cor;
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
public class PCor {

    Connection cnn;

    public PCor() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Cor parametro) throws SQLException {
        String sql = "INSERT INTO cor(cor) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setString(1, parametro.getCor());

        prd.execute();
        cnn.close();
    }

    public void alterar(Cor parametro) throws SQLException {
        String sql = "UPDATE cor"
                + " SET"
                + " cor = ?"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setString(1, parametro.getCor());
        prd.setInt(2, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM cor"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Cor consultar(int id) throws SQLException {
        String sql = "SELECT * FROM cor"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Cor cor = new Cor();
        if (rs.next()) {
            cor.setId(rs.getInt("id"));
            cor.setCor(rs.getString("cor"));
        }

        rs.close();
        cnn.close();

        return cor;
    }

    public List<Cor> listar() throws SQLException {
        String sql = "SELECT * FROM cor";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Cor> lista = new ArrayList<>();

        while (rs.next()) {
            Cor cor = new Cor();
            cor.setId(rs.getInt("id"));
            cor.setCor(rs.getString("cor"));
            lista.add(cor);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
