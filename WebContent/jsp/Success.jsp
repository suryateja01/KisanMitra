<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.Bean.Menu"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<% 
String id=(String)request.getAttribute("MenuId");%>
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


<div class="w3-container w3-orange">
<center>
<div class="w3-panel  w3-card w3-white" style="width:50%">
<br>
<br>
<br>
<br>
<br>
<h3 style="color:green">Menu has been  added Successfully and  menu Id is</h3> <%= id %>
<br>
<br>
<br>
<a href="Index.jsp">Back to Home</a>
<br><br>
<br>
</div>
</center>
</div>


<div class="w3-container w3-cyan">
<center><h4>Copyright &copy  2018 TJA 157&nbsp; 1358296 &nbsp; SuryaTeja</h4></center>
</div>





</body>
</html>