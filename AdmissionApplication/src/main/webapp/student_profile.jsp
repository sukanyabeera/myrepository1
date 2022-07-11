<!DOCTYPE html>
<html>
<body bgcolor="vedana">
<br><br><br>
<h1 align="center"> welcome to Student Home</h1>
<br><br><br>
<h2 align="center"><a href="student_home.html">Home</a>
<a href="student_profile.jsp">profile</a>
<a href="student_admission.jsp">Admission details</a>
<a href="index.html">Logout</a>
</h2>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.motivity.Dbconnection" %>
<table border="2" width="400" height="200" cellpadding align="center" >
<tr> <td>Id</td><td>Name</td><td>Email</td><td>Mobile no</td><<td>Specialisation</td></tr>
<%
Connection connection =Dbconnection.getconnection();
int id=(Integer)session.getAttribute("id");

PreparedStatement ps=connection.prepareStatement("select * from student where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1)%></td><td><%=rs.getString(2) %></td>
<td><%=rs.getString(3)%></td><td><%=rs.getString(5) %></td>
</td><td><%=rs.getString(6) %></td></tr>
<%}
%>
</table>
</body>
</html>