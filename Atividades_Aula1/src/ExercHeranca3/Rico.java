package ExercHeranca3;

public class Rico extends Pessoa {
	
	private double dinheiro;

	public Rico(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.setDinheiro(dinheiro);
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras () {
		System.out.println("O rico faz compras.");
	}

}
