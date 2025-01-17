package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.AutorBean;

/**
 * Servlet implementation class AutorEditarServlet
 */
@WebServlet("/autor_editar")
public class AutorEditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutorEditarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String codigo = request.getParameter("id"); 
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection con = DriverManager.getConnection(url,"root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from autor where idAutor="+codigo);
			if(rs.next()){
				AutorBean autor = new AutorBean();
				autor.setId(rs.getInt("idAutor"));
				autor.setNombres(rs.getString("nombres"));
				autor.setApellidos(rs.getString("apellidos"));
				autor.setNacionalidad(rs.getString("nacionalidad"));
				
				request.setAttribute("autor", autor);
				getServletContext().getRequestDispatcher("/admin/autor_editar.jsp").forward(request, response);;
			}else{
				request.setAttribute("mensaje", "Autor no encontrado");
				getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String nombres = request.getParameter("nombres");
			String apellidos = request.getParameter("apellidos");
			String nacionalidad = request.getParameter("nacionalidad");
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			String query = "UPDATE autor SET nombres='"+ nombres + 
					"', apellidos='" + apellidos + "', nacionalidad='" + nacionalidad +"' WHERE idAutor="+id;
			int rows = stmt.executeUpdate(query);
			if(rows==1){
				request.setAttribute("mensaje", "Autor con id " + id + " actualizado correctamente.");
				getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);;
			}else{
				request.setAttribute("mensaje", "Ocurri� un error al guardar");
				getServletContext().getRequestDispatcher("/admin/resultado.jsp").forward(request, response);;
			}
		} catch (Exception e) {
			System.out.print("Error: "+e.toString());
		}
	}

}
