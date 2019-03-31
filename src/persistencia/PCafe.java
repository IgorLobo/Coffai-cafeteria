package persistencia;

import entidades.Cafe;
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
public class PCafe {

    Connection cnn;

    public PCafe() {
        cnn = util.Conexao.getConexao();
    }

    public void incluir(Cafe parametro) throws SQLException {
        String sql = "INSERT INTO Cafe(Nome, Preco, Popularidade, CorId, OleosidadeId, TurbidezId, GraoVerdeId, "
                + "AromaDoceId, CaramelizadoId, AmendoaId, AromaFermentadoId, AromaQueimadoId, "
                + "SaborFermentoId, AdstringenteId, SaborQueimadoId, GostoAmargoId, SaborDoceId, "
                + "GostoAcidoId)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setString(1, parametro.getNome());
        prd.setDouble(2, parametro.getPreco());
        prd.setString(3, parametro.getPopularidade());
        prd.setInt(4, parametro.getCorId());
        prd.setInt(5, parametro.getOleosidadeId());
        prd.setInt(6, parametro.getTurbidezId());
        prd.setInt(7, parametro.getGraoVerdeId());
        prd.setInt(8, parametro.getAromaDoceId());
        prd.setInt(9, parametro.getCaramelizadoId());
        prd.setInt(10, parametro.getAmendoaId());
        prd.setInt(11, parametro.getAromaFermentadoId());
        prd.setInt(12, parametro.getAromaQueimadoId());
        prd.setInt(13, parametro.getSaborFermentadoId());
        prd.setInt(14, parametro.getAdstringenteId());
        prd.setInt(15, parametro.getSaborQueimadoId());
        prd.setInt(16, parametro.getSaborDoceId());
        prd.setInt(17, parametro.getGostoAmargoId());
        prd.setInt(18, parametro.getGostoAcidoId());

        prd.execute();
        cnn.close();
    }

    public void alterar(Cafe parametro) throws SQLException {
        String sql = "UPDATE Cafe"
                + " SET "
                + " Nome = ?,"
                + " Preco = ?,"
                + " Popularidade = ?,"
                + " CorId = ?,"
                + " OleosidadeId = ?,"
                + " TurbidezId = ?,"
                + " GraoVerdeId = ?,"
                + " AromaDoceId = ?,"
                + " CaramelizadoId = ?,"
                + " AmendoaId = ?,"
                + " AromaFermentadoId = ?,"
                + " AromaQueimadoId = ?,"
                + " SaborFermentoId = ?,"
                + " AdstringenteId = ?,"
                + " SaborQueimadoId = ?,"
                + " GostoAmargoId = ?,"
                + " SaborDoceId = ?,"
                + " GostoAcidoId = ?"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);
                prd.setString(1, parametro.getNome());
        prd.setDouble(2, parametro.getPreco());
        prd.setString(3, parametro.getPopularidade());
        prd.setInt(4, parametro.getCorId());
        prd.setInt(5, parametro.getOleosidadeId());
        prd.setInt(6, parametro.getTurbidezId());
        prd.setInt(7, parametro.getGraoVerdeId());
        prd.setInt(8, parametro.getAromaDoceId());
        prd.setInt(9, parametro.getCaramelizadoId());
        prd.setInt(10, parametro.getAmendoaId());
        prd.setInt(11, parametro.getAromaFermentadoId());
        prd.setInt(12, parametro.getAromaQueimadoId());
        prd.setInt(13, parametro.getSaborFermentadoId());
        prd.setInt(14, parametro.getAdstringenteId());
        prd.setInt(15, parametro.getSaborQueimadoId());
        prd.setInt(16, parametro.getSaborDoceId());
        prd.setInt(17, parametro.getGostoAmargoId());
        prd.setInt(18, parametro.getGostoAcidoId());
        prd.setInt(19, parametro.getId());

        prd.execute();
        cnn.close();
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Cafe"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Cafe consultar(int id) throws SQLException {
        String sql = "SELECT * FROM Cafe"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Cafe cafe = new Cafe();
        if (rs.next()) {
            cafe.setId(rs.getInt("Id")); 
            cafe.setNome(rs.getString("Nome"));
            cafe.setPreco(rs.getDouble("Preco"));
            cafe.setPopularidade(rs.getString("Popularidade"));
            cafe.setCorId(rs.getInt("corId"));
            cafe.setOleosidadeId(rs.getInt("oleosidadeId"));
            cafe.setTurbidezId(rs.getInt("turbidezId"));
            cafe.setGraoVerdeId(rs.getInt("graoVerdeId"));
            cafe.setAromaDoceId(rs.getInt("aromaDoceId"));
            cafe.setCaramelizadoId(rs.getInt("caramelizadoId"));
            cafe.setAmendoaId(rs.getInt("amendoaId"));
            cafe.setAromaFermentadoId(rs.getInt("aromaFermentadoId"));
            cafe.setAromaQueimadoId(rs.getInt("aromaQueimadoId"));
            cafe.setSaborFermentadoId(rs.getInt("saborFermentadoId"));
            cafe.setAdstringenteId(rs.getInt("adstringenteId"));
            cafe.setSaborQueimadoId(rs.getInt("saborQueimadoId"));
            cafe.setGostoAmargoId(rs.getInt("gostoAmargoId"));
            cafe.setSaborDoceId(rs.getInt("saborDoceId"));
            cafe.setGostoAcidoId(rs.getInt("gostoAcidoId"));
            cafe.obterItensCafe();
        }
        rs.close();
        cnn.close();

        return cafe;
    }

    public List<Cafe> listar() throws SQLException {
        String sql = "SELECT * FROM Cafe";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Cafe> lista = new ArrayList<>();

        while (rs.next()) {
            Cafe cafe = new Cafe();
            cafe.setId(rs.getInt("Id")); 
            cafe.setNome(rs.getString("Nome"));
            cafe.setPreco(rs.getDouble("Preco"));
            cafe.setPopularidade(rs.getString("Popularidade"));
            cafe.setCorId(rs.getInt("corId"));
            cafe.setOleosidadeId(rs.getInt("oleosidadeId"));
            cafe.setTurbidezId(rs.getInt("turbidezId"));
            cafe.setGraoVerdeId(rs.getInt("graoVerdeId"));
            cafe.setAromaDoceId(rs.getInt("aromaDoceId"));
            cafe.setCaramelizadoId(rs.getInt("caramelizadoId"));
            cafe.setAmendoaId(rs.getInt("amendoaId"));
            cafe.setAromaFermentadoId(rs.getInt("aromaFermentadoId"));
            cafe.setAromaQueimadoId(rs.getInt("aromaQueimadoId"));
            cafe.setSaborFermentadoId(rs.getInt("saborFermentadoId"));
            cafe.setAdstringenteId(rs.getInt("adstringenteId"));
            cafe.setSaborQueimadoId(rs.getInt("saborQueimadoId"));
            cafe.setGostoAmargoId(rs.getInt("gostoAmargoId"));
            cafe.setSaborDoceId(rs.getInt("saborDoceId"));
            cafe.setGostoAcidoId(rs.getInt("gostoAcidoId"));
            cafe.obterItensCafe();
            lista.add(cafe);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
