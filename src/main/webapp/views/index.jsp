<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to world of boot mvc jsp</title>
</head>
<body>
<h1>Welcome to world of boot mvc jsp</h1>
	<form action="addAlien" method="post">
	<p><label>Enter your ID: </label> <input type="text" name="aid"></p>
	<p><label>Enter your name: </label> <input type="text" name="aname"></p>
	<input type="submit" name="submit" value="Submit">
	</form>
<hr/>
	<form action="getAlien" method="get">
	<p><label>Enter your ID: </label> <input type="text" name="aid"></p>
	<input type="submit" name="submit" value="Submit">
	</form>

</body>
</html>