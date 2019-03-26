package entidades;

public class Aparencia {
	private String cor;
	private String oleosidade;
	private String turbidez;
	
	
	public Aparencia() {
	}



	public Aparencia(String cor, String oleosidade, String turbidez) {
		this.cor = cor;
		this.oleosidade = oleosidade;
		this.turbidez = turbidez;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getOleosidade() {
		return oleosidade;
	}



	public void setOleosidade(String oleosidade) {
		this.oleosidade = oleosidade;
	}



	public String getTurbidez() {
		return turbidez;
	}



	public void setTurbidez(String turbidez) {
		this.turbidez = turbidez;
	}
	
	
	
}
