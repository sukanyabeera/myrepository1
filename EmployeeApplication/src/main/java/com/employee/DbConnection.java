package com.employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getconnection() throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="shiny";
		 
			Connection connection=DriverManager.getConnection(url,username,password);
		
		return connection;
	}
}
