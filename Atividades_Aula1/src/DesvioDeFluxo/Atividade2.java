package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		// IF ELSE
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para verificar se � par ou impar:"));
		
		if (numero % 2 == 0) {
			
			System.out.println("O n�mero informado � par.");
			
		} else {
			
			System.out.println("O n�mero informado � impar.");

		}

	}
	
}
