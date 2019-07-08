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
<title>订单详情</title>
<link rel="stylesheet" type="text/css" href="adminjsps/admin/css/bootstrap.css">
<script type="text/javascript" src="adminjsps/admin/js/jquery.min.js"></script>
<script type="text/javascript" src="adminjsps/admin/js/bootstrap.min.js"></script>
<style>
.divRow {
	border: 2px solid #e9c9b2;
	margin-top:10px;
	padding-top: 10px;
	padding-bottom: 10px;
	padding-left: 20px;
	padding-right: 20px;
}
td{
	vertical-align: middle;
}
</style>
</head>
<body>
	<div class="page-header">
		<div class="row">
			<div class="col-xs-10">
				<strong>订单号：</strong>E3A1EB6D0543489F9729B2B5BC5DB366 (等待付款)&nbsp;&nbsp;
				<!-- 
					(准备发货)
					(等待确认)
					(交易成功)
					(已取消)
				 -->
				<strong>下单时间：</strong>2018-11-01 19:30:22
			</div>
			<div class="col-xs-2">
				<input  type="button"  class="btn btn-primary active" onclick="history.go(-1)" value="返回列表"/>
			</div>
		</div>
		
		<div class="divRow">
			<dl>
				<dt>收货人信息</dt>
				<dd>山东省济南市长清区 创新谷Z-2 307  山东师创  张老师</dd>
			</dl>
			<dl>
				<dt>商品清单</dt>
			</dl>
			<table class="table">
				<tr class="active"> 
					<th>商品名称</th>
					<th align="left">单价</th>
					<th align="left">数量</th>
					<th align="left">小计</th>
				</tr>
				<tr>
					<td>
						<div>
							<img width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
							Spring实战(第3版)（In Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）
						</div>
					</td>
					<td>&yen;40.7</td>
					<td>1</td>
					<td>&yen;40.7</td>
				</tr>
				<tr>
					<td>
						<div>
							<img width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
							Spring实战(第3版)（In Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）
						</div>
					</td>
					<td>&yen;40.7</td>
					<td>2</td>
					<td>&yen;81.4</td>
				</tr>
			</table>
			<div align="right">
				<strong>合　　计：</strong>
				<strong class="text-warning">&yen;203.5</strong><br/><br/>
	
				<a id="deliver" class="btn btn-primary btn-xs active" href="javascript:alert('订单发货成功！')">发　　货</a>
				<a id="cancel" class="btn btn-danger btn-xs active" href="javascript:alert('订单取消成功！')">取　　消</a>
			</div>
		</div>
	</div>
</body>
</html>