package DemaisAtividades;

import javax.swing.JOptionPane;

public class Atividade19 {

	public static void main(String[] args) {
		// Array, inserir 10 n�meros e exibir
		
		double[] numeros;
		
		numeros = new double[10];
		
		numeros[0] = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro n�mero:"));
		numeros[1] = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo n�mero:"));
		numeros[2] = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro n�mero:"));
		numeros[3] = Double.parseDouble(JOptionPane.showInputDialog("Insira o quarto n�mero:"));
		numeros[4] = Double.parseDouble(JOptionPane.showInputDialog("Insira o quinto n�mero:"));
		numeros[5] = Double.parseDouble(JOptionPane.showInputDialog("Insira o sexto n�mero:"));
		numeros[6] = Double.parseDouble(JOptionPane.showInputDialog("Insira o s�timo n�mero:"));
		numeros[7] = Double.parseDouble(JOptionPane.showInputDialog("Insira o oitavo n�mero:"));
		numeros[8] = Double.parseDouble(JOptionPane.showInputDialog("Insira o nono n�mero:"));
		numeros[9] = Double.parseDouble(JOptionPane.showInputDialog("Insira o d�cimo n�mero:"));
		
		System.out.println("Os n�meros inseridos foram: \n");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
				

	}

}
