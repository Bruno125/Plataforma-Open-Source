package servicio;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Saludo {
	@WebMethod
	public String saludo();
	@WebMethod
	public String saludoNombre(String nombre);
}
