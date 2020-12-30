package ExercHeranca4;

public class CamaroteInferior extends Ingresso {
	
	private String localizacao;

	public CamaroteInferior(double valor, String localizacao) {
		super(valor);
		this.setLocalizacao(localizacao);
		}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void imprimeValor() {
		System.out.println("A localização do camarote inferir é " + getLocalizacao());
	}
	
}
