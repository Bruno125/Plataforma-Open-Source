

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.CalculadoraStub;
import servicios.CalculadoraStub.Restar;
import servicios.CalculadoraStub.Suma;

/**
 * Servlet implementation class UsarCalculadora
 */
public class UsarCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsarCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CalculadoraStub stub = new CalculadoraStub();
		Suma suma = new Suma();
		suma.setA(12.5);
		suma.setB(34.4);

		Restar restar = new Restar();
		restar.setA(12.5);
		restar.setB(34.4);
		
		stub.suma(suma);
		PrintWriter out = response.getWriter();
		out.print(stub.suma(suma).get_return());
		out.print("<br>");
		out.print(stub.restar(restar).get_return());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
