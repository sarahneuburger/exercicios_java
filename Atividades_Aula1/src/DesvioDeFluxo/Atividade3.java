package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		
		// IF ELSE
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		
		if (idade >= 18) {
			
			System.out.println("Voc� � adulto!");
			
		} else {
			
			System.out.println("Voc� � menor de idade.");
			
		}


	}

}
