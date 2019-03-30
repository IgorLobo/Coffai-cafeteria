package persistencia;

import entidades.GostoAmargo;
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
public class PGostoAmargo {

    Connection cnn;

    public PGostoAmargo() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(GostoAmargo parametro) throws SQLException {
        String sql = "INSERT INTO GostoAmargo(Quantidade, Intensidade) "
                + "VALUES (?, ?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(GostoAmargo parametro) throws SQLException {
        String sql = "UPDATE GostoAmargo"
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
        String sql = "DELETE FROM GostoAmargo"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public GostoAmargo consultar(int id) throws SQLException {
        String sql = "SELECT * FROM GostoAmargo"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        GostoAmargo gostoAmargo = new GostoAmargo();
        if (rs.next()) {
            gostoAmargo.setId(rs.getInt("Id"));
            gostoAmargo.setQuantidade(rs.getDouble("Quantidade"));
            gostoAmargo.setIntensidade(rs.getString("Intensidade"));
        }
        rs.close();
        cnn.close();

        return gostoAmargo;
    }

    public List<GostoAmargo> listar() throws SQLException {
        String sql = "SELECT * FROM GostoAmargo";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<GostoAmargo> lista = new ArrayList<>();

        while (rs.next()) {
            GostoAmargo gostoAmargo = new GostoAmargo();
            gostoAmargo.setId(rs.getInt("Id"));
            gostoAmargo.setQuantidade(rs.getDouble("Quantidade"));
            gostoAmargo.setIntensidade("Intensidade");
            lista.add(gostoAmargo);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
