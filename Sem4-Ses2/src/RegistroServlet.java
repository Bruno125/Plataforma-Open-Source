

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/Registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params = request.getParameterNames();
		
		PrintWriter pw = response.getWriter();
		while(params.hasMoreElements()){
			String param = params.nextElement();
//			try{
//				String[] values = request.getParameterValues(param);
//				if(values!=null)
//					for(String value : values)
//						printValues(pw, param, value);
//			}catch(Exception e){
//				String value = request.getParameter(param);
//				printValues(pw, param, value);
//			}
			String value = request.getParameter(param);
			printValues(pw, param, value);
		}
		
	}
	
	public static void printValues(PrintWriter pw, String name, String value){
		pw.print("<p>"+name+": "+value+"</p>");
	}
	

}
