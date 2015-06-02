package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.CalculadoraStub;

/**
 * Servlet implementation class CalculadoraServ
 */
@WebServlet("/calculadora")
public class CalculadoraServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServ() {
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


String opcion=request.getParameter("opcion");
		double valor1 = Double.parseDouble( request.getParameter("valor1"));
		double valor2 = Double.parseDouble( request.getParameter("valor2"));
		double result=0;
		CalculadoraStub calculadora = new CalculadoraStub();
		if(opcion.equals("suma")){
			CalculadoraStub.Sumar suma = new CalculadoraStub.Sumar();
			suma.setA(valor1);
			suma.setB(valor2);
			result= calculadora.sumar(suma).get_return();
		}else if(opcion.equals("resta")){
			CalculadoraStub.Restar restar = new CalculadoraStub.Restar();
			restar.setA(valor1);
			restar.setB(valor2);
			result= calculadora.restar(restar).get_return();
		}else if(opcion.equals("multiplicacion")){
			CalculadoraStub.Multiplicar mult = new CalculadoraStub.Multiplicar();
			mult.setA(valor1);
			mult.setB(valor2);
			result= calculadora.multiplicar(mult).get_return();
		}else if(opcion.equals("division")){
			CalculadoraStub.Dividir dividir = new CalculadoraStub.Dividir();
			dividir.setA(valor1);
			dividir.setB(valor2);
			result= calculadora.dividir(dividir).get_return();
		}
//		request.setAttribute("mensaje", "El resultado es " + result);
//		getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
		
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();
		out.print(result);
	}

}
