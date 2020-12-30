package DemaisAtividades;

import javax.swing.JOptionPane;

public class Atividade19 {

	public static void main(String[] args) {
		// Array, inserir 10 números e exibir
		
		double[] numeros;
		
		numeros = new double[10];
		
		numeros[0] = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número:"));
		numeros[1] = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número:"));
		numeros[2] = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro número:"));
		numeros[3] = Double.parseDouble(JOptionPane.showInputDialog("Insira o quarto número:"));
		numeros[4] = Double.parseDouble(JOptionPane.showInputDialog("Insira o quinto número:"));
		numeros[5] = Double.parseDouble(JOptionPane.showInputDialog("Insira o sexto número:"));
		numeros[6] = Double.parseDouble(JOptionPane.showInputDialog("Insira o sétimo número:"));
		numeros[7] = Double.parseDouble(JOptionPane.showInputDialog("Insira o oitavo número:"));
		numeros[8] = Double.parseDouble(JOptionPane.showInputDialog("Insira o nono número:"));
		numeros[9] = Double.parseDouble(JOptionPane.showInputDialog("Insira o décimo número:"));
		
		System.out.println("Os números inseridos foram: \n");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
				

	}

}
