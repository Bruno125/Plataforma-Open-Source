
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.GeneroBean;
import beans.EditorialBean;
/**
 * Servlet implementation class AgregarLibroServlet
 */
@WebServlet("/libro_agregar")
public class AgregarLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarLibroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM genero");
	
			List<GeneroBean> generos = new List<GeneroBean>();
			
			GeneroBean genero = null;
			while(rs.next()){
				genero = new GeneroBean();
				genero.setId(rs.getInt("idgenero"));
				genero.setNombres(rs.getString("nombres"));
				genero.setDescripcion(rs.getString("descripcion"));
				generos.add(genero);
			}
			
			ResultSet rss = stmt.executeQuery("SELECT * FROM editorial");
			List<EditorialBean> editorials = new List<EditorialBean>();
			EditorialBean editorial = null;
			while(rss.next()){
				editorial = new EditorialBean();
				editorial.setId(rss.getInt("ideditorial"));
				editorial.setNombres(rss.getString("nombres"));				
				editorials.add(editorial);
	
			}
			request.setAttribute("listaEditorial", editorials);
			request.setAttribute("listaGenero", generos);

			getServletContext().getRequestDispatcher("/admin/libro_agregar.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String titulo = request.getParameter("titulos");
			String isbn = request.getParameter("ISBN");
			String sinopsis = request.getParameter("sinopsis");
			String[] genero = request.getParameterValues("genero");
			String[] editorial = request.getParameterValues("editorial");

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			
			int rows = stmt.executeUpdate("INSERT INTO libro(titulo, isbn,sinopsis,genero,editorial) "
					+ " values ('"+titulo+"', '"+isbn+"', '"+sinopsis+"')"+genero[0]+"', '"+editorial[0]+"', '");
			
			if(rows == 1){
				request.setAttribute("mensaje", "Datos actualizados");
			}else{
				request.setAttribute("mensaje", "Ocurrió un error");
			}
			
			getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
