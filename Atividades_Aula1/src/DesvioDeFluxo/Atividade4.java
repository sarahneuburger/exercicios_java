package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		
		// IF ELSE
		
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Insira sua nota:"));
		
		if (nota >= 6) {
			
			System.out.println("Voc� est� aprovado!");
			
		} else {
			
			System.out.println("Voc� est� reprovado!");
			
		}
		

	}

}
