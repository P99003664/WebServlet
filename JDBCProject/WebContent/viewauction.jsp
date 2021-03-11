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
AuctionDao pd=new AuctionDao();
List<Auction> li=pd.getAllAuction();
%>
<table>
<tr>
<th>Auction Number</th>
<th>Player Number</th>
<th>Team Number</th>
<th>Year</th>
<th>Amount</th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%=a.getAuction_id() %></td>
<td><%=a.getPlayer_id() %></td>
<td><%=a.getTeam_id() %></td>
<td><%=a.getYear() %></td>
<td><%=a.getAmount() %></td>
<td><a href="editauction.jsp?auction_id=<%=a.getAuction_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>