package DemaisAtividades;

import javax.swing.JOptionPane;

public class Atividade16 {

	public static void main(String[] args) {
		// Gasto combustível
		
		int veiculo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo do veículo: \n 1- Carro \n 2- Moto"));
		
		int kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira o km inicial:"));
		
		int kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira o km final:"));
		
		int qtdLitros = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de litros de combustível utilizada:"));
		
		int kmTotal = kmFinal - kmInicial;
		
		int consumo = kmTotal / qtdLitros;
		
		if (veiculo == 1 && consumo < 9) {
			
			JOptionPane.showMessageDialog(null, "O consumo de combustível do carro está ruim.");
			
		} else if (veiculo == 1 && consumo < 16) {
			
			JOptionPane.showMessageDialog(null, "O consumo de combustível do carro está regular.");
			
		} else if (veiculo == 1 && consumo >= 16) {
			
			JOptionPane.showMessageDialog(null, "O consumo de combustível do carro está bom.");
		} else if (veiculo == 2 && consumo < 18) {
		
			JOptionPane.showMessageDialog(null, "O consumo de combustível da moto está ruim.");
		
		} else if (veiculo == 2 && consumo > 32) {
		
			JOptionPane.showMessageDialog(null, "O consumo de combustível da moto está regular.");

		} else if (veiculo == 2 && consumo >= 32) {
		
			JOptionPane.showMessageDialog(null, "O consumo de combustível da moto está bom.");	
			
		}
	}

}
