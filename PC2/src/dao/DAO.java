package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	protected Connection con;
	protected PreparedStatement stmt;
	
	protected Connection obtenerConexion(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/pc2";
			con = DriverManager.getConnection(url,"root","root");
		}catch(Exception e){
			//Log indicando el mensaje de error..l
		}
		return con;
	}
	
	
}
