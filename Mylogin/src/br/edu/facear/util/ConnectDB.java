package br.edu.facear.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection con;
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public ConnectDB() {
		//melhoria futura: colocar essas informações em arquivo
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/my_login";
		username = "root";
		password = "";
	}
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException{
		Class.forName(driver);
		this.con  = DriverManager.getConnection(url, username, password);
		
		return this.con;
	}

}
