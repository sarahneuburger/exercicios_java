package Contato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {
		
		List <Contato> agendaDeContatos = new ArrayList <Contato> ();
		
		int menu = 0;
		
		while (menu != 5) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada: \n1- Cadastrar Contato \n2- Buscar Contato "
					+ "\n3- Excluir Contato \n4- Imrpimir Agenda \n5- Sair"));
			
			switch (menu) {
			case 1:
				String nome = JOptionPane.showInputDialog("Insira o nome para cadastro:");
				String telefone = JOptionPane.showInputDialog("Insira o telefone para cadastro:");
				Contato c = new Contato(nome, telefone);
				agendaDeContatos.add(c);
				break;
				
			case 2:
				String nomeBusca = JOptionPane.showInputDialog("Informe o nome do contato que deseja buscar:");
				for (int i = 0; i < agendaDeContatos.size(); i++) {
					Contato busca = (Contato) agendaDeContatos.get(i);
					if (busca.getNome().equalsIgnoreCase(nomeBusca)) {
						JOptionPane.showMessageDialog(null, "Contato localizado: " + busca.getNome() + ", " + busca.getTelefone());
					} else {
						JOptionPane.showMessageDialog(null, "Contato não localizado/já apresentado."); // Como melhorar o código para não continuar o for qdo já localizar a busca
					}
				}
				break;
				
			case 3:
				String excluiContato = JOptionPane.showInputDialog("Informe o nome do contato que deseja excluir:");
				for (int i = 0; i < agendaDeContatos.size(); i++) {
					Contato exclui = (Contato) agendaDeContatos.get(i); 
					if (exclui.getNome().equalsIgnoreCase(excluiContato)) {
						agendaDeContatos.remove(i);
						JOptionPane.showMessageDialog(null, "Contato excluído.");
					} else {
						JOptionPane.showMessageDialog(null, "Contato não localizado.");
					}
				}
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Imprimindo a lista de contatos.");				
				for (int i = 0; i < agendaDeContatos.size(); i++) {
					Contato imprime = (Contato) agendaDeContatos.get(i); // Entender melhor o que faz essa parte
					// Fiz primeiro o agendaDeContatos.get(i) dentro do JOption, porém imprimia apenas a id, não o conteúdo
					JOptionPane.showMessageDialog(null, "Nome:" + imprime.getNome() + " \nTelefone: " + imprime.getTelefone());
				}
				break;
				
			case 5:	
				JOptionPane.showMessageDialog(null, "Você escolheu sair.");	
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Selecione uma opção válida.");		
			
				}
			}

	}

}
