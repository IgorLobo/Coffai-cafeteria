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
        String sql = "INSERT INTO cliente(nome, cpf, email, datanascimento, logradouro, quadra, lote, numero, cep, bairro, cidade, telefone)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setString(1, parametro.getNome());
        prd.setString(2, parametro.getCpf());
        prd.setString(3, parametro.getEmail());
        prd.setDate(4, parametro.getDataNascimento());
        prd.setString(5, parametro.getLogradouro());
        prd.setString(6, parametro.getQuadra());
        prd.setString(7, parametro.getLote());
        prd.setString(8, parametro.getNumero());
        prd.setString(9, parametro.getCep());
        prd.setString(10, parametro.getBairro());
        prd.setString(11, parametro.getCidade());
        prd.setString(12, parametro.getTelefone());              

        prd.execute();
        cnn.close();
    }

    public void alterar(Cliente parametro) throws SQLException {
        String sql = "UPDATE cliente"
                + " SET"
                + " nome = ?,"
                + " cpf = ?,"
                + " email = ?,"
                + " datanascimento = ?,"
                + " logradouro = ?,"
                + " quadra = ?,"
                + " lote = ?,"
                + " numero = ?,"
                + " cep = ?,"
                + " bairro = ?,"
                + " cidade = ?,"
                + " telefone = ?"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setString(1, parametro.getNome());
        prd.setString(2, parametro.getCpf());
        prd.setString(3, parametro.getEmail());
        prd.setDate(4, parametro.getDataNascimento());
        prd.setString(5, parametro.getLogradouro());
        prd.setString(6, parametro.getQuadra());
        prd.setString(7, parametro.getLote());
        prd.setString(8, parametro.getNumero());
        prd.setString(9, parametro.getCep());
        prd.setString(10, parametro.getBairro());
        prd.setString(11, parametro.getCidade());
        prd.setString(12, parametro.getTelefone());
        prd.setInt(13, parametro.getId());

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
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDataNascimento(rs.getDate("datanascimento"));
            cliente.setLogradouro(rs.getString("logradouro"));
            cliente.setQuadra(rs.getString("quadra"));
            cliente.setLote(rs.getString("lote"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setCep(rs.getString("cep"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
        }

        rs.close();
        cnn.close();

        return cliente;
    }

    public List<Cliente> listar() throws SQLException {
        String sql = "SELECT * FROM cliente";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Cliente> lista = new ArrayList<>();

        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDataNascimento(rs.getDate("datanascimento"));
            cliente.setLogradouro(rs.getString("logradouro"));
            cliente.setQuadra(rs.getString("quadra"));
            cliente.setLote(rs.getString("lote"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setCep(rs.getString("cep"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTelefone(rs.getString("telefone"));
            lista.add(cliente);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
