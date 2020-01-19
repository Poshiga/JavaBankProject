<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
<form action="http://localhost:9081/MiniProject/GetLogin">
<table>
<tr>
<td><label>Username:</label></td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td><label>Password:</label></td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" value="login"/></td>
</tr>
</table>
</form>
</body>
</html>