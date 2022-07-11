package com.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ApplyLeave extends HttpServlet {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
		String fromdate=request.getParameter("fromdate");
		String todate=request.getParameter("todate");
		int days=Integer.parseInt(request.getParameter("days"));
		
		try {
			ps=connection.prepareStatement("insert into leaveApplication1 (eid,name,email,department,fromdate,todate,days,status) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, department);
			ps.setString(5, fromdate);
			ps.setString(6, todate);
			ps.setInt(7, days);
			ps.setString(8, "pending");
			int x=ps.executeUpdate();
			 HttpSession session=request.getSession();
			 session.setAttribute("eid", eid);
			// session.setAttribute("department", department);
			 session.setAttribute("days", days);
			
			
			if(x>0) {
				
				response.sendRedirect("./leave_status.jsp");
			}
			else
				response.sendRedirect("./apply_leave.html");
			
		} catch (SQLException e) {
	
			e.printStackTrace();
			
		}
	}

}
