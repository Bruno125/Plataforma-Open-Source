

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_correcto = "admin";
		String pass_correcta = "123";
		String user = request.getParameter("user"),pass = request.getParameter("pass");
		boolean cumple = (user.equals(user_correcto)) && (pass.equals(pass_correcta));
		request.setAttribute("cumple", cumple);
		if(cumple){
			request.setAttribute("mensaje", "Datos correctos");
		}else{
			request.setAttribute("mensaje", "Datos incorrectos");
		}
		getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
		
		
	}

}
