package persistencia;

import entidades.Queimado;
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
public class PQueimado {
    
    Connection cnn;
    
    public PQueimado() {
        cnn = util.Conexao.getConexao();
    }
    
    public void incluir(Queimado parametro) throws SQLException {
        String sql = "INSERT INTO queimado(quantidade, intensidade) "
                + "VALUES (?, ?)";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());
        
        prd.execute();
        cnn.close();
    }
    
    public void alterar(Queimado parametro) throws SQLException {
        String sql = "UPDATE queimado"
                + " SET"
                + " quantidade = ?,"
                + " Intensidade = ?"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getIntensidade());
        prd.setInt(3, parametro.getId());
        
        prd.execute();
        cnn.close();
    }
    
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM queimado"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, id);
        
        prd.execute();
        cnn.close();
    }
    
    public Queimado consultar(int id) throws SQLException {
        String sql = "SELECT * FROM queimado"
                + " WHERE id = ?";
        
        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);
        
        ResultSet rs = stm.executeQuery();
        
        Queimado queimado = new Queimado();
        if (rs.next()) {
            queimado.setId(rs.getInt("id"));
            queimado.setQuantidade(rs.getDouble("quantidade"));
            queimado.setIntensidade(rs.getString("intensidade"));
        }
        
        rs.close();
        cnn.close();
        
        return queimado;
    }
    
    public List<Queimado> listar() throws SQLException {
        String sql = "SELECT * FROM queimado";
        
        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Queimado> lista = new ArrayList<>();

        while (rs.next()) {
            Queimado queimado = new Queimado();
            queimado.setId(rs.getInt("id"));
            queimado.setQuantidade(rs.getDouble("quantidade"));
            queimado.setIntensidade(rs.getString("intensidade"));
            lista.add(queimado);
        }
        rs.close();
        cnn.close();
        
        return lista;
    }
}
