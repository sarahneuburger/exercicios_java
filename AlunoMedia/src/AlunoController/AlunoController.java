package AlunoController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AlunoModel.AlunoModel;
import AlunoView.AlunoView;

public class AlunoController {
	
	private AlunoModel model;
	
	private AlunoView view;

	public AlunoController(AlunoModel model, AlunoView view) {
		this.model = model;
		this.view = view;
		this.view.AlunoListener(new AlunoListener());
	}
	
	public class AlunoListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			int nota1, nota2, nota3, nota4, media;

			
			nota1 = view.getNota1();
			nota2 = view.getNota2();
			nota3 = view.getNota3();
			nota4 = view.getNota4();
			media = (nota1 + nota2 + nota3 + nota4) / 4;

			model.media(nota1, nota2, nota3, nota4);
			model.situacao(media);

			view.setMedia(model.retornaMedia());
			view.setSituacao(model.retornaSituacao());
			
			
		}
		
		
		
	}
	

}
