package util;

import dao.UsuarioDao;

public class MyUtils {
	
	public static int ID_SERVICIO = 2;
	
	public static UsuarioDao getUsuarioDao(){
		return new UsuarioDao();
	}
	
}
