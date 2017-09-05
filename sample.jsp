<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--Declaration level, class level  -->
<%!int count = 0;

	int Counter() {
		count++;
		return count;
	}%>
	
	<%--Scriplet level, local level --%>
<%
	int localVar = 20;
    localVar ++;
%>




<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>


<body>

<!--expression level-->
	<h1> sample page</h1>
	<h2> This page is viewed <%=Counter() %>times</h2>
	<p> The variable value is <%=localVar %></p>

</body>
</html>