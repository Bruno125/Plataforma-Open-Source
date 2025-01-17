package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.Editorial;
import model.Genero;
import model.Libro;
import dao.EditorialDao;
import dao.GeneroDao;
import dao.LibroDao;
import dao.jpa.EditorialJpa;
import dao.jpa.GeneroJpa;
import dao.jpa.LibroJpa;

/**
 * Servlet implementation class LibroAgregar
 */
@WebServlet("/LibroAgregar")
public class LibroAgregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibroAgregar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GeneroDao generoDao = new GeneroJpa();
		EditorialDao editorialDao = new EditorialJpa();
		List<Genero> generos = generoDao.list();
		List<Editorial> editoriales = editorialDao.list();
		
		request.setAttribute("generos", generos);
		request.setAttribute("editoriales", editoriales);
		
		getServletContext().getRequestDispatcher("/agregar_libro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Me devuelve el path del archivo seleccionado
		Part part = request.getPart("imagen");
		
		
		int generoId = Integer.parseInt(request.getParameter("genero"));
		int editorialId = Integer.parseInt(request.getParameter("editorial"));
		Genero genero = new Genero();
		genero.setId(generoId);
		Editorial editorial = new Editorial();
		editorial.setId(editorialId);
		
		Libro libro = new Libro();
		libro.setTitulo(request.getParameter("titulo"));
		libro.setDescripcion(request.getParameter("descripcion"));
		libro.setIsbn(request.getParameter("isbn"));
		libro.setGenero(genero);
		libro.setEditorial(editorial);
		
		LibroDao libroDao = new LibroJpa();
		boolean success = libroDao.insert(libro);
		if(success){
			request.setAttribute("mensaje", "Datos guardados correctamente");
		}else
			request.setAttribute("mensaje", "Ocurrio un error");
		
		getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
		
		
	}
	
//	private String getFileName(Part part){
//		final String partHeader = part.getHeader("content-disposition");
//		for(String content: part.getHeader("content-disposition").split(";")){
//			if(content.trim().startsWith("filename")){
//				return content.substring(content.indexOf("=")+1).trim().replace("\\", )
//			}
//		}
//		
//		
//	}
	

}
