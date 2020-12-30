package ExercHeranca1;

public class Gerente extends Funcionario {
	
	private String equipe;

	public Gerente(String nome, String area, String equipe) {
		super(nome, area);
		this.equipe = equipe;
	}

	public void exibeDados() {
		super.exibeDados();
		System.out.println(equipe);
	}
	
}
