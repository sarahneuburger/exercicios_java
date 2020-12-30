package DemaisAtividades;

import javax.swing.JOptionPane;

public class Atividade13 {

	public static void main(String[] args) {
		// Atividade divisores
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
		

		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				
				System.out.println(i);
			
			}
			
		} 
		
	}
}
