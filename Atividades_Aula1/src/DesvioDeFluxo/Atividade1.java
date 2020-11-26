package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		// IF ELSE

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para verificação:"));
		
		if (numero >= 5 && numero % 5 == 0) {
			
			System.out.println("O número é multiplo de cinco.");
			
		} else {
			
			System.out.println("O número não é multiplo de cinco.");
			
		}
		
		
	}

}
