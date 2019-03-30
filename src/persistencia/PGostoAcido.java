package persistencia;

import entidades.GostoAcido;
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
public class PGostoAcido {

    Connection cnn;

    public PGostoAcido() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(GostoAcido parametro) throws SQLException {
        String sql = "INSERT INTO GostoAcido(Quantidade, Intensidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(GostoAcido parametro) throws SQLException {
        String sql = "UPDATE GostoAcido"
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
        String sql = "DELETE FROM GostoAcido"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public GostoAcido consultar(int id) throws SQLException {
        String sql = "SELECT * FROM GostoAcido"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        
        GostoAcido gostoAcido  = new GostoAcido();
        if (rs.next()) {
            gostoAcido.setId(rs.getInt("Id"));
            gostoAcido.setQuantidade(rs.getDouble("Quantidade"));
            gostoAcido.setIntensidade(rs.getString("Intensidade"));
        }

        rs.close();
        cnn.close();

        return gostoAcido;
    }

    public List<GostoAcido> listar() throws SQLException {
        String sql = "SELECT * FROM Adstringente";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<GostoAcido> lista = new ArrayList<>();

        while (rs.next()) {
            GostoAcido gostoAcido = new GostoAcido();
            gostoAcido.setId(rs.getInt("Id"));
            gostoAcido.setQuantidade(rs.getDouble("Quantidade"));
            gostoAcido.setIntensidade(rs.getString("Intensidade"));
            lista.add(gostoAcido);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
