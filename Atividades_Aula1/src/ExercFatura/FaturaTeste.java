package ExercFatura;

public class FaturaTeste {
	
	public static void main(String[] args) {
		
		Fatura f1 = new Fatura("1", "Computador", 3, 2.500);
		
		f1.getTotalFatura();
		
		Fatura f2 = new Fatura("2", "Mouse", 2, -5.50);
		f2.getTotalFatura();
	}

}
