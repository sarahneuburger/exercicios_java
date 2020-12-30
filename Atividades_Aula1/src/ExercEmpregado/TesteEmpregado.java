package ExercEmpregado;

public class TesteEmpregado {

	public static void main(String[] args) {

		// Criando empregado 1
		Empregado e1 = new Empregado("Sarah", "Brito", 5500.00);
		
		// Exibindo dados do e1
		e1.exibeDados();
		
		// Aumento e salário anual e1
		e1.aumento();
		
		// Criando empregado 2
		Empregado e2 = new Empregado("Henrique", "Martins", 4850.00);
		
		// Exibindo dados e2
		e2.exibeDados();
		
		// Aumento e salário anual e2
		e2.aumento();
		

	}

}
