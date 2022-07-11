package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentLogin extends HttpServlet {
	
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
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		HttpSession hs=request.getSession();
		
		try {
			ps=connection.prepareStatement("select * from student where email=? and password=?");
		
		    ps.setString(1, email);
		    ps.setString(2, password);
		 
		    ResultSet rs=ps.executeQuery();
		    if(rs.next())
		    {
		    	hs.setAttribute("id",rs.getInt(1));
		    	hs.setAttribute("email" , rs.getString("email"));
		    	hs.setAttribute("specialization", rs.getString("specialization"));
		    	
		    	response.sendRedirect("./student_home.html");
		    }
		    else
		    	response.sendRedirect("./student_login.html");
		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}*/

}
