package ExercHeranca4;

public class CamaroteSuperior extends Ingresso{
	
	private double adcCamarote;

	public CamaroteSuperior(double valor, double adcCamarote) {
		super(valor);
		this.setAdcCamarote(adcCamarote);
	}

	public double getAdcCamarote() {
		return adcCamarote;
	}

	public void setAdcCamarote(double adcCamarote) {
		this.adcCamarote = adcCamarote;
	}

	public void imprimeValor() {
		System.out.println("R$ " + getValor() + adcCamarote);
	}
	
}
