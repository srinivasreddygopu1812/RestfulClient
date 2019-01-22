<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${message}</font>
<form action="teamRegistration" method="post">
Team Name:<input type="text" name="teamName"  /></br>
Total Matches:<input type="text" name="totalMatches"  /></br>
Number of wins:<input type="text" name="wins"  /></br>
Number of losses:<input type="text" name="losses"  /></br>
<input type="submit" value="Register Team">
</form>

<form action="getScore">
<input type="submit" value="Get Score">
</form>
</body>
</html>