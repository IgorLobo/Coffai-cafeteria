package persistencia;

import entidades.Amendoa;
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
public class PAmendoa {

    Connection cnn;

    public PAmendoa() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Amendoa parametro) throws SQLException {
        String sql = "INSERT INTO Amendoa(Intensidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getIntensidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Amendoa parametro) throws SQLException {
        String sql = "UPDATE Amendoa"
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
        String sql = "DELETE FROM Amendoa"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Amendoa consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Amendoa"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Amendoa amendoa = new Amendoa();
        if (rs.next()) {
            amendoa.setId(rs.getInt("Id"));
            amendoa.setIntensidade(rs.getDouble("Intensidade"));
        }

        rs.close();
        cnn.close();

        return amendoa;
    }

    public List<Amendoa> listar() throws SQLException {
        String sql = "SELECT * FROM Amendoa";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Amendoa> lista = new ArrayList<>();

        while (rs.next()) {
            Amendoa amendoa = new Amendoa();
            amendoa.setId(rs.getInt("Id"));
            amendoa.setIntensidade(rs.getDouble("Intensidade"));
            lista.add(amendoa);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
