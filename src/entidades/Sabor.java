package entidades;

public class Sabor {

	private String caracteristico;
	private String fermentado;
	private String adstringente;
	private String queimado;
	private String amargoResidual;
	private String gostoDoce;
	private String gostoAcido;
	
	public Sabor() {

	}

	public Sabor(String caracteristico, String fermentado, String adstringente, String queimado, String amargoResidual,
			String gostoDoce, String gostoAcido) {
		this.caracteristico = caracteristico;
		this.fermentado = fermentado;
		this.adstringente = adstringente;
		this.queimado = queimado;
		this.amargoResidual = amargoResidual;
		this.gostoDoce = gostoDoce;
		this.gostoAcido = gostoAcido;
	}

	public String getCaracteristico() {
		return caracteristico;
	}

	public void setCaracteristico(String caracteristico) {
		this.caracteristico = caracteristico;
	}

	public String getFermentado() {
		return fermentado;
	}

	public void setFermentado(String fermentado) {
		this.fermentado = fermentado;
	}

	public String getAdstringente() {
		return adstringente;
	}

	public void setAdstringente(String adstringente) {
		this.adstringente = adstringente;
	}

	public String getQueimado() {
		return queimado;
	}

	public void setQueimado(String queimado) {
		this.queimado = queimado;
	}

	public String getAmargoResidual() {
		return amargoResidual;
	}

	public void setAmargoResidual(String amargoResidual) {
		this.amargoResidual = amargoResidual;
	}

	public String getGostoDoce() {
		return gostoDoce;
	}

	public void setGostoDoce(String gostoDoce) {
		this.gostoDoce = gostoDoce;
	}

	public String getGostoAcido() {
		return gostoAcido;
	}

	public void setGostoAcido(String gostoAcido) {
		this.gostoAcido = gostoAcido;
	}
	
}
