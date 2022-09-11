<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome - ${userName}</title>
<link rel="stylesheet" href="http://localhost:8085/images/cab.css">
<style>
        .form-group label {width: 200px;}
        .form-horizontal {width: 50%; margin: 20px auto; text-align: center; border: 1px solid #ccc; border-radius: 30px; padding: 20px 0;}
        .form-group .form-control {width: auto; display: inline-block;}
        p {color:red; font-size:200%;}
        h1 {color:rgb(18, 102, 18); font-size: 400%; text-align: start;}
        h2 {color:white;}
        label {color:orange;}
        body {text-align: center; }
        .press {
	background-color: rgb(18, 102, 18);
	border: 2px solid white;
	border-radius: 10px;
	padding: 10px 20px;
	font-size: 20px;
	text-decoration: none;
	color: white;
	margin: 10px;
}

header {
	background-color: #f5eded;
	height: 100px;
	display: block;
	border-bottom: 10px solid #0b4210;
}


#buttonContainer {
	position: absolute;
	right: 50px;
	top: 40px;
   
}
#car{
    position: absolute;
    left: 70px;
    top: 150px;
}
    </style>
</head>
<body>
	<header>
		<h1><header><b>BookMyCar</b></header></h1><br>
        <img src="/images/car1.jpg" width="750" height="400" id="car" ><br><br>
		<a href="/logout" id="logout">Logout</a>
	</header>
	<div >
		<form action="/customerLog" method="post">
			<label for="location">Location:</label> <select id="location"
				class="press" name="location">
				<c:forEach items="${locationList}" var="location">
					<option value="${location.getCity()}">${location.getCity()}</option>
				</c:forEach>
			
			</select><br>
			
			<br> <label for="type">Vehicle Brand : </label> <select id="type"
				name="carType">
				<option value="All">All</option>
				<option value="Sedan">Sedan</option>
				<option value="Mini">Mini</option>
				<option value="Share">Share</option>
				<option value="InterCity">InterCity</option>
				<option value="Prime">Prime</option>
			</select>
			<button type="submit" id="confirm">Next</button>
		</form>
	</div>
	<footer></footer>
</body>
</html>