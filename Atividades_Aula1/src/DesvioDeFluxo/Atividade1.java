package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		// IF ELSE

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para verifica��o:"));
		
		if (numero >= 5 && numero % 5 == 0) {
			
			System.out.println("O n�mero � multiplo de cinco.");
			
		} else {
			
			System.out.println("O n�mero n�o � multiplo de cinco.");
			
		}
		
		
	}

}
