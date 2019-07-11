<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body>
	<form action="<c:url value='/loginservlet'/>" method="post">
		<center>
			<h1>登录界面</h1>
		</center>
		<center>
			<span style="display: inline">Username:</span><span><input
				type="text" id="username" name="username" placeholder="请输入用户名"></span>
		</center>
		<br>
		<center>
			<span style="display: inline">Password:</span><span><input
				type="password" id="password" name="password" placeholder="请输入密码"></span>
		</center>
		<br>
		<center>
			<button type="submit">进入后台</button>
		</center>
	</form>
</body>
</html>