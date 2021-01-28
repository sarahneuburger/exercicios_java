package dadosPesquisa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DadosPesquisa extends HttpServlet {
	
	String link;
	

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter dadosTela = resp.getWriter();
		
		String pesquisa = req.getParameter("pesquisa");
		
		String buscador = req.getParameter("botaoPesquisa");
				
		switch (buscador) {
			
			case "google": 
				link = ("https://www.google.com/search?q=" + pesquisa);
				break;
				
			case "bing":
				link = ("https://www.bing.com/search?q=" + pesquisa);
				break;
				
			case "duckduckgo":
				link = ("https://duckduckgo.com/?q=" + pesquisa);
				break;
				
			case "yahoo":
				link = ("https://br.search.yahoo.com/search?p=" + pesquisa);
				break;
			
		}
		
		dadosTela.println("<html>");
		dadosTela.println("<head>");
		dadosTela.println("<title>Pesquisando</title>");
		dadosTela.println("</head>");
		dadosTela.println("<meta http-equiv=\"Refresh\" content=\"0; url=" + link + "\"/>");
		dadosTela.println("<body>");
		dadosTela.println("</body>");
		dadosTela.println("</html>");
	}

}
