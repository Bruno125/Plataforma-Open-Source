package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.AutorBean;

/**
 * Servlet implementation class ListarAutorServlet
 */
@WebServlet("/autor_listar")
public class ListarAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListarAutorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT idAutor,nombres, apellidos from autor");
			List<AutorBean> autores = new ArrayList<AutorBean>();
			while(rs.next()){
				AutorBean nuevo = new AutorBean();
				nuevo.setNombres(rs.getString("nombres"));
				nuevo.setApellidos(rs.getString("apellidos"));
				nuevo.setId(rs.getInt("idAutor"));
				autores.add(nuevo);
			}
			request.setAttribute("data", autores);
			getServletContext().getRequestDispatcher("/admin/listado_autores.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.print("Error: "+e.toString());
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
