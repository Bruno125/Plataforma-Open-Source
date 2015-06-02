
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.PersonaBean;

public class PersonaReniec {

	
	public PersonaBean consultarDNI(String dni){
		PersonaBean persona = new PersonaBean();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/reniec";
			Connection conexion = DriverManager.getConnection(url,"root","root");
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery("select id,nombres,apellidos from persona where dni="+dni);
			if(rs.next()){
				persona.setId(rs.getInt("id"));
				persona.setNombres(rs.getString("nombres"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setDni(dni);
			}
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		return persona;
	}
	
}
