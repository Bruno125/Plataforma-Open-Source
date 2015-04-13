

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		String correo = request.getParameter("correo");
		String clave1 = request.getParameter("clave");
		String clave2 = request.getParameter("clave2");
		String sexo = request.getParameter("sexo");
		String carrera = request.getParameter("carrera");
		String interes[] = request.getParameterValues("interes");
		String lenguaje[] = request.getParameterValues("lenguaje");
		String mensaje = request.getParameter("mensaje");
		
		salida.print("Hacer algo en la base de datos con los valores...");
		
		
	}

}
