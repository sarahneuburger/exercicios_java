package ExercHeranca4;

public class Ingresso {

	private double valor;
	
	public Ingresso(double valor) {
		this.setValor(valor);
	}

	public void imprimeValor() {
		System.out.println(getValor());
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
