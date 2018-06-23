<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.Bean.Menu" import="java.util.*"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>View Menu</title>
</head>
<body>

<div class="w3-container w3-brown">
<br>
 <div class="w3-container" style="width:30%; float :left ">
<img src="G:\OnlineRestaurantManagementSystem\WebContent\images\download.jpg" width=80px height=80px >
<br>
</div>
 <div class="w3-container" style="width:70%; float :right ">
<h1 style="color:white">Online Restaurant Management System</h1>
</div>

</div>

<center>
<div class="w3-container">


<% ArrayList<Menu> menuList=(ArrayList<Menu>)request.getAttribute("MenuList"); %>

<h3> Veg Items</h3>
<table border="1">
<tr><td>Menu Id</td><td>Name</td><td>Category</td><td>Cost</td><td>Status</td></tr>

<%for(Menu menu:menuList)
	{%>
	<% if(menu.getType().equals("veg")){%>
<tr>
<td><%=menu.getMenuId() %></td>
<td><%=menu.getMenuName() %></td>
<td><%=menu.getCategory() %></td>
<td><%=menu.getCost() %></td>
<td><%=menu.getStatus() %>
</tr>

   <% }%> 

<%} %>
</table>
</div>





<h3>Non Veg Items</h3>
<table border="1">
<tr><td>Menu Id</td><td>Name</td><td>Category</td><td>Cost</td><td>Status</td></tr>

<%for(Menu menu:menuList)
	{%>
	<% if(menu.getType().equals("nonveg")){%>
<tr>
<td><%=menu.getMenuId() %></td>
<td><%=menu.getMenuName() %></td>
<td><%=menu.getCategory() %></td>
<td><%=menu.getCost() %></td>
<td><%=menu.getStatus() %>
</tr>

   <% }%> 

<%} %>
</table>
<br><br>
<a href="Index.jsp">Back to Home</a>
<br><br>
</div>
</center>
<div class="w3-container w3-cyan">
<center><h4>Copyright &copy  2018 TJA 157&nbsp; 1358296 &nbsp; SuryaTeja</h4></center>
</div>

</body>
</html>