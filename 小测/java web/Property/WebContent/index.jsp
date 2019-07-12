<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="service.*" %>
<%@ page language="java" import="po.*" %>
<%@ page language="java" import="java.util.List" %>
<%@ page language="java" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>业主查询</title>
</head>
<body>
<form action="<c:url value='/selservlet'/>" method="get">
<input type="text" id="value" name="value"><button type="submit">搜索</button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="insert.jsp">添加业主</a>
</form>
<br>
<table border="1">
<tr>
<td>ID</td>
<td>业主姓名</td>
<td>联系电话</td>
<td>楼栋</td>
<td>单元</td>
<td>房号</td>
</tr>
<%   
ArrayList list1 = (ArrayList) request.getAttribute("list"); 
if(list1 == null){
%>
<% 
	userservice u = new userservice(); 
	List list = u.findall();
	for(int i=0;i<list.size();i++){
		user us = (user)list.get(i);
%>
<tr>
<td><%=us.getid() %></td>
<td><%=us.getname() %></td>
<td><%=us.getphone() %></td>
<td><%=us.getbuildingno() %></td>
<td><%=us.getunit() %></td>
<td><%=us.getroomno() %></td> 
</tr>
<%}
}%>
<%
if(!(list1 == null)){
	for(int i=0;i<list1.size();i++){
		user us = (user)list1.get(i);
%>
<tr>
<td><%=us.getid() %></td>
<td><%=us.getname() %></td>
<td><%=us.getphone() %></td>
<td><%=us.getbuildingno() %></td>
<td><%=us.getunit() %></td>
<td><%=us.getroomno() %></td> 
</tr>
<%}
}%>

</table>
</body>
</html>