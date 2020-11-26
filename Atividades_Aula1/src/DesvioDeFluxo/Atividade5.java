package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		
		// IF ELSE
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira sua primeira nota:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira sua segunda nota:"));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Insira sua terceira nota:"));
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		
		if (media >= 9) {
			
			JOptionPane.showMessageDialog(null, "Conceito A.");
			
		} else if (media < 9 && media >= 7) {
			
			JOptionPane.showMessageDialog(null, "Conceito B.");
			
		} else if (media < 7 && media >= 5) {
			
			JOptionPane.showMessageDialog(null, "Conceito C.");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Conceito insuficiente.");
		}
		

	}

}
	

