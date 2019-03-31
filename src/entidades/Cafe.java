package entidades;

import java.sql.SQLException;
import persistencia.PAdstringente;
import persistencia.PAmendoa;
import persistencia.PCaramelizado;
import persistencia.PCor;
import persistencia.PFermentado;
import persistencia.PGostoAcido;
import persistencia.PGostoAmargo;
import persistencia.PGostoDoce;
import persistencia.PGraoVerde;
import persistencia.POleosidade;
import persistencia.PQueimado;
import persistencia.PTurbidez;

/**
 *
 * @author Hygor
 */
public class Cafe {

    private int id;
    private String popularidade;

    private int corId;
    private int oleosidadeId;
    private int turbidezId;

    private int graoVerdeId;
    private int aromaDoceId;
    private int caramelizadoId;
    private int amendoaId;
    private int aromaFermentadoId;
    private int aromaQueimadoId;

    private int saborFermentadoId;
    private int adstringenteId;
    private int saborQueimadoId;
    private int gostoAmargoId;
    private int saborDoceId;
    private int gostoAcidoId;

    //APARENCIA
    private Cor cor;
    private Oleosidade oleosidade;
    private Turbidez turbidez;

    //AROMA    
    private GraoVerde graoVerde;
    private GostoDoce aromaDoce;
    private Caramelizado caramelizado;
    private Amendoa amendoa;
    private Fermentado aromaFermentado;
    private Queimado aromaQueimado;

    //SABOR
    private Fermentado saborFermentado;
    private Adstringente adstringente;
    private Queimado saborQueimado;
    private GostoAmargo gostoAmargo;
    private GostoDoce saborDoce;
    private GostoAcido gostoAcido;

    public Cafe() throws SQLException {
        this.id = 0;
        this.popularidade = "";
        this.corId = 0;
        this.oleosidadeId = 0;
        this.turbidezId = 0;
        this.graoVerdeId = 0;
        this.aromaDoceId = 0;
        this.caramelizadoId = 0;
        this.amendoaId = 0;
        this.aromaFermentadoId = 0;
        this.aromaQueimadoId = 0;
        this.saborFermentadoId = 0;
        this.adstringenteId = 0;
        this.saborQueimadoId = 0;
        this.gostoAmargoId = 0;
        this.saborDoceId = 0;
        this.gostoAcidoId = 0;
        this.cor = null;
        this.oleosidade = null;
        this.turbidez = null;
        this.graoVerde = null;
        this.aromaDoce = null;
        this.caramelizado = null;
        this.amendoa = null;
        this.aromaFermentado = null;
        this.aromaQueimado = null;
        this.saborFermentado = null;
        this.adstringente = null;
        this.saborQueimado = null;
        this.gostoAmargo = null;
        this.saborDoce = null;
        this.gostoAcido = null;
        obterItensDoCafe(this.corId, this.oleosidadeId, this.turbidezId, this.graoVerdeId, this.aromaDoceId, this.caramelizadoId, this.amendoaId, this.aromaFermentadoId, this.aromaQueimadoId,
                this.saborFermentadoId, this.adstringenteId, this.saborQueimadoId, this.gostoAmargoId, this.saborDoceId,
                this.gostoAcidoId);
    }

    public Cafe(int id, String popularidade, int corId, int oleosidadeId, int turbidezId, int graoVerdeId,
            int aromaDoceId, int caramelizadoId, int amendoaId, int aromaFermentadoId, int aromaQueimadoId,
            int saborFermentadoId, int adstringenteId, int saborQueimadoId, int gostoAmargoId, int saborDoceId,
            int gostoAcidoId) throws SQLException {
        this.id = id;
        this.popularidade = popularidade;
        this.corId = corId;
        this.oleosidadeId = oleosidadeId;
        this.turbidezId = turbidezId;
        this.graoVerdeId = graoVerdeId;
        this.aromaDoceId = aromaDoceId;
        this.caramelizadoId = caramelizadoId;
        this.amendoaId = amendoaId;
        this.aromaFermentadoId = aromaFermentadoId;
        this.aromaQueimadoId = aromaQueimadoId;
        this.saborFermentadoId = saborFermentadoId;
        this.adstringenteId = adstringenteId;
        this.saborQueimadoId = saborQueimadoId;
        this.gostoAmargoId = gostoAmargoId;
        this.saborDoceId = saborDoceId;
        this.gostoAcidoId = gostoAcidoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(String popularidade) {
        this.popularidade = popularidade;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Oleosidade getOleosidade() {
        return oleosidade;
    }

    public void setOleosidade(Oleosidade oleosidade) {
        this.oleosidade = oleosidade;
    }

    public Turbidez getTurbidez() {
        return turbidez;
    }

    public void setTurbidez(Turbidez turbidez) {
        this.turbidez = turbidez;
    }

    public GraoVerde getGraoVerde() {
        return graoVerde;
    }

    public void setGraoVerde(GraoVerde graoVerde) {
        this.graoVerde = graoVerde;
    }

    public GostoDoce getAromaDoce() {
        return aromaDoce;
    }

    public void setAromaDoce(GostoDoce aromaDoce) {
        this.aromaDoce = aromaDoce;
    }

    public Caramelizado getCaramelizado() {
        return caramelizado;
    }

    public void setCaramelizado(Caramelizado caramelizado) {
        this.caramelizado = caramelizado;
    }

    public Amendoa getAmendoa() {
        return amendoa;
    }

    public void setAmendoa(Amendoa amendoa) {
        this.amendoa = amendoa;
    }

    public Fermentado getAromaFermentado() {
        return aromaFermentado;
    }

    public void setAromaFermentado(Fermentado aromaFermentado) {
        this.aromaFermentado = aromaFermentado;
    }

    public Queimado getAromaQueimado() {
        return aromaQueimado;
    }

    public void setAromaQueimado(Queimado aromaQueimado) {
        this.aromaQueimado = aromaQueimado;
    }

    public Fermentado getSaborFermentado() {
        return saborFermentado;
    }

    public void setSaborFermentado(Fermentado saborFermentado) {
        this.saborFermentado = saborFermentado;
    }

    public Adstringente getAdstringente() {
        return adstringente;
    }

    public void setAdstringente(Adstringente adstringente) {
        this.adstringente = adstringente;
    }

    public Queimado getSaborQueimado() {
        return saborQueimado;
    }

    public void setSaborQueimado(Queimado saborQueimado) {
        this.saborQueimado = saborQueimado;
    }

    public GostoAmargo getGostoAmargo() {
        return gostoAmargo;
    }

    public void setGostoAmargo(GostoAmargo gostoAmargo) {
        this.gostoAmargo = gostoAmargo;
    }

    public GostoDoce getSaborDoce() {
        return saborDoce;
    }

    public void setSaborDoce(GostoDoce saborDoce) {
        this.saborDoce = saborDoce;
    }

    public GostoAcido getGostoAcido() {
        return gostoAcido;
    }

    public void setGostoAcido(GostoAcido gostoAcido) {
        this.gostoAcido = gostoAcido;
    }

    public int getCorId() {
        return corId;
    }

    public void setCorId(int corId) {
        this.corId = corId;
    }

    public int getOleosidadeId() {
        return oleosidadeId;
    }

    public void setOleosidadeId(int oleosidadeId) {
        this.oleosidadeId = oleosidadeId;
    }

    public int getTurbidezId() {
        return turbidezId;
    }

    public void setTurbidezId(int turbidezId) {
        this.turbidezId = turbidezId;
    }

    public int getGraoVerdeId() {
        return graoVerdeId;
    }

    public void setGraoVerdeId(int graoVerdeId) {
        this.graoVerdeId = graoVerdeId;
    }

    public int getAromaDoceId() {
        return aromaDoceId;
    }

    public void setAromaDoceId(int aromaDoceId) {
        this.aromaDoceId = aromaDoceId;
    }

    public int getCaramelizadoId() {
        return caramelizadoId;
    }

    public void setCaramelizadoId(int caramelizadoId) {
        this.caramelizadoId = caramelizadoId;
    }

    public int getAmendoaId() {
        return amendoaId;
    }

    public void setAmendoaId(int amendoaId) {
        this.amendoaId = amendoaId;
    }

    public int getAromaFermentadoId() {
        return aromaFermentadoId;
    }

    public void setAromaFermentadoId(int aromaFermentadoId) {
        this.aromaFermentadoId = aromaFermentadoId;
    }

    public int getAromaQueimadoId() {
        return aromaQueimadoId;
    }

    public void setAromaQueimadoId(int aromaQueimadoId) {
        this.aromaQueimadoId = aromaQueimadoId;
    }

    public int getSaborFermentadoId() {
        return saborFermentadoId;
    }

    public void setSaborFermentadoId(int saborFermentadoId) {
        this.saborFermentadoId = saborFermentadoId;
    }

    public int getAdstringenteId() {
        return adstringenteId;
    }

    public void setAdstringenteId(int adstringenteId) {
        this.adstringenteId = adstringenteId;
    }

    public int getSaborQueimadoId() {
        return saborQueimadoId;
    }

    public void setSaborQueimadoId(int saborQueimadoId) {
        this.saborQueimadoId = saborQueimadoId;
    }

    public int getGostoAmargoId() {
        return gostoAmargoId;
    }

    public void setGostoAmargoId(int gostoAmargoId) {
        this.gostoAmargoId = gostoAmargoId;
    }

    public int getSaborDoceId() {
        return saborDoceId;
    }

    public void setSaborDoceId(int saborDoceId) {
        this.saborDoceId = saborDoceId;
    }

    public int getGostoAcidoId() {
        return gostoAcidoId;
    }

    public void setGostoAcidoId(int gostoAcidoId) {
        this.gostoAcidoId = gostoAcidoId;
    }

    public void obterItensCafe() throws SQLException {
        this.cor = new PCor().consultar(this.corId);
        this.oleosidade = new POleosidade().consultar(this.oleosidadeId);
        this.turbidez = new PTurbidez().consultar(this.turbidezId);

        this.graoVerde = new PGraoVerde().consultar(this.graoVerdeId);
        this.aromaDoce = new PGostoDoce().consultar(this.aromaDoceId);
        this.caramelizado = new PCaramelizado().consultar(this.caramelizadoId);
        this.amendoa = new PAmendoa().consultar(this.amendoaId);
        this.aromaFermentado = new PFermentado().consultar(this.aromaFermentadoId);
        this.aromaQueimado = new PQueimado().consultar(this.aromaQueimadoId);

        this.saborFermentado = new PFermentado().consultar(this.saborFermentadoId);
        this.adstringente = new PAdstringente().consultar(this.adstringenteId);
        this.saborQueimado = new PQueimado().consultar(this.saborQueimadoId);
        this.gostoAmargo = new PGostoAmargo().consultar(this.gostoAmargoId);
        this.saborDoce = new PGostoDoce().consultar(this.saborDoceId);
        this.gostoAcido = new PGostoAcido().consultar(this.gostoAcidoId);
    }

    private void obterItensDoCafe(int corId, int oleosidadeId, int turbidezId, int graoVerdeId, int aromaDoceId,
            int caramelizadoId, int amendoaId, int aromaFermentadoId, int aromaQueimadoId, int saborFermentadoId,
            int adstringenteId, int saborQueimadoId, int gostoAmargoId, int saborDoceId, int gostoAcidoId) throws SQLException {

        this.cor = new PCor().consultar(corId);
        this.oleosidade = new POleosidade().consultar(oleosidadeId);
        this.turbidez = new PTurbidez().consultar(turbidezId);

        this.graoVerde = new PGraoVerde().consultar(graoVerdeId);
        this.aromaDoce = new PGostoDoce().consultar(aromaDoceId);
        this.caramelizado = new PCaramelizado().consultar(caramelizadoId);
        this.amendoa = new PAmendoa().consultar(amendoaId);
        this.aromaFermentado = new PFermentado().consultar(aromaFermentadoId);
        this.aromaQueimado = new PQueimado().consultar(aromaQueimadoId);

        this.saborFermentado = new PFermentado().consultar(saborFermentadoId);
        this.adstringente = new PAdstringente().consultar(adstringenteId);
        this.saborQueimado = new PQueimado().consultar(saborQueimadoId);
        this.gostoAmargo = new PGostoAmargo().consultar(gostoAmargoId);
        this.saborDoce = new PGostoDoce().consultar(saborDoceId);
        this.gostoAcido = new PGostoAcido().consultar(gostoAcidoId);
    }
}
