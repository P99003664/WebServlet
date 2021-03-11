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
int teamid=Integer.parseInt(request.getParameter("teamid"));
TeamDao pd=new TeamDao();
Team t1=pd.getTeamById(teamid);
%>
<form action="./UpdateTeamServlet" method="post">
Team Id: <%=t1.getTeam_id() %> <br><br>
Team Name: <input type="text" value="<%=t1.getTeamname()%>" name="Teamname"><br><br>
Owner Name: <input type="text" value="<%=t1.getOwnername()%>" name="ownername"><br><br>
Coach Name: <input type="text" value="<%=t1.getCoachname()%>" name="Coachname"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>