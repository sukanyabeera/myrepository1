package com.employee;

import java.io.IOException;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.DbConnection;


public class ManagerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			connection=DbConnection.getconnection();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {
				
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		try {
			ps=connection.prepareStatement("select * from manager where email=? and password=?");
		
		    ps.setString(1, email);
		    ps.setString(2, password);
		    
		   ResultSet rs=ps.executeQuery();
   
		  if(rs.next()) {
			  
		  
			  session.setAttribute("department", rs.getString("department"));
			  
			   response.sendRedirect("./manager_home.html");
		  }
		   else
			   response.sendRedirect("./manager_login.html");
		   
		   
		   
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
