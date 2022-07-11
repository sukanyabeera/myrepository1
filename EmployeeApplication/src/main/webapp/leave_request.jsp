<!DOCTYPE html>
<html>

<body bgcolor="lightseagreen">
<h1 align="center"> Welcome to Manager leave update</h1>
<h3 align="center">
<a href="index.html">Home</a>
<a href="leave_request.jsp">Leave Request</a>
<a href="index.html">Logout</a>
<br><br>
</h3>

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
  <td>Used Leaves</td>
  <td>Available leaves</td>
  <td>status</td>
 <%--  <td>No.of days</td>--%>
   <td>Action</td>
</tr>
<%
Connection connection =DbConnection.getconnection();
//String department=(String)session.getAttribute("department");

PreparedStatement ps=connection.prepareStatement("select * from leaveApplication1 where department=?");
String department=(String)session.getAttribute("department");
ps.setString(1,department);

//int days=(Integer)session.getAttribute("days");
//ps.setInt(7, days );
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
<%-- 
<td><%=rs.getInt(7) %></td>

<td><%=rs.getString(8) %></td>--%>
<td><a href="accept.jsp?eid=<%=rs.getInt(1)%>&available_leaves=<%=rs.getInt(9)%>&days=<%=rs.getInt(7)%>">Accept</a>
</tr>
<%}
%>
</table>
</body>
</html>