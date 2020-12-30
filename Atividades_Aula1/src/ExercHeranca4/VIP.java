package ExercHeranca4;

public class VIP extends Ingresso{
	
	private double valorAdicional;

	public VIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	public void imprimeValor() {
		System.out.println("R$ "+ getValor() + valorAdicional);
	}
	
}
