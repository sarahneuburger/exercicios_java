package DemaisAtividades;

public class Atividade20 {
	
	
		// Informar os números negativos do array
		
		private int[] numeros = {-1, -3, 5, -8, 9, 0}; {		
		
		}
		
		public Atividade20(int[] numeros) {
			this.numeros = numeros;
		}
		
		
		public Atividade20() {

		}


		public void setNumeros(int[] numeros) {
			this.numeros = numeros;
		}
		
		public int[] getNumeros() {
			return this.numeros;
		}
			
		
		public void negativos() {
			
			int contador = 6;
			
			for (int i = 0; i < contador ; i++) {
				
				while (numeros[i] < 0) {
			
					System.out.println(numeros);
				}
				
			}
		}
}

//numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
//numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
//numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:"));
//numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto número:"));
//numeros[4] = Integer.parseInt(JOptionPane.showInputDialog("Insira o quinto número:"));
//numeros[5] = Integer.parseInt(JOptionPane.showInputDialog("Insira o sexto número:")); 
