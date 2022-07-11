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
/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StaffRegister extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	Connection connection=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			connection=Dbconnection.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("mobile");
		String qualification=request.getParameter("qualification");
		
		try {
			ps=connection.prepareStatement("insert into staff values(?,?,?,?,?)");
		    ps.setString(1, name);
		    ps.setString(2, email);
		    ps.setString(3, password);
		    ps.setString(4, mobile);
		    ps.setString(5, qualification);
		    int record=ps.executeUpdate();
		    
		    if(record!=0)
		    	response.sendRedirect("./staff_login.html");
		    else
		    	response.sendRedirect("./staff_register.html");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doGet(request, response);
	}*/

}
