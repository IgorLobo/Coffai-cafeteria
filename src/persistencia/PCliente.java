package persistencia;

import entidades.Cliente;
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
public class PCliente {
    Connection cnn;

    public PCliente() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Cliente parametro) throws SQLException {
        String sql = "INSERT INTO cliente(nome, endereco)"
                + " VALUES(?,?);";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.execute();
        cnn.close();
    }

    public void alterar(Cliente parametro) throws SQLException {
        String sql = "UPDATE cliente"
                + " SET"
                + " nome = ?,"
                + " endereco = ?"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM cliente"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Cliente consultar(int id) throws SQLException {
        String sql = "SELECT * FROM cliente"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Cliente cliente = new Cliente();
        if (rs.next()) {
        }

        rs.close();
        cnn.close();

        return null;
    }

    public List<Cliente> listar() throws SQLException {
        String sql = "SELECT * FROM cliente";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Cliente> lista = new ArrayList<>();

        while (rs.next()) {
        }
        rs.close();
        cnn.close();

        return null;
    }
}
