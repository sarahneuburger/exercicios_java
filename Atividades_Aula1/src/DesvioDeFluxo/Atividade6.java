package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade6 {
	
	
	public static void main(String[] args) {
		// SWITCH
		
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a op��o:\n 1 - Sacar\n 2 - Depositar\n 3 - Verificar Saldo\n"));
		
		switch (opcao) {
			
			case 1:
				JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o sacar.");
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o depositar.");
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o verificar saldo.");
				
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida.");
			
			
		}		
		
		
	}

}
