package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePrograms {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="shiny";
		Connection connection=DriverManager.getConnection(url,username,password);

		if(connection!=null)
		{
			System.out.println("connection established");
			
		}
		Statement stat=connection.createStatement();
		//int x=stat.executeUpdate("insert into furniture values('openshelves',1000,'steel','blue',2,'urbanLadder')");
		//int x=stat.executeUpdate("update furniture set warranty=2 where fname='sofa'");
		ResultSet result=stat.executeQuery("select * from furniture");
		System.out.println("-------------------------------------------------------------------------");
		while(result.next()) {
			System.out.println(result.getString(1)+"     "+result.getInt(2)+"      "+result.getString(3)+
					"         "+result.getString(4)+"       "+result.getInt(5)+"       "+result.getString(6));;
		}
		
	}

}

