package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import bean.UsuarioBean;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UsuarioDao extends DAO implements BaseDao<UsuarioBean,Integer>{
	
	public UsuarioBean validarUsuario(String usuario, String clave){

		UsuarioBean usuarioBean = null;
		try{
			con = obtenerConexion();
			stmt = con.prepareStatement("select * from usuario where usuario=? and clave=?");
			stmt.setString(1,usuario);
			stmt.setString(2, clave);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				usuarioBean = new UsuarioBean();
				usuarioBean.setNombres(rs.getString("nombres"));
				usuarioBean.setApellidos(rs.getString("apellidos"));
				usuarioBean.setIdUsuario(rs.getInt("idusuario"));
			}
		}catch(Exception E){
			//Log indicando que ocurrio un error
		}
		return usuarioBean;
	}
	
	public boolean validarAplicacion(int idUsuario, int idServicio){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/pc2";
			Connection con = DriverManager.getConnection(url,"root","root");
			
			PreparedStatement stmt = con.prepareStatement("select * from usuario_servicio where idusuario=? and idservicio=?",
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, idUsuario);
			stmt.setInt(2, idServicio);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				return true;
		}catch(Exception E){
			//Log indicando que ocurrio un error
			return false;
		}
		return false;
	}
	

	//METODOS QUE DEBERÍA TENER EL DAO PERO QUE NO SERAN IMPLEMENTADOS
	
	@Override
	public boolean insertar(UsuarioBean bean) {
		throw new NotImplementedException();
//		return false;
	}

	@Override
	public boolean eliminar(Integer id) {
		throw new NotImplementedException();
//		return false;
	}

	@Override
	public boolean actualizar(UsuarioBean bean) {
		throw new NotImplementedException();
//		return false;
	}
	@Override
	public List<UsuarioBean> listar() {
		throw new NotImplementedException();
//		return false;
	}

	@Override
	public UsuarioBean obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
