<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib
	uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs"
	prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!-- <link rel="stylesheet" href="http://localhost:8085/images/cab.css"> -->
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
        padding: 10px 50px;
        bottom: 60px;
        position: relative;
        left: 800px;
        font-family: 'Gill Sans', 'Gill Sans MT','Trebuchet MS', sans-serif;
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
    top: 150px;
}
    input{
        height: 20px;
        border-radius: 5px;
        border: 2px;
        padding: 5px 15px;
        margin: 10px 0px;
        font-family: 'Gill Sans', 'Gill Sans MT','Trebuchet MS', sans-serif;
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
        left: 100px;
    }
    #login:hover{
        background-color: #0b4210;
        border: 1px solid rgb(100, 100, 100);
    }
    #type{
        position: relative;
        right: 10px;
        background-color: #0b4210;
        color: white;
        border: 1px solid #ccc;
        border-radius: 8px;
        padding: 5px;
        font-size: 15px;
        margin: 10px;
    }
    .message{
        color: #ff1818;
        font-size: 15px;
    }
    .register{
        color: #0b4210;
        font-size: 15px;
        display: inline-block;
        width: 260px;
        text-align: center;
        text-decoration: none;
    }
    .register:hover{
        text-decoration: underline;
    }
</style>
</head>
<body>
<header><h1>BookMyCar</h1></header>
<div id="loginBlock"><form action="/sign" method="post">
    <span class="message">${message}</span><br>
    <select name="type" id="type">
        <option value="A">Admin</option>
        <option value="C">Customer</option>
    </select><br>
    <label for="userName">Username: &nbsp;</label>
    <input type="text" name="userName" id="" placeholder="Username"><br>
    <label for="password">Password: &nbsp;</label>
    <input type="password" name="password" id="" placeholder="Password"><br>
    <input type="submit" id="login" value="Login"><br>
    <a href="/registerCustomer" class="register">New here? Please Register</a>
</form></div>
<img src="/images/car1.jpg" width="700" height="400" id="car" >
<footer></footer>
</body>
</html>