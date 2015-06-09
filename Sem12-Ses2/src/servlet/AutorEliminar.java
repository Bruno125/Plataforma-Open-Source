package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AutorDao;
import dao.jpa.AutorJpa;

/**
 * Servlet implementation class AutorEliminar
 */
@WebServlet("/AutorEliminar")
public class AutorEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutorEliminar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean success = false;
		try{
			AutorDao autorDao = new AutorJpa();
			success = autorDao.delete(Integer.valueOf(id));
		}catch(Exception e){
			success = false;
		}
		if(success)
			request.setAttribute("mensaje", "Se eliminó al autor correctamente");
		else
			request.setAttribute("mensaje", "Ocurrio un error");
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
