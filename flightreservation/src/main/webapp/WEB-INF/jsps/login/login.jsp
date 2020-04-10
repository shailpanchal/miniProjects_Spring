<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

<form action="login" method="post">
<pre>
<h2>Login: </h2>
User name: <Input type="text" name="email"/>
Password: <input type="password" name="password"/>
<input type="submit" value="login"/>
${msg}
</pre>
</form>

</body>
</html>