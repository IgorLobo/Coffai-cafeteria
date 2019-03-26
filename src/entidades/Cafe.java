package entidades;

public class Cafe {
	private Aroma aroma;
	private Aparencia aparencia;
	private Sabor sabor;
	
	public Cafe() {

	}


	public Cafe(Aroma aroma, Aparencia aparencia, Sabor sabor) {
		this.aroma = aroma;
		this.aparencia = aparencia;
		this.sabor = sabor;
	}


	public Aroma getAroma() {
		return aroma;
	}


	public void setAroma(Aroma aroma) {
		this.aroma = aroma;
	}


	public Aparencia getAparencia() {
		return aparencia;
	}


	public void setAparencia(Aparencia aparencia) {
		this.aparencia = aparencia;
	}


	public Sabor getSabor() {
		return sabor;
	}


	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	
	
	
}
