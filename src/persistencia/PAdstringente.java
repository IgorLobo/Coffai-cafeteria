package persistencia;

import entidades.Adstringente;
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
public class PAdstringente {

    Connection cnn;

    public PAdstringente() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Adstringente parametro) throws SQLException {
        String sql = "INSERT INTO Adstringente(Quantidade) "
                + "VALUES (?)";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());

        prd.execute();
        cnn.close();
    }

    public void alterar(Adstringente parametro) throws SQLException {
        String sql = "UPDATE Adstringente"
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
        String sql = "DELETE FROM Adstringente"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Adstringente consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Adstringente"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();
        
        Adstringente adstringente  = new Adstringente();
        if (rs.next()) {
            adstringente.setId(rs.getInt("Id"));
            adstringente.setQuantidade(rs.getDouble("Quantidade"));
        }

        rs.close();
        cnn.close();

        return adstringente;
    }

    public List<Adstringente> listar() throws SQLException {
        String sql = "SELECT * FROM Adstringente";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Adstringente> lista = new ArrayList<>();

        while (rs.next()) {
            Adstringente adstringente = new Adstringente();
            adstringente.setId(rs.getInt("Id"));
            adstringente.setQuantidade(rs.getDouble("Quantidade"));
            lista.add(adstringente);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
