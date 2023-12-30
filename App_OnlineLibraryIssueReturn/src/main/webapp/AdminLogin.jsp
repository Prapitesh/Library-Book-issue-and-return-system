<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		AdminLoginBean alb = (AdminLoginBean)session.getAttribute("adminloginbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Welcome Admin : "+ alb.getuName() + "<br><br>");
	%>
	<button><a href="AddBook.html">AddBook</a></button>
	<button><a href="viewallbooks">ViewAllBooks</a></button> <br><br>
	<button><a href="IssueBook.html">IssueBook</a></button>
	<button><a href="ReturnBook.html">ReturnBook</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>