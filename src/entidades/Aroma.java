package entidades;

public class Aroma {
	//Aroma
	private String caracteristico;
	private String graoVerde;
	private String doce;
	private String caramelizado;
	private String amendoa;
	private String fermentado;
	private String queimado;
	
	
	
	public Aroma() {
	}

	public Aroma(String caracteristico, String graoVerde, String doce, String caramelizado, String amendoa,
			String fermentado, String queimado) {
		this.caracteristico = caracteristico;
		this.graoVerde = graoVerde;
		this.doce = doce;
		this.caramelizado = caramelizado;
		this.amendoa = amendoa;
		this.fermentado = fermentado;
		this.queimado = queimado;
	}

	public String getCaracteristico() {
		return caracteristico;
	}

	public void setCaracteristico(String caracteristico) {
		this.caracteristico = caracteristico;
	}

	public String getGraoVerde() {
		return graoVerde;
	}

	public void setGraoVerde(String graoVerde) {
		this.graoVerde = graoVerde;
	}

	public String getDoce() {
		return doce;
	}

	public void setDoce(String doce) {
		this.doce = doce;
	}

	public String getCaramelizado() {
		return caramelizado;
	}

	public void setCaramelizado(String caramelizado) {
		this.caramelizado = caramelizado;
	}

	public String getAmendoa() {
		return amendoa;
	}

	public void setAmendoa(String amendoa) {
		this.amendoa = amendoa;
	}

	public String getFermentado() {
		return fermentado;
	}

	public void setFermentado(String fermentado) {
		this.fermentado = fermentado;
	}

	public String getQueimado() {
		return queimado;
	}

	public void setQueimado(String queimado) {
		this.queimado = queimado;
	}
	
	
}
