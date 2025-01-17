package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Autor;
import dao.AutorDao;
import dao.jpa.AutorJpa;

/**
 * Servlet implementation class AutorCrear
 */
@WebServlet("/AutorCrear")
public class AutorCrear extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AutorCrear() {
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
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String nacionalidad = request.getParameter("nacionalidad");
		
		Autor autor = new Autor();
		autor.setNombres(nombre);
		autor.setApellidos(apellidos);
		autor.setNacionalidad(nacionalidad);
		
		AutorDao autorDao = new AutorJpa();
		boolean success = autorDao.insert(autor);
		if(success)
			request.setAttribute("mensaje", "Se inserto el autor correctamente");
		else
			request.setAttribute("mensaje", "Ocurri� un error.");
		getServletContext().getRequestDispatcher("/autor_crear.jsp").forward(request, response);
	}

}
