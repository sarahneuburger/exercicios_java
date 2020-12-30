package ExercHeranca4;

public class Normal extends Ingresso {

	public Normal(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	public void imprimeValor() {
		System.out.println("Ingresso normal no valor de R$ "+ getValor());
	}
	
}
