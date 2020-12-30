package ExercEmpregado;

import javax.swing.JOptionPane;

public class Empregado {
	
	// Variáveis
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
	
	// Método pra exibir dados do empregador
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Dados do colaborador \nNome: " + getNome() + "\nSobrenome: " + 
											getSobrenome() + "\nSalário: " + getSalario());
	}
	
	// método para o aumento de 10% e cálculo do salário anual, considerando o aumento
	public void aumento() {
		double aumento = getSalario() + (getSalario() * 0.1);
		JOptionPane.showInternalMessageDialog(null, "O salário anual do(a) colaborador(a) " + getNome() + 
				" com o aumento de 10% será de: R$ " + (aumento * 12));
		
	}
	
	
	
}
