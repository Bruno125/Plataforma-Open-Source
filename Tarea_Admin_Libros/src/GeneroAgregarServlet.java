

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
 * Servlet implementation class GeneroAgregarServlet
 */
@WebServlet("/genero_agregar")
public class GeneroAgregarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneroAgregarServlet() {
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
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();


			String nombre = request.getParameter("nombre");
			String descripcion = request.getParameter("descripcion");

			int rows = stmt.executeUpdate("INSERT INTO genero(nombre, descripcion) "
					+ " VALUES('"+nombre+"', '"+descripcion+"')");
			if(rows == 1){
				request.setAttribute("mensaje", "Datos guardados correctamente");
			}else{
				request.setAttribute("mensaje", "Ocurrió un error");
			}
			getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);
			
		}catch(Exception E){
			System.out.print(E.getMessage());
		}
	}

}
