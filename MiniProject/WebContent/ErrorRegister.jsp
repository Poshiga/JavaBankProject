<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>ErrorRegister</title>
</head>
<body>
<h1>Confirmpassword and Password Not Matching!! </h1><br>
<h1>Try Again!</h1>
<form action="http://localhost:9081/MiniProject/GetRegister">
<table>
<tr>
<td><label>Name:</label></td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td><label>Username:</label></td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td><label>Password:</label></td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td><label>ConfirmPassword:</label></td>
<td><input type="password" name="confirmpassword"></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
</table>
</form>
</body>
</html>