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
int Age=Integer.parseInt(request.getParameter("Age"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getPlayerByAge(Age);
%>
<form action="./UpdatePlayerServlet" method="post">
Player Name: <input type="text" value="<%=p1.getName()%>" name="Name"><br><br>
Player Id: <%=p1.getAge() %> <br><br>
Player Country: <input type="text" value="<%=p1.getCountry()%>" name="Country"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>