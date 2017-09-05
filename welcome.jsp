
<%@page import="java.text.SimpleDateFormat"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--Declaration level, class level  -->
<%!int count = 0;

	int Counter() {
		count++;
		return count;
	}%>
	<%
	java.util.Calendar calendar = new java.util.GregorianCalendar();
    java.util.Date date = calendar.getTime();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd-MM-yyyy");
    String dateval = format.format(date);
    int hour = calendar.get(calendar.HOUR_OF_DAY);
    if (hour<12) {
		out.print("Good Morning");
	}

	else{
		out.print("Good Evening");
	}

    %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--expression level-->
	<h1> Z Bank - Your Perfect Bank</h1>
	<h2> <%=dateval %></h2>
	<h3>Thanks for your great support</h3>
	<h4> You are our valuable visitor number <%=Counter() %></h4>
</body>
</html>