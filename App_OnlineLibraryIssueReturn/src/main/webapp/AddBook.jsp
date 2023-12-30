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
		BookBean bb = (BookBean)request.getAttribute("bookbean");
		String msg = (String)request.getAttribute("msg");
		out.println(msg);
		out.println("Book Code : " + bb.getCode() + "<br>" );
	%>
	<button><a href="AddBook.html">AddBook</a></button>
	<button><a href="viewallbooks">ViewAllBooks</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>