package LacosDeRepeticao;

import javax.swing.JOptionPane;

public class Atividade4 {
	
	public static void main(String[] args) {
		
	// La�o While
	
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero para multiplicar por 5:"));

	while (numero1 > 0) {
		System.out.println(numero1 * 5);
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero para multiplicar por 5:"));
		
	}
	
}

}