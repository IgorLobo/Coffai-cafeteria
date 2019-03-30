package persistencia;

import entidades.Turbidez;
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
public class PTurbidez {

    Connection cnn;

    public PTurbidez() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Turbidez parametro) throws SQLException {
        String sql = "INSERT INTO Turbidez(Quantidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Turbidez parametro) throws SQLException {
        String sql = "UPDATE Turbidez"
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
        String sql = "DELETE FROM Turbidez"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Turbidez consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Turbidez"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        
        Turbidez turbidez  = new Turbidez();
        if (rs.next()) {
            turbidez.setId(rs.getInt("Id"));
            turbidez.setQuantidade(rs.getDouble("Quantidade"));
        }

        rs.close();
        cnn.close();

        return turbidez;
    }

    public List<Turbidez> listar() throws SQLException {
        String sql = "SELECT * FROM Turbidez";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Turbidez> lista = new ArrayList<>();

        while (rs.next()) {
            Turbidez trubidez = new Turbidez();
            trubidez.setId(rs.getInt("Id"));
            trubidez.setQuantidade(rs.getDouble("Quantidade"));
            lista.add(trubidez);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
