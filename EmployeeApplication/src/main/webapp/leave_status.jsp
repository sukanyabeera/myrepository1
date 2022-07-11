
<!DOCTYPE html>
<html>
<head>
</head>
<body bgcolor="lightseagreen">
<h1> Leave status</h1>
<h2 align="center">
<a href="employee_home.html">Home</a>&nbsp;&nbsp;
<a href="leave_status.jsp">Leave status</a>&nbsp;
<!-- <a href="apply_leave.html">Apply leave</a> -->
<a href="index.html">Logout</a>
</h2>
</body>

<%@page import="java.sql.*" %>
<%@page import="com.employee.DbConnection" %>
<table border="2" width="1000" height="200" cellpadding align="center" >
<tr>
  <td>Employee id</td>
  <td>Name</td>
  <td>Email</td>
  <td>Department</td>
  <td>From date</td>
  <td>To date</td>
  <td>No.of leaves</td>
  <td>used leaves</td>
  <td>Available leaves</td>
   <td>Status</td>
</tr>

<%-- int eid=Integer.parseInt(request.getParameter("eid"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String department=request.getParameter("department");
String fromdate=request.getParameter("fromdate");
String todate=request.getParameter("todate");
int days=Integer.parseInt(request.getParameter("days"));
String status=request.getParameter("status");--%>
<%
Connection connection =DbConnection.getconnection();
PreparedStatement ps=connection.prepareStatement("select * from leaveApplication1 where eid=?");
int eid=(Integer)session.getAttribute("eid");
ps.setInt(1,eid);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getInt(7) %></td>
<td><%=rs.getInt(8) %></td>
<td><%=rs.getInt(9) %></td>
<td><%=rs.getString(10) %></td> 
</tr>
<%}
%>
</table>
</html>