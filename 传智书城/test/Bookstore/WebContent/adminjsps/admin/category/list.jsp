<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
	
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>分类列表</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='adminjsps/admin/css/bootstrap.css'/>">
	<script type="text/javascript" src="<c:url value='adminjsps/admin/js/jquery.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='adminjsps/admin/js/bootstrap.min.js'/>"></script>
</head>
<body>
	<div class="page-header">
		<h2 style="text-align: center;">分类列表</h2>
		<table class="table table-bordered">
			<caption align="right">
				<a  class="btn btn-primary btn-xs active" href="adminjsps/admin/category/add.jsp">添加一级分类</a>
			</caption>
			<tr align="center">
				<th>分类名称</th>
				<th>描述</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${parents}" var = "parent">
			<tr class="trOneLevelinfo">
				<td>${parent.cname }</td>
				<td>${parent.desc }</td>
				<td align="right"><a class="btn btn-primary btn-xs active"
					href="<c:url value='admincategoryservlet?method=addChild&pid=${parent.cid} '/>">添加二级分类</a>
					<a class="btn btn-primary btn-xs active" href="<c:url value='admincategoryservlet?method=editParentPre&cid=${parent.cid }'/>">修改</a>
					<a class="btn btn-danger btn-xs active" onclick="return confirm('您是否真要删除该一级分类？')"
					href="<c:url value='admincategoryservlet?method=deleteParent&cid=${parent.cid}'/>">删除</a></td>
			</tr>
			<c:forEach items="${parent.children}" var = "child">
			<tr class="trTwoLevelinfo">
				<td>${child.cname}</td>
				<td>${child.desc}</td>
				<td align="right">
					<a class="btn btn-primary btn-xs active" href="<c:url value='admincategoryservlet?method=editChildPre&cid=${child.cid }'/>">修改</a>
					<a class="btn btn-danger btn-xs active" onclick="return confirm('您是否真要删除该二级分类？')"
					href="<c:url value='admincategoryservlet?method=deleteChild&cid=${child.cid}'/>">删除</a></td>
			</tr></c:forEach>
			</c:forEach>
		</table>
	</div>
</body>
</html>