package com.postgresdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Postgres {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println(" enter 1.insert 2.update 3.select 4.delete");
		 int num=scan.nextInt();

		Connection connection = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         connection = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/Motivity","postgres", "shiny");
	         
	        
			  switch(num)
			  {
			  case 1:
				 PreparedStatement ps=connection.prepareStatement("insert into furniture values(?,?,?,?,?,?)");
			     System.out.println("enter name of the furniture you want to Buy");
				 String fname=scan.next();
				// System.out.println("enter maximum price");
				 //int price=scan.nextInt();
				 System.out.println("enter Furniture material");
				 String material=scan.next();
				 System.out.println("enter color of the furniture");
				 String color=scan.next();
				// System.out.println("warranty");
				// int warranty=scan.nextInt();
				 System.out.println("Enter the brand you like");
				 String brand=scan.next();
				 System.out.println("ThankYou!");
				ps.setString(1,fname);
				ps.setInt(2, 2000);
				ps.setString(3,material);
				ps.setString(4,color);
				ps.setInt(5,3);
				ps.setString(6,brand);
				int x=ps.executeUpdate();
				if(x!=0) 
				{
					System.out.println(" record inserted");
				}
				break;
			  case 2:
				  PreparedStatement p=connection.prepareStatement("update furniture set warranty=? where fname=?");
					p.setInt(1,2);
					p.setString(2,"canopy");
					int y=p.executeUpdate();
					if(y!=0) {
						System.out.println(" preparedStatement record updated");
						System.out.println("----------------------------------------------");
				         }
					break;
			  case 3:
				/* PreparedStatement prepare=connection.prepareStatement("select * from furniture where fname in(?,?,?)");
					prepare.setString(1,"divan");
					prepare.setString(2,"sofa");
					prepare.setString(3,"canopy");
					ResultSet result=prepare.executeQuery();
					
					while(result.next()) {
						System.out.println(result.getString(1)+"     "+result.getInt(2)+"      "+result.getString(3)+
								"         "+result.getString(4)+"       "+result.getInt(5)+"       "+result.getString(6));
					}*/
				  PreparedStatement prepare=connection.prepareStatement("select * from furniture");
				  ResultSet result=prepare.executeQuery();
					
					while(result.next()) {
						System.out.println(result.getString(1)+"     "+result.getInt(2)+"      "+result.getString(3)+
								"         "+result.getString(4)+"       "+result.getInt(5)+"       "+result.getString(6));
					}
	               break;
			  case 4:
				  PreparedStatement p1=connection.prepareStatement("delete from furniture  where fname=?");
			
					p1.setString(1, "matrices");
					int y1=p1.executeUpdate();
					if(y1!=0) {
						System.out.println(" preparedStatement record deleted");
		}
			  }
			  } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
	

}
