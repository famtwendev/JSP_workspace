<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: red">
<%
	String username = (String)session.getAttribute("username");
%>

	Xin chào: <%=username%> <br/>
	<hr/>
	<h1>Đây là trang 1</h1>
	<a href="trang2.jsp">Trang 2</a>
</body>
</html>