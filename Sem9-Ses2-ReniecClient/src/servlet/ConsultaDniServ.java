package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PersonaReniecStub;
import service.PersonaReniecStub.ConsultarDNI;
import service.PersonaReniecStub.ConsultarDNIResponse;
import service.PersonaReniecStub.PersonaBean;

/**
 * Servlet implementation class ConsultaDniServ
 */
public class ConsultaDniServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaDniServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonaReniecStub prs = new PersonaReniecStub();
		ConsultarDNI consultarDni = new ConsultarDNI();
		consultarDni.setDni("12345678");
		ConsultarDNIResponse cdr = prs.consultarDNI(consultarDni);
		PersonaBean persona = cdr.get_return();
		System.out.println(persona.getId());
		System.out.println(persona.getNombres());
		System.out.println(persona.getApellidos());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
