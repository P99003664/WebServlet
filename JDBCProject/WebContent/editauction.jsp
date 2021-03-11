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
int auction_id=Integer.parseInt(request.getParameter("auction_idid"));
AuctionDao pd=new AuctionDao();
Auction a1=pd.getAuctionById(auction_id);
%>
<form action="./UpdateAuctionServlet" method="post">
Auction Id: <%=a1.getAuction_id() %> <br><br>
Player Id: <input type="text" value="<%=a1.getPlayer_id()%>" name="Player_id"><br><br>
Team Id: <input type="text" value="<%=a1.getTeam_id()%>" name="Team_id"><br><br>
Year: <input type="text" value="<%=a1.getYear()%>" name="Year"><br><br>
Amount: <input type="text" value="<%=a1.getAmount()%>" name="Amount"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>