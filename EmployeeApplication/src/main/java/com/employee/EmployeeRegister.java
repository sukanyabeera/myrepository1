package com.employee;

import java.io.IOException;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.DbConnection;


public class EmployeeRegister extends HttpServlet {
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
				
		int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String department=request.getParameter("department");
		
		try {
			ps=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, eid);
		    ps.setString(2, name);
		    ps.setString(3, email);
		    ps.setString(4, password);
		    ps.setString(5, department);
		    int record=ps.executeUpdate();
		    if(record!=0)
				response.sendRedirect("./employee_login.html");
		    else
		    	response.sendRedirect("./employee_register.html");
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
