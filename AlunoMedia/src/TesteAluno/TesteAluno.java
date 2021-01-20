package TesteAluno;

import AlunoController.AlunoController;
import AlunoModel.AlunoModel;
import AlunoView.AlunoView;

public class TesteAluno {
	

		
		public static void main(String[] args) {
			
			AlunoView view = new AlunoView();
			
			AlunoModel model = new AlunoModel();
			
			AlunoController controller = new AlunoController(model, view);
			
			view.setVisible(true);;
			
		}

	}



