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
        String sql = "INSERT INTO cafe(nome, preco, popularidade, corid, oleosidadeid, turbidezid, graoverdeid, "
                + "aromadoceid, caramelizadoid, amendoaid, aromafermentadoid, aromaqueimadoid, "
                + "saborfermentadoid, adstringenteid, saborqueimadoid, gostoamargoid, sabordoceid, "
                + "gostoacidoid)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

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
        String sql = "UPDATE cafe"
                + " SET "
                + " nome = ?,"
                + " preco = ?,"
                + " popularidade = ?,"
                + " corid = ?,"
                + " oleosidadeid = ?,"
                + " turbidezid = ?,"
                + " graoverdeid = ?,"
                + " aromadoceid = ?,"
                + " caramelizadoid = ?,"
                + " amendoaid = ?,"
                + " aromafermentadoid = ?,"
                + " aromaqueimadoid = ?,"
                + " saborfermentadoid = ?,"
                + " adstringenteid = ?,"
                + " saborqueimadoid = ?,"
                + " gostoamargoid = ?,"
                + " sabordoceid = ?,"
                + " gostoacidoid = ?"
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
        String sql = "DELETE FROM cafe"
                + " WHERE id = ?";

        PreparedStatement prd = cnn.prepareStatement(sql);

        prd.setInt(1, id);

        prd.execute();
        cnn.close();
    }

    public Cafe consultar(int id) throws SQLException {
        String sql = "SELECT * FROM cafe"
                + " WHERE id = ?";

        PreparedStatement stm = cnn.prepareStatement(sql);
        stm.setInt(1, id);

        ResultSet rs = stm.executeQuery();

        Cafe cafe = new Cafe();
        if (rs.next()) {
            cafe.setId(rs.getInt("id"));
            cafe.setNome(rs.getString("nome"));
            cafe.setPreco(rs.getDouble("preco"));
            cafe.setPopularidade(rs.getString("popularidade"));
            cafe.setCorId(rs.getInt("corid"));
            cafe.setOleosidadeId(rs.getInt("oleosidadeid"));
            cafe.setTurbidezId(rs.getInt("turbidezid"));
            cafe.setGraoVerdeId(rs.getInt("graoVerdeid"));
            cafe.setAromaDoceId(rs.getInt("aromaDoceid"));
            cafe.setCaramelizadoId(rs.getInt("caramelizadoid"));
            cafe.setAmendoaId(rs.getInt("amendoaid"));
            cafe.setAromaFermentadoId(rs.getInt("aromaFermentadoid"));
            cafe.setAromaQueimadoId(rs.getInt("aromaQueimadoid"));
            cafe.setSaborFermentadoId(rs.getInt("saborFermentadoid"));
            cafe.setAdstringenteId(rs.getInt("adstringenteid"));
            cafe.setSaborQueimadoId(rs.getInt("saborQueimadoid"));
            cafe.setGostoAmargoId(rs.getInt("gostoAmargoid"));
            cafe.setSaborDoceId(rs.getInt("saborDoceid"));
            cafe.setGostoAcidoId(rs.getInt("gostoAcidoid"));
            cafe.obterItensCafe();
        }
        rs.close();
        cnn.close();

        return cafe;
    }

    public List<Cafe> listar() throws SQLException {
        String sql = "SELECT * FROM cafe";

        Statement stm = cnn.createStatement();

        ResultSet rs = stm.executeQuery(sql);

        List<Cafe> lista = new ArrayList<>();

        while (rs.next()) {
            Cafe cafe = new Cafe();
            cafe.setId(rs.getInt("id"));
            cafe.setNome(rs.getString("nome"));
            cafe.setPreco(rs.getDouble("preco"));
            cafe.setPopularidade(rs.getString("popularidade"));
            cafe.setCorId(rs.getInt("corid"));
            cafe.setOleosidadeId(rs.getInt("oleosidadeid"));
            cafe.setTurbidezId(rs.getInt("turbidezid"));
            cafe.setGraoVerdeId(rs.getInt("graoVerdeid"));
            cafe.setAromaDoceId(rs.getInt("aromaDoceid"));
            cafe.setCaramelizadoId(rs.getInt("caramelizadoid"));
            cafe.setAmendoaId(rs.getInt("amendoaid"));
            cafe.setAromaFermentadoId(rs.getInt("aromaFermentadoid"));
            cafe.setAromaQueimadoId(rs.getInt("aromaQueimadoid"));
            cafe.setSaborFermentadoId(rs.getInt("saborFermentadoid"));
            cafe.setAdstringenteId(rs.getInt("adstringenteid"));
            cafe.setSaborQueimadoId(rs.getInt("saborQueimadoid"));
            cafe.setGostoAmargoId(rs.getInt("gostoAmargoid"));
            cafe.setSaborDoceId(rs.getInt("saborDoceid"));
            cafe.setGostoAcidoId(rs.getInt("gostoAcidoid"));
            cafe.obterItensCafe();
            lista.add(cafe);
        }
        rs.close();
        cnn.close();

        return lista;
    }
}
