<%@page import="java.sql.*" %>
<%@page import="com.employee.DbConnection" %>
<%
Connection connection =DbConnection.getconnection();
int eid=Integer.parseInt(request.getParameter("eid"));
int available_leaves =Integer.parseInt(request.getParameter("available_leaves"));
//int used_leaves =Integer.parseInt(request.getParameter("used_leaves"));
int days=Integer.parseInt(request.getParameter("days"));
if(days<available_leaves)
{
	//used_leaves=used_leaves+days;
	available_leaves = available_leaves - days;

	PreparedStatement ps=connection.prepareStatement("update leaveApplication1 set status=?, available_leaves=? where eid=?");
	ps.setString(1,"Accepted");
	ps.setInt(2,available_leaves);
	ps.setInt(3,eid);

	int x=ps.executeUpdate();

	if(x!=0){
		
		response.sendRedirect("./leave_request.jsp");
	}
}

%>
<%-- 
if(days<available_leaves)
{
	//used_leaves=used_leaves+days;
	available_leaves = available_leaves - days;
ps.setInt(2,available_leaves);




else
	response.sendRedirect("./leave_status.jsp");
	

    used_leaves=used_leaves+days;
	available_leaves=available_leaves-used_leaves;
	--%>