package ExercHeranca1;

public class Funcionario {
	
	private String nome;
	private String area;
	
	public Funcionario(String nome, String area) {
		this.nome = nome;
		this.area = area;
	}
	
	public void exibeDados() {
		System.out.println(nome);
		System.out.println(area);
	}
}
