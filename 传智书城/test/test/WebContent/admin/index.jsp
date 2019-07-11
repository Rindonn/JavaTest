<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page language="java" import="service.*" %>
<%@ page language="java" import="object.*" %>
<%@ page language="java" import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户首页</title>
</head>
<body>
<center><table border="1">
<tr>
<td>序号</td>
<td>ID</td>
<td>名称</td>
<td>用户名</td>
<td>密码</td>
<td>操作</td>
</tr>
<% 
	userservice u = new userservice();
	List list = u.findall();
	for(int i=0;i<list.size();i++){
		user us = (user)list.get(i);
%>
<tr>
<td><%=i+1 %></td>
<td><%=us.getid() %></td>
<td><%=us.getname() %></td>
<td><%=us.getusername() %></td>
<td><%=us.getpassword() %></td>
<td><form action ="<c:url value='/userservlet'/>" method="post">
<input type="submit" name="" value="修改"></form>
<form action ="<c:url value='/userservlet'/>" method="post">
<input type="submit" value="删除"></form></td>
</tr>
<%} %>
</table></center>
</body>
</html>