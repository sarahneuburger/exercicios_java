package ExercHeranca5;

public class Novo extends Imovel{
	
	private double adcNovo;

	public Novo(String endereco, double valor, double adcNovo) {
		super(endereco, valor);
		this.setAdcNovo(adcNovo);
	}

	public double getAdcNovo() {
		return adcNovo;
	}

	public void setAdcNovo(double adcNovo) {
		this.adcNovo = adcNovo;
	}

	public void imprime() {
		System.out.println("O valor total do imóvel novo é R$ " + (getValor() + adcNovo));
	}
	
}
