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
        String sql = "INSERT INTO GraoVerde(Quantidade, Amostra) "
                + "VALUES (?, ?)";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getAmostra());
        
        prd.execute();
        cnn.close();
    }
    
    public void alterar(GraoVerde parametro) throws SQLException {
        String sql = "UPDATE GraoVerde"
                + " SET"
                + " Quantidade = ?,"
                + " Amostra = ?,"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setDouble(1, parametro.getQuantidade());
        prd.setString(2, parametro.getAmostra());
        prd.setInt(3, parametro.getId());
        
        prd.execute();
        cnn.close();
    }
    
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM GraoVerde"
                + " WHERE id = ?";
        
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        prd.setInt(1, id);
        
        prd.execute();
        cnn.close();
    }
    
    public GraoVerde consultar(int id) throws SQLException {
        String sql = "SELECT * FROM GraoVerde"
                + " WHERE id = ?";
        
        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);
        
        ResultSet rs = stm.executeQuery();
        
        GraoVerde graoVerde = new GraoVerde();
        if (rs.next()) {
            graoVerde.setId(rs.getInt("Id"));
            graoVerde.setQuantidade(rs.getDouble("Quantidade"));
            graoVerde.setAmostra(rs.getString("Amostra"));
        }
        
        rs.close();
        cnn.close();
        
        return graoVerde;
    }
    
    public List<GraoVerde> listar() throws SQLException {
        String sql = "SELECT * FROM GraoVerde";
        
        Statement stm = cnn.createStatement();
        
        ResultSet rs = stm.executeQuery(sql);
        
        List<GraoVerde> lista = new ArrayList<>();
        
        while (rs.next()) {
            GraoVerde graoVerde = new GraoVerde();
            graoVerde.setId(rs.getInt("Id"));
            graoVerde.setQuantidade(rs.getDouble("Quantidade"));
            graoVerde.setAmostra(rs.getString("Amostra"));
            lista.add(graoVerde);
        }
        rs.close();
        cnn.close();
        
        return lista;
    }
}
