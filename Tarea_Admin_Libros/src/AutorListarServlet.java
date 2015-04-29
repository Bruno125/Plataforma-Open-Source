

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AutorBean;

/**
 * Servlet implementation class AutorEditarServlet
 */
@WebServlet("/autor_listar")
public class AutorListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutorListarServlet() {
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

			ResultSet rs = stmt.executeQuery("SELECT * FROM autor");
			
			List<AutorBean> autores = new List<AutorBean>();
			AutorBean autor = null;
			while(rs.next()){
				autor = new AutorBean();
				autor.setId(rs.getInt("id"));
				autor.setNombres(rs.getString("nombres"));
				autor.setApellidos(rs.getString("apellidos"));
				autores.add(autor);
			}
			request.setAttribute("listaAutores", autores);
			
			getServletContext().getRequestDispatcher("/admin/autor_listar.jsp").forward(request, response);
		} catch (Exception e) {	
			System.out.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
