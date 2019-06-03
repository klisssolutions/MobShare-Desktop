package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection con;
	String url;
	
	
	public Connection getConexao(){
		con = null;
		
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			String url = "jdbc:mysql://192.168.1.1:3306/dbmob?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
			//String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
//			con =  DriverManager.getConnection(url, "root", "bcd127");
			con =  DriverManager.getConnection(url, "mob", "kliss123");
			System.out.print("Conectado");
		}catch(Exception e){
			System.out.println("Houve um erro na conexao com o banco");
			e.printStackTrace();
		}
		
		return con;
		
	}

}
