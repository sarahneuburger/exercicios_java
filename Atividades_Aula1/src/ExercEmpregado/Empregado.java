package ExercEmpregado;

import javax.swing.JOptionPane;

public class Empregado {
	
	// Vari�veis
	private String nome;
	private String sobrenome;
	private double salario;
	
	// Construtor
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	
	// Get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// M�todo pra exibir dados do empregador
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Dados do colaborador \nNome: " + getNome() + "\nSobrenome: " + 
											getSobrenome() + "\nSal�rio: " + getSalario());
	}
	
	// m�todo para o aumento de 10% e c�lculo do sal�rio anual, considerando o aumento
	public void aumento() {
		double aumento = getSalario() + (getSalario() * 0.1);
		JOptionPane.showInternalMessageDialog(null, "O sal�rio anual do(a) colaborador(a) " + getNome() + 
				" com o aumento de 10% ser� de: R$ " + (aumento * 12));
		
	}
	
	
	
}
