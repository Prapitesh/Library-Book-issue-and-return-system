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
		BookBean bb = (BookBean)session.getAttribute("bookbean");
		out.println("***BookDetails***<br>");
		out.println("Code : "+bb.getCode() + "<br>");
		out.println("Name : "+bb.getName() + "<br>");
		out.println("Author : "+bb.getAuthor() + "<br>");
		out.println("Qty : "+bb.getQty() + "<br>");
	%>
	<form method="post"  action="return">
		<input type="hidden"  name="code"  value=<%=bb.getCode() %>>
		Enter RollNum: <input type="text"  name="rollno" ><br>
		<input type="submit"  value="Return">
	</form>
</body>
</html>