<!DOCTYPE html>
<html>
<body bgcolor="vedana">
<br><br><br>
<h1 align="center"> welcome to Student Home</h1>
<br><br><br>
<h2 align="center"><a href="staff_home.html">Home</a>
<a href="staff_profile.jsp">profile</a>
<a href="staff_admission.jsp">Admission details</a>
<a href="index.html">Logout</a>
</h2>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.motivity.Dbconnection" %>
<table border="2" width="400" height="200" cellpadding align="center" >
<tr>
  <td>Name</td>
  <td>Email</td>
  <td>Mobile no</td>
  <td>qualification</td>
</tr>
<%
Connection connection =Dbconnection.getconnection();
String name=(String)session.getAttribute("name");

PreparedStatement ps=connection.prepareStatement("select * from staff where name=?");
ps.setString(1,name);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5) %></td>
</tr>
<%}
%>
</table>
</body>
</html>