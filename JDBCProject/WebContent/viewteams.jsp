<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao pd=new TeamDao();
List<Team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team_id</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeamname() %></td>
<td><%=t.getOwnername() %></td>
<td><%=t.getCoachname() %></td>
<td><a href="editteam.jsp?teamid=<%=t.getTeam_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>