package ExercHeranca1;

public class Assistente extends Funcionario{

	private int matricula;
	
	public Assistente(String nome, String area, int matricula) {
		super(nome, area);
		this.matricula = matricula;
		
	}
	
	public int getMatricula () {
		return this.matricula;
	}
	
	
	public void exibeDados() {
		super.exibeDados();
		System.out.println(matricula);
	}
}
