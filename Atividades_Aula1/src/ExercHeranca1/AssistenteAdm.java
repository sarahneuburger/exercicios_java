package ExercHeranca1;

public class AssistenteAdm extends Assistente{

	private String turno;
	private double adicionalNot;
	
	public AssistenteAdm(String nome, String area, int matricula, String turno, double adicionalNot) {
		super(nome, area, matricula);
		this.turno = turno;
		this.adicionalNot = adicionalNot;
	}
	
	public void exibeDados() {
		super.exibeDados();
		System.out.println(turno);
		System.out.println(adicionalNot);
	}

}
