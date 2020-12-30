package ExercHeranca1;

public class AssistenteTecnico extends Assistente {
	
	private int bonus;

	public AssistenteTecnico(String nome, String area, int matricula, int bonus) {
		super(nome, area, matricula);
		this.bonus = bonus;
	}

	public void exibeDados() {
		super.exibeDados();
		System.out.println(bonus);
	}
	
}
