package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UsuarioBean;
import util.MyUtils;
import dao.UsuarioDao;

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
		//TODO: Invocar al web service
		UsuarioDao usuarioDao = MyUtils.getUsuarioDao();
		UsuarioBean usuarioBean = usuarioDao.validarUsuario(usuario, clave);
		if(usuarioBean!=null){
			boolean aplicacionValida = usuarioDao.validarAplicacion(usuarioBean.getIdUsuario(), MyUtils.ID_SERVICIO);
			if(aplicacionValida){
				request.setAttribute("nombres", usuarioBean.getNombres());
				request.setAttribute("apellidos", usuarioBean.getApellidos());
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
