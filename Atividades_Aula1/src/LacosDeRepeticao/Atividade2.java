package LacosDeRepeticao;

import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		
		// Laço While
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
		
		System.out.println("Os números entre " + numero1 + " e " + numero2 + " são: ");

		while (numero1 <= numero2) {
			
			System.out.println(numero1);
			numero1++;
			
		}
		
		
	}

}
