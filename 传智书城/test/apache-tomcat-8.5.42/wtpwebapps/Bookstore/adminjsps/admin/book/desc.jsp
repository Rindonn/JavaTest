<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	<link rel="stylesheet" type="text/css" href="adminjsps/admin/css/bootstrap.css">
	<script type="text/javascript" src="adminjsps/admin/js/jquery.min.js"></script>
	<script type="text/javascript" src="adminjsps/admin/js/bootstrap.min.js"></script>
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
		<h4>Spring实战(第3版)（In Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）</h4>
		<div class="img">
			<img align="top" src="<%=path%>/book_img/23254532-1_w.jpg"/>
		</div>
		 <ul class="list-unstyled text-muted">
	    	<li>商品编号：4A9574F03A6B40C1B2A437237C17DEEC</li>
	    	<li>当前价：<span class="price_n">&yen;40.7</span></li>
	    	<li>定价：<del>&yen;59.0</del>&nbsp;&nbsp;折扣：<span style="color: #c30;">6.9</span>折</li>
	    </ul>
		<hr class="text-muted"/>
		<table class="text-muted">
			<tr>
				<td colspan="3">
					作者：Craig Walls著
				</td>
			</tr>
			<tr>
				<td colspan="3">
					出版社：人民邮电出版社</a>
				</td>
			</tr>
			<tr>
				<td colspan="3">出版时间：2013-6-1</td>
			</tr>
			<tr>
				<td width="180">版次：1</td>
				<td width="130">页数：374</td>
				<td width="130">字数：487000</td>
			</tr>
			<tr>
				<td>印刷时间：2013-6-1</td>
				<td>开本：16开</td>
				<td>纸张：胶版纸</td>
			</tr>
		</table>
	</div>
</body>
</html>