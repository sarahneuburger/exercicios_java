package ExercHeranca5;

public class Velho extends Imovel{
	
	private double descImovelAntigo;

	public Velho(String endereco, double valor, double descImovelAntigo) {
		super(endereco, valor);
		this.setDescImovelAntigo(descImovelAntigo);
	}

	public double getDescImovelAntigo() {
		return descImovelAntigo;
	}

	public void setDescImovelAntigo(double descImovelAntigo) {
		this.descImovelAntigo = descImovelAntigo;
	}

	public void imprime() {
		System.out.println("O valor total do imóvel antigo é R$ " + (getValor() - descImovelAntigo));
	}
	
}
