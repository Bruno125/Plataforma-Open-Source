package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminarAutorServlet
 */
@WebServlet("/eliminar_autor")
public class EliminarAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EliminarAutorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String id = request.getParameter("id");
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			String query = "DELETE FROM Autor WHERE idAutor = " + id;
			int filas = stmt.executeUpdate(query);
			if(filas==1){
				request.setAttribute("mensaje", "Eliminado correctamente.");
			}else{
				request.setAttribute("mensaje", "Ocurrió un error al eliminar");
			}
			getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);
			
		} catch (Exception e) {
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
