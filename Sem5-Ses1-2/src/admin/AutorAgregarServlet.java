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
 * Servlet implementation class AutorAgregarServlet
 */
@WebServlet("/autor_agregar")
public class AutorAgregarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public AutorAgregarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String nacionalidad = request.getParameter("nacionalidad");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			StringBuilder query = new StringBuilder();
			query.append("INSERT INTO Autor(Nombres,Apellidos,Nacionalidad) VALUES(")
				.append("'").append(nombres).append("','").append(apellidos).append("','")
				.append(nacionalidad).append("')");
			int filas = stmt.executeUpdate(query.toString());
			System.out.println(filas);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}

}
