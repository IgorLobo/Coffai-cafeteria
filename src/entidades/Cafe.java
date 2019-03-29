package entidades;

/**
 *
 * @author Hygor
 */
public class Cafe {

    private int id;
    private String popularidade;

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

    public Cafe() {
        this.id = 0;
        this.popularidade = "";
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
    }

    public Cafe(int id, String popularidade, Cor cor, Oleosidade oleosidade, Turbidez turbidez, GraoVerde graoVerde, GostoDoce aromaDoce, Caramelizado caramelizado, Amendoa amendoa, Fermentado aromaFermentado, Queimado aromaQueimado, Fermentado saborFermentado, Adstringente adstringente, Queimado saborQueimado, GostoAmargo gostoAmargo, GostoDoce saborDoce, GostoAcido gostoAcido) {
        this.id = id;
        this.popularidade = popularidade;
        this.cor = cor;
        this.oleosidade = oleosidade;
        this.turbidez = turbidez;
        this.graoVerde = graoVerde;
        this.aromaDoce = aromaDoce;
        this.caramelizado = caramelizado;
        this.amendoa = amendoa;
        this.aromaFermentado = aromaFermentado;
        this.aromaQueimado = aromaQueimado;
        this.saborFermentado = saborFermentado;
        this.adstringente = adstringente;
        this.saborQueimado = saborQueimado;
        this.gostoAmargo = gostoAmargo;
        this.saborDoce = saborDoce;
        this.gostoAcido = gostoAcido;
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

}
