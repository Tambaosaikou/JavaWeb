
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//out.println(new java.util.Date().toString());
Date now=new Date();
SimpleDateFormat sf=
new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
out.println(sf.format(now));
%>
<hr/>
<h4>当前时间：<%=sf.format(now) %></h4>

</body>
</html>