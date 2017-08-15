package br.edu.facear.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;



import br.edu.facear.util.ConnectDB;

public class GenericDAO {
	private ConnectDB db = new ConnectDB();
	protected Connection connect;
	
	public void openConnection () throws ClassNotFoundException, IOException, SQLException{
		connect = db.getConnection();
	}

	public void closeConnection(){
		if(connect != null) {
			try {
				connect.close();
			}catch (SQLException e) {
				System.out.println("Error on Closing Connection");
			}
		}
	}
}
