package DesvioDeFluxo;

import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {
		
		// SWITCH
		
		String opcao = JOptionPane.showInputDialog("Informe um dos tr�s pa�ses com mais t�tulos de Copa do Mundo:");
		
		switch (opcao) {
		
			case "Brasil":
				JOptionPane.showMessageDialog(null, "Voc� acertou! :)");
				break;
		
				
			case "It�lia":
				JOptionPane.showMessageDialog(null, "Voc� acertou! :)");
				break;
				
			case "Alemanha":
				JOptionPane.showMessageDialog(null, "Voc� acertou! :)");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Voc� errou. :(");	
				
		}
		
	}

}
