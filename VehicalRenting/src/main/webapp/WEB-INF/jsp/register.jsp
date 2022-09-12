<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib
	uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs"
	prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="http://localhost:8089/images/cab.css">
<link rel="stylesheet" href="car1.css">
<style>
 h1 {color:rgb(18, 102, 18); font-size: 400%; text-align: start;}
    #loginBlock{
        background-color: #f7f8c4;
        margin: 100px;
        display: inline-block;
        color: black;
        font-size: 20px;
        border-radius: 40px;
        border: 2px solid black;
        padding: 10px 40px;
        bottom: 60px;
        position: relative;
        left: 750px;
        font-family: 'Gill Sans', 'Gill Sans MT','Trebuchet MS', sans-serif;
    }
input {
	height: 20px;
	border-radius: 10px;
	border: 0px;
	padding: 5px 15px;
	margin: 10px 0px;
	font-family: 'Gill Sans', 'Gill Sans MT', 'Trebuchet MS', sans-serif;
}
#login{
        background-color: #0b4210;
        border: 2px solid #ccc;
        color: white;
        font-size: 20px;
        text-align: center;
        height: 35px;
        padding: 0px 20px;
        margin: 30px 0px;
        position: relative;
        left: 150px;
    }

header {
	background-color: #f5eded;
	height: 100px;
	display: block;
	border-bottom: 10px solid #0b4210;
} 

#car{
    position: absolute;
    left: 70px;
    top: 200px;
}
#login:hover{
        background-color: #0b4210;
        border: 1px solid rgb(100, 100, 100);
    }
#type {
	position: relative;
	right: 10px;
	background-color: black;
	color: white;
	border: 1px solid white;
	border-radius: 8px;
	padding: 5px;
	font-size: 15px;
	margin: 10px;
}
.message{
        color: #ff1818;
        font-size: 15px;
    }
</style>
</head>
<body>
	<header>
		<h1>BookMyCar</h1>
	</header>
	<div id="loginBlock">
        <span class="message">${message}</span><br>
		<form action="/saveCustomer" method="post">
			<label for="username">Enter Your Full Name: &nbsp;</label> <input
				type="text" name="username" id="" placeholder="Username"><br>
			<label for="address">Enter your Address: &nbsp;</label> <input
				type="text" name="address" id="" placeholder="Address"><br>
                <label for="pan">Enter your PAN No: &nbsp;</label> <input
				type="text" name="pan" id="" placeholder="PAN Number"><br>
			<label for="mobileNumber">Enter your mobile number: &nbsp;</label> <input
				type="text" name="mobileNumber" id="" placeholder="MobileNumber"><br>
			<label for="email">Enter your Email: &nbsp;</label> <input
				type="email" name="email" id="" placeholder="Email"><br>
			<label for="password">Enter a Password: &nbsp;</label> <input
				type="password" name="password1" id="" placeholder="Password"><br>
			<label for="password">Confirm Password: &nbsp;</label> <input
				type="password" name="password2" id="" placeholder="Password"><br>
			<input type="submit" id="login" value="Register">

		</form>
	</div>
    <img src="/images/car1.jpg" width="700" height="400" id="car" >
	<footer></footer>
</body>
</html>