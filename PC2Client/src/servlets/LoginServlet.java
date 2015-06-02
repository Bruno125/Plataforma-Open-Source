package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import services.GoogleServicesStub;
import services.GoogleServicesStub.Login;
import services.GoogleServicesStub.UsuarioBean;
import services.GoogleServicesStub.ValidarAplicacion;
import util.Constantes;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		//Invocar al web service de login
		GoogleServicesStub stub = new GoogleServicesStub();
		Login login = new Login();
		login.setUsuario(usuario);
		login.setClave(clave);
		UsuarioBean usuarioBean = stub.login(login).get_return();
		if(usuarioBean!=null){
			//El usuario existe, ahora verificar si esta registrado en dicha aplicacion
			ValidarAplicacion validarApp = new ValidarAplicacion();
			validarApp.setIdUsuario(usuarioBean.getIdUsuario());
			validarApp.setIdServicio(Constantes.ID_SERVICIO);
			boolean aplicacionValida = stub.validarAplicacion(validarApp).get_return();
			if(aplicacionValida){
				HttpSession session = request.getSession();
				session.setAttribute("nombres", usuarioBean.getNombres());
				session.setAttribute("apellidos", usuarioBean.getApellidos());
				getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);
			}else{
				request.setAttribute("mensaje", "Aun no estas registrado en este servicio.");
				getServletContext().getRequestDispatcher("/admin/login.jsp").forward(request, response);
			}
		}else{
			request.setAttribute("mensaje", "Crendenciales invalidas");
			getServletContext().getRequestDispatcher("/admin/login.jsp").forward(request, response);
		}
	}

}
