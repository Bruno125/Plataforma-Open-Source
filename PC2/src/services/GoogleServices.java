package services;

import util.MyUtils;
import bean.UsuarioBean;

public class GoogleServices {
	
	public UsuarioBean login(String usuario, String clave){
		return MyUtils.getUsuarioDao().validarUsuario(usuario, clave);
	}
	
	public boolean validarAplicacion(int idUsuario, int idServicio){
		return MyUtils.getUsuarioDao().validarAplicacion(idUsuario, idServicio);
	}
	
}
