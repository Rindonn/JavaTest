<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<title>图书详情</title>
	<link rel="stylesheet" type="text/css" href="<c:url value='adminjsps/admin/css/bootstrap.css'/>">
	<script type="text/javascript" src="<c:url value='adminjsps/admin/js/jquery.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='adminjsps/admin/js/bootstrap.min.js'/>"></script>
	<style type="text/css">
		.img{
			width:380px;
			padding:10px;
			border: 1px solid #ccc;
		}
		.text-muted{
			line-height: 26px;
		}
	</style>
</head>
<body>
	<div class="page-header">
		<h4>${book.bname}</h4>
		<div class="img">
			<img align="top" src="<c:url value='/${book.image_w}'/>"/>
		</div>
		 <ul class="list-unstyled text-muted">
	    	<li>商品编号：${book.bid}</li>
	    	<li>当前价：<span class="price_n">&yen;${book.currPrice}</span></li>
	    	<li>定价：<del>&yen;${book.price}</del>&nbsp;&nbsp;折扣：<span style="color: #c30;">${book.discount}</span>折</li>
	    </ul>
		<hr class="text-muted"/>
		<table class="text-muted">
			<tr>
				<td colspan="3">
					作者：${book.author}
				</td>
			</tr>
			<tr>
				<td colspan="3">
					出版社：${book.press}
				</td>
			</tr>
			<tr>
				<td colspan="3">出版时间：${book.publishtime }</td>
			</tr>
			<tr>
				<td width="180">版次：${book.edition }</td>
				<td width="130">页数：${book.pageNum }</td>
				<td width="130">字数：${book.wordNum }</td>
			</tr>
			<tr>
				<td>印刷时间：${book.printtime}</td>
				<td>开本：${book.booksize }</td>
				<td>纸张：${book.paper}</td>
			</tr>
		</table>
	</div>
	<div class="col-sm-offset-10 col-sm-2">
		<button type="button" class="btn btn-primary" onclick="history.go(-1)">返回列表</button>
	</div>
</body>
</html>