

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticiasServlet
 */
@WebServlet("/noticias")
public class NoticiasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticiasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		
		pw.print("<!DOCTYPE html>");
		pw.print("<html>");
		pw.print("<body>");
		pw.print("Se seleccionó la noticia " + request.getParameter("id"));
		pw.print("</body>");
		pw.print("</html>");
		
	}

}
