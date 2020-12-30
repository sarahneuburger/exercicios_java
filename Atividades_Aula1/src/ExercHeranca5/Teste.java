package ExercHeranca5;

import javax.swing.JOptionPane;

import ExercHeranca1.AssistenteAdm;
import ExercHeranca1.AssistenteTecnico;
import ExercHeranca2.Cachorro;
import ExercHeranca2.Gato;
import ExercHeranca3.Miseravel;
import ExercHeranca3.Pobre;
import ExercHeranca3.Rico;
import ExercHeranca4.CamaroteInferior;
import ExercHeranca4.CamaroteSuperior;
import ExercHeranca4.Ingresso;
import ExercHeranca4.Normal;

public class Teste {

	public static void main(String[] args) {
		// Testes com as classes criadas
		
		// Criar um assistente adm e um técnico e exibir dados
		
		AssistenteAdm p1 = new AssistenteAdm("Maria", "Financeiro", 123, "Matutino", 55.98);
		
		AssistenteTecnico p2 = new AssistenteTecnico("Joao", "Marketing", 124, 100);

		p1.exibeDados();
		
		p2.exibeDados();
		
		// Criar um cachorro e um gato 
		Cachorro c1 = new Cachorro("Bob", "Chowchow");
		c1.late();
		c1.caminha();
		
		Gato g1 = new Gato("Pericles", "Angora");
		
		g1.mia();
		g1.caminha();
		
		// Testar classe rico. pobre e miserável
		Rico r1 = new Rico("Sarah", 25, 100000.99);
		
		r1.fazCompras();
		
		Pobre p3 = new Pobre("Henrique", 39);
		
		p3.trabalha();
		
		Miseravel m1 = new Miseravel("Julia", 33);
		
		m1.mendiga();
		
		// Ingressos
		Ingresso i1 = new Ingresso(150.00);
		
		int tipoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo do ingresso, sendo 1 para normal e 2 para VIP:"));
		
		if (tipoIngresso == 1) {
			System.out.println("Você escolheu o ingresso normal.");
			Normal n1 = new Normal(150.00);
			n1.imprimeValor();
		
		}	else if (tipoIngresso == 2) {
			System.out.println("Você escolheu o ingresso VIP.");
			int camarote = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de camarote, sendo 1 superior e 2 para inferior:"));
				if (camarote == 1) {
					System.out.println("Você escolheu o camarote superior.");
					CamaroteSuperior cs1 = new CamaroteSuperior(150.00, 56.00);
					cs1.imprimeValor();
				} else if (camarote == 2) {
					System.out.println("Você escolheu o camarote inferior.");
					CamaroteInferior ci1 = new CamaroteInferior(150.00, "Frente do Palco.");
					ci1.imprimeValor();
				}			
		}
		
		
		// Teste imóvel
		Imovel imovel1 = new Imovel("Rua das Palmeiras", 250000.00);
		
		int tipoImovel = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo do imóvel, sendo 1 para novo e 2 para antigo"));
		
		if (tipoImovel == 1) {
			Novo novo1 = new Novo("Rua das Palmeiras", 250000.00, 50000);
			novo1.imprime();
		} else if (tipoImovel == 2) {
			Velho velho1 = new Velho("Rua das Palmeiras", 250000.00, 3000);
			velho1.imprime();
		
		}
		
	}

}
