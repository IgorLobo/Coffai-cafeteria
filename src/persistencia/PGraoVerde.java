package persistencia;

import entidades.GraoVerde;
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
public class PGraoVerde {
    
    Connection cnn;
    
    public PGraoVerde() {
        cnn = util.Conexao.getConexao();
    }
    
    public void incluir(GraoVerde parametro) throws SQLException {
        String sql = "INSERT INTO graoverde(quantidade, amostra) "
                + "VALUES (?, ?)";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getAmostra());
        
        prd.execute();
        cnn.close();
    }
    
    public void alterar(GraoVerde parametro) throws SQLException {
        String sql = "UPDATE graoverde"
                + " SET"
                + " quantidade = ?,"
                + " amostra = ?"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getAmostra());
        prd.setInt(3, parametro.getId());
        
        prd.execute();
        cnn.close();
    }
    
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM graoverde"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, id);
        
        prd.execute();
        cnn.close();
    }
    
    public GraoVerde consultar(int id) throws SQLException {
        String sql = "SELECT * FROM graoverde"
                + " WHERE id = ?";
        
        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);
        
        ResultSet rs = stm.executeQuery();
        
        GraoVerde graoVerde = new GraoVerde();
        if (rs.next()) {
            graoVerde.setId(rs.getInt("id"));
            graoVerde.setQuantidade(rs.getDouble("quantidade"));
            graoVerde.setAmostra(rs.getString("amostra"));
        }
        
        rs.close();
        cnn.close();
        
        return graoVerde;
    }
    
    public List<GraoVerde> listar() throws SQLException {
        String sql = "SELECT * FROM graoverde";
        
        Statement stm = cnn.createStatement();
        
        ResultSet rs = stm.executeQuery(sql);
        
        List<GraoVerde> lista = new ArrayList<>();
        
        while (rs.next()) {
            GraoVerde graoVerde = new GraoVerde();
            graoVerde.setId(rs.getInt("id"));
            graoVerde.setQuantidade(rs.getDouble("quantidade"));
            graoVerde.setAmostra(rs.getString("amostra"));
            lista.add(graoVerde);
        }
        rs.close();
        cnn.close();
        
        return lista;
    }
}
