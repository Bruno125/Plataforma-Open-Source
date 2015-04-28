

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticiaServlet
 */
@WebServlet("/noticia")
public class NoticiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoticiaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		switch (codigo) {
			case "1":
				request.setAttribute("titulo", "Titulo noticia 1");
				request.setAttribute("descripcion", "Descripcion noticia 1");
				request.setAttribute("fecha", "20/04/2015");
				break;
			case "2":
				request.setAttribute("titulo", "Titulo noticia 2");
				request.setAttribute("descripcion", "Descripcion noticia 2");
				request.setAttribute("fecha", "19/04/2015");
				break;
			case "3":
				request.setAttribute("titulo", "Titulo noticia 3");
				request.setAttribute("descripcion", "Descripcion noticia 3");
				request.setAttribute("fecha", "18/04/2015");
				break;
			case "4":
				request.setAttribute("titulo", "Titulo noticia 4");
				request.setAttribute("descripcion", "Descripcion noticia 4");
				request.setAttribute("fecha", "17/04/2015");
				break;
			case "5":
				request.setAttribute("titulo", "Titulo noticia 5");
				request.setAttribute("descripcion", "Descripcion noticia 5");
				request.setAttribute("fecha", "16/04/2015");
				break;
			case "6":
				request.setAttribute("titulo", "Titulo noticia 6");
				request.setAttribute("descripcion", "Descripcion noticia 6");
				request.setAttribute("fecha", "15/04/2015");
				break;
			case "7":
				request.setAttribute("titulo", "Titulo noticia 7");
				request.setAttribute("descripcion", "Descripcion noticia 7");
				request.setAttribute("fecha", "14/04/2015");
				break;
			default:
				break;
		}
		getServletContext().getRequestDispatcher("/detalle.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
