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
        String sql = "INSERT INTO GostoDoce(Quantidade, Intensidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(GostoDoce parametro) throws SQLException {
        String sql = "UPDATE GostoDoce"
                + " SET"
                + " Quantidade = ?,"
                + " Intensidade = ?,"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());
        prd.setInt(3, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM GostoDoce"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public GostoDoce consultar(int id) throws SQLException {
        String sql = "SELECT * FROM GostoDoce"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        GostoDoce gostoDoce = new GostoDoce();
        if (rs.next()) {
            gostoDoce.setId(rs.getInt("Id"));
            gostoDoce.setQuantidade(rs.getDouble("Quantidade"));
            gostoDoce.setIntensidade(rs.getString("Intensidade"));
        }

        rs.close();
        cnn.close();

        return gostoDoce;
    }

    public List<GostoDoce> listar() throws SQLException {
        String sql = "SELECT * FROM GostoDoce";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<GostoDoce> lista = new ArrayList<>();

        while (rs.next()) {
            GostoDoce gostoDoce = new GostoDoce();
            gostoDoce.setId(rs.getInt("Id"));
            gostoDoce.setQuantidade(rs.getDouble("Quantidade"));
            gostoDoce.setIntensidade(rs.getString("Intensidade"));
            lista.add(gostoDoce);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
