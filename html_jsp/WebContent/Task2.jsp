<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
<p>
<% out.print("125 - 15 = "); %>
<%= substraction(125, 15) %>
</p>

<p>
<% out.print("17 - 21 = "); %>
<%= substraction(17, 21) %>
</p>

<%! int substraction(int number1, int number2){
	return number1 - number2;
}%>
</body>
</html>