<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>

<form action="registerUser" method="post">
<pre>
<h2> User registration: </h2>
First name: <input type="text" name="firstName"/>
Last Name: <input type="text" name="lastName"/>
User name: <input type="text" name="email"/> 
Password: <input type="password" name="password"/>
<input type="submit" value="register">
</pre>
</form>


</body>
</html>