package ExercHeranca2;

public class Animal {
	
	private String nome;
	private String raca;
	
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
		
	}
	
	public Animal(String nome) {
		this.setNome(nome);
	}

	public void caminha() {
		System.out.println("O animal está caminhando.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
