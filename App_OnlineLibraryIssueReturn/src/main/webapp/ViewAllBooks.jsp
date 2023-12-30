<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*, test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"  href="ViewAllBooks.css">
</head>
<body>
	<%
		ArrayList<BookBean> al = (ArrayList<BookBean>)session.getAttribute("arraylist");
		String msg = (String)request.getAttribute("msg");
		Iterator<BookBean> it = al.iterator();
	%>
		<table border="1" cellspacing="0">
		<th colspan="7"><%=msg %></th>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Author</th>
			<th>Qty</th>
		</tr>
<% 
	while(it.hasNext())
	{
		BookBean bb = it.next();
%>
		<tr>
			<td><%=bb.getCode() %></td>
			<td><%=bb.getName() %></td>
			<td><%=bb.getAuthor() %></td>
			<td><%=bb.getQty() %></td>
		</tr>
	<%
	}//end of loop
%>
</table><br>
	<button><a href="AddBook.html">AddBook</a></button>
	<button><a href="IssueBook.html">IssueBook</a></button>
	<button><a href="ReturnBook.html">ReturnBook</a></button>
	<button><a href="logout">Logout</a></button>
</body>
</html>








