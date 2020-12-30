package ExercFatura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Fatura {
	
	// Variaveis	
	private String numero;
	private String descricao;
	private int qtdade;
	private double preco;
	
	// Construtor
	public Fatura(String numero, String descricao, int qtdade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtdade = qtdade;
		this.preco = preco;
	}
	
	
	// Get e set
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdade() {
		return qtdade;
	}
	public void setQtdade(int qtdade) {
		this.qtdade = qtdade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Método total fatura
	public double getTotalFatura() {
		double totalFatura = getQtdade() * getPreco(); // os arrendondamentos não funcionaram
		if(totalFatura < 0) {
			Math.round(totalFatura);
			JOptionPane.showMessageDialog(null, "O valor da fatura é: R$ " + totalFatura);
		} else {
			DecimalFormat decimal = new DecimalFormat("0.00");
			decimal.format(totalFatura);
			JOptionPane.showMessageDialog(null, "O valor da fatura é: R$ " + totalFatura);
		}
		return totalFatura;
	}
	

}
