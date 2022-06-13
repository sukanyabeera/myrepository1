package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="shiny";
		Connection connection=DriverManager.getConnection(password, username, password);
		
		if(connection!=null)
		{
			System.out.println("connection established");
		}

	}

}

