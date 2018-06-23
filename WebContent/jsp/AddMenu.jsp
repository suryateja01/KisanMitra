<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Menu</title>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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





<div class="w3-container w3-orange">
<center>
<div class="w3-panel  w3-card w3-white" style="width:50%">
<center><h3>Add Menu</h3>
<hr >

<div class="w3-panel  w3-card w3-white">

<form action="RestaurantController" method="post">
Menu Name:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="text" name="menuname" /><br><br>

Menu Description:&nbsp; <textarea  name="menudescription"></textarea><br><br>
Menu category: &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
<select name="menucategory">
<option value="Breakfast">Breakfast</option>
<option value="Meals">Meals</option>
<option value="Dinner">Dinner</option>
<option value="Snacks">Snacks</option>
<option value="Lunch">Lunch</option></select><br><br>
Menu type:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input  type="radio" name="type" value="veg"/> &nbsp; Veg &nbsp; &nbsp; &nbsp;<input  type="radio" name="type" value="nonveg"/> &nbsp; Non Veg<br><br>
Menu Cost:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input  type="text" name="menucost"/><br><br>

<input type="hidden" name="action" value="AddMenu" />

<button type="Submit" >Submit</button>&nbsp;&nbsp;&nbsp;<input type="Button"  value="reset"/>


<br><br>
<a href="Index.jsp">Back to Home</a>
<br><br>
</form>
</div>
</center>
</div>
</center>
</div>


<div class="w3-container w3-cyan">
<center><h4>Copyright &copy  2018 TJA 157&nbsp; 1358296 &nbsp; SuryaTeja</h4></center>
</div>




</body>
</html>