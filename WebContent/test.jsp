<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.List,jdbcTest.test"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	 List<test> test=(List<test>)session.getAttribute("test");
	%>
	<table width="100%" border=1>
	<tr>
		<td>id</td>
		<td>name</td>
		<td>address</td>
		<td>date</td>
	</tr>
	<c:forEach items="${test}" var="row">
	<tr>
		<td>${row.id}</td>
		<td>${row.name}</td>
		<td>${row.address}</td>
		<td>${row.date}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>