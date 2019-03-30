package persistencia;

import entidades.Caramelizado;
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
public class PCaramelizado {

    Connection cnn;

    public PCaramelizado() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Caramelizado parametro) throws SQLException {
        String sql = "INSERT INTO Caramelizado(Intensidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Caramelizado parametro) throws SQLException {
        String sql = "UPDATE Caramelizado"
                + " SET"
                + " Intensidade = ?,"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getIntensidade());
        prd.setInt(2, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Caramelizado"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Caramelizado consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Caramelizado"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Caramelizado caramelizado = new Caramelizado();
        if (rs.next()) {
            caramelizado.setId(rs.getInt("Id"));
            caramelizado.setIntensidade(rs.getDouble("Intensidade"));
        }

        rs.close();
        cnn.close();

        return caramelizado;
    }

    public List<Caramelizado> listar() throws SQLException {
        String sql = "SELECT * FROM Caramelizado";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Caramelizado> lista = new ArrayList<>();

        while (rs.next()) {
            Caramelizado caramelizado = new Caramelizado();
            caramelizado.setId(rs.getInt("Id"));
            caramelizado.setIntensidade(rs.getDouble("Intensidade"));
            lista.add(caramelizado);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
