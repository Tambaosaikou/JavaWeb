<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String rows = request.getParameter("rows");
int intRows = 9;
try{
	intRows = Integer.parseInt(rows);
}
catch(Exception ex){
	
}
%>
<table border="1">
<%
for(int i=1; i<=intRows;i++){
%>
<tr>
<td><%=i %>*<%=i %>=<%=i*i %>
</td>
</tr>
<%} %>
</table>
</body>
</html>