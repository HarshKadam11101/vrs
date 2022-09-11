<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
         <link rel="stylesheet" href="http://localhost:8083/images/car1.css">
    </head>
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
    <body>
        
        <h1><header><b>BookMyCar</b></header></h1><br>
        <img src="/images/car1.jpg" width="750" height="400" id="car" ><br><br>
        <div id="buttonContainer"><br><br>
			<a class="press" href="/login">Login</a> <a class="press"
				href="/register">Register </a> <a class="press"
				href="/searchCar">Search car</a>
		</div>
	</header>