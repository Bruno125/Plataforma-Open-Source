

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida  = response.getWriter();
		try{
		int id = Integer.parseInt(request.getParameter("id"));
		salida.print("Id del producto: " + id);
		}catch(Exception e){
			salida.print("Error");	
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida  = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		

		salida.print("<p>"+ "Usuario: " + usuario + "</p>");
		salida.print("<p>"+ "Clave: " + clave + "</p>");
	}

}
