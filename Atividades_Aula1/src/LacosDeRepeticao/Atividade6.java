package LacosDeRepeticao;

import javax.swing.JOptionPane;

public class Atividade6 {

	public static void main(String[] args) {
		
		// La�o Do While
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro n�mero:"));
		
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo n�mero:"));
		
		System.out.println("Os n�meros entre " + numero1 + " e " + numero2 + " s�o: ");

		do {
			
			System.out.println(numero1);
			numero1++;
		
		} while (numero1 <= numero2);
			
			
	}
		
		
}



