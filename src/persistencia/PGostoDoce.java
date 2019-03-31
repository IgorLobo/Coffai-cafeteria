package persistencia;

import entidades.GostoDoce;
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
public class PGostoDoce {

    Connection cnn;

    public PGostoDoce() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(GostoDoce parametro) throws SQLException {
        String sql = "INSERT INTO gostodoce(quantidade, intensidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(GostoDoce parametro) throws SQLException {
        String sql = "UPDATE gostodoce"
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
        String sql = "DELETE FROM gostodoce"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public GostoDoce consultar(int id) throws SQLException {
        String sql = "SELECT * FROM gostodoce"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        GostoDoce gostoDoce = new GostoDoce();
        if (rs.next()) {
            gostoDoce.setId(rs.getInt("id"));
            gostoDoce.setQuantidade(rs.getDouble("quantidade"));
            gostoDoce.setIntensidade(rs.getString("intensidade"));
        }

        rs.close();
        cnn.close();

        return gostoDoce;
    }

    public List<GostoDoce> listar() throws SQLException {
        String sql = "SELECT * FROM gostodoce";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<GostoDoce> lista = new ArrayList<>();

        while (rs.next()) {
            GostoDoce gostoDoce = new GostoDoce();
            gostoDoce.setId(rs.getInt("id"));
            gostoDoce.setQuantidade(rs.getDouble("quantidade"));
            gostoDoce.setIntensidade(rs.getString("intensidade"));
            lista.add(gostoDoce);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
