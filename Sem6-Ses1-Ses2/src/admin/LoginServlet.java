package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.MD5;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private static final String COOKIE_USER = "user";
	private static final String COOKIE_CLAVE = "pass";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		
		try{

			
			String usuario = request.getParameter("usuario");
			String clave = request.getParameter("clave");
			if(!usuario.matches("[a-zA-Z]+") || !clave.matches("[A-Za-z0-9]+")){
				request.setAttribute("mensaje", "Datos inválidos");
				getServletContext().getRequestDispatcher("/admin/login.jsp").forward(request, response);
				return;
			}
			
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/libreria";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			
			String query = "SELECT * from administrador where usuario='" + usuario + "' and clave='"+MD5.crypt(clave)+"'";
			
			ResultSet row = stmt.executeQuery(query);
			
			if(row.next()){
				HttpSession session = request.getSession();
				session.setAttribute("nombre", row.getString("nombre"));
				session.setAttribute("apellido", row.getString("apellido"));
				
				boolean recordar = request.getParameter("recordar") !=null;
				if(recordar){
					Cookie cUser = new Cookie("usuario", usuario);
					Cookie cPass = new Cookie("clave", clave);
					
					response.addCookie(cUser);
					response.addCookie(cPass);
					
				}
				
				getServletContext().getRequestDispatcher("/admin/principal.jsp").forward(request, response);
				
			}else{
				request.setAttribute("mensaje", "Datos incorrectos");
				getServletContext().getRequestDispatcher("/admin/login.jsp").forward(request, response);
				
			}
			
			
		}catch(Exception e){
			
		}
		
	}

}
