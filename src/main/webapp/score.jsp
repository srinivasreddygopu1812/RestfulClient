<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}

p    {word-spacing: 30px;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<font color="red"><h3><u>Score:</u></h3></font></br>
<b>${score.country } </b>  ${score.runs }/${score.wickets }(${score.overs })</br>
On Strike:${score.bat1 }</br>
Non Strike:${score.bat2 }

</body>
</html>