<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		<form action="./servlet/LoginServlet" method="post">
		<input type="text" name="username" /><br/>
		<input type="password" name="passward" /><br/>
		<input type="hidden" name="hidden" value="隐藏" />
		<input type="submit" value="submit"/>
		</form>	


</body>
</html>