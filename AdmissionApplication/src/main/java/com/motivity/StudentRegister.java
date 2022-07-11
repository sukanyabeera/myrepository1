package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRegister extends HttpServlet {
	
	Connection connection=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			connection=Dbconnection.getconnection();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String specialization=request.getParameter("specialization");
		
		try {
			ps=connection.prepareStatement("insert into student(name,email,password,mobile,specialization) values(?,?,?,?,?)");
		    ps.setString(1, name);
		    ps.setString(2, email);
		    ps.setString(3, password);
		    ps.setString(4, mobile);
		    ps.setString(5, specialization);
		    int record=ps.executeUpdate();
		    
		    	 if(record!=0)
				    	response.sendRedirect("./student_login.html");
				    else
				    	response.sendRedirect("./student_register.html");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}*/

}
