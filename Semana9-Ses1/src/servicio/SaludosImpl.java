package servicio;

import javax.jws.WebService;

@WebService(endpointInterface="servicio.Saludo")
public class SaludosImpl implements Saludo{

	@Override
	public String saludo() {
		return "Saludo desde el servicio web";
	}

	@Override
	public String saludoNombre(String nombre) {
		return "Hola " + nombre+ "! Saludos desde el servicio web";
	}

}
