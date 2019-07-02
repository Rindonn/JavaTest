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
<title>订单列表</title>
<link rel="stylesheet" type="text/css" href="adminjsps/admin/css/bootstrap.css">
<script type="text/javascript" src="adminjsps/admin/js/jquery.min.js"></script>
<script type="text/javascript" src="adminjsps/admin/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="page-header">
		<p class="text-primary" align="right">
			<a class="active" href="adminjsps/admin/order/list.jsp">未付款</a> | 
			<a class="active" href="adminjsps/admin/order/list.jsp">已付款</a> | 
			<a class="active" href="adminjsps/admin/order/list.jsp">已发货</a> | 
			<a class="active" href="adminjsps/admin/order/list.jsp">交易成功</a> | 
			<a class="active" href="adminjsps/admin/order/list.jsp">已取消</a>
		</p>
		<table class="table">
			<tr class="info">
				<th>订单号</th>
				<th>商品信息</th>
				<th>下单时间</th>
				<th>金额</th>
				<th>订单状态</th>
				<th>操作</th>
			</tr>
			<tr>
				<td>
					<a href="adminjsps/admin/order/desc.jsp">E3A1EB6D0543489F9729B2B5BC5DB366</a>
				</td>
				<td>
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
				</td>
				<td>2018-12-01 11:45:29</td>
				<td style="padding-left: 0">
					<span class="price_t">&yen;203.5</span>
				</td>
				<td>等待付款</td>
				<td>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">查看</a></p> 
					<p><a class="btn btn-danger btn-xs active" href="adminjsps/admin/order/desc.jsp">取消</a></p>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">发货</a></p>
				</td>
			</tr>
			<tr>
				<td>
					<a href="adminjsps/admin/order/desc.jsp">E3A1EB6D0543489F9729B2B5BC5DB365</a>
				</td>
				<td>
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
				</td>
				<td>2018-12-01 11:45:29</td>
				<td style="padding-left: 0">
					<span class="price_t">&yen;203.5</span>
				</td>
				<td>等待付款</td>
				<td>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">查看</a></p> 
					<p><a class="btn btn-danger btn-xs active" href="adminjsps/admin/order/desc.jsp">取消</a></p>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">发货</a></p>
				</td>
			</tr>
			<tr>
				<td>
					<a href="adminjsps/admin/order/desc.jsp">E3A1EB6D0543489F9729B2B5BC5DB364</a>
				</td>
				<td>
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
				</td>
				<td>2018-09-01 11:45:29</td>
				<td style="padding-left: 0">
					<span class="price_t">&yen;203.5</span>
				</td>
				<td>等待付款</td>
				<td>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">查看</a></p> 
					<p><a class="btn btn-danger btn-xs active" href="adminjsps/admin/order/desc.jsp">取消</a></p>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">发货</a></p>
				</td>
			</tr>
						<tr>
				<td>
					<a href="adminjsps/admin/order/desc.jsp">E3A1EB6D0543489F9729B2B5BC5DB363</a>
				</td>
				<td>
					<img border="0" width="70" src="<%=path%>/book_img/23254532-1_b.jpg" />
				</td>
				<td>2018-05-14 13:22:29</td>
				<td style="padding-left: 0">
					<span class="price_t">&yen;203.5</span>
				</td>
				<td>等待付款</td>
				<td>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">查看</a></p> 
					<p><a class="btn btn-danger btn-xs active" href="adminjsps/admin/order/desc.jsp">取消</a></p>
					<p><a class="btn btn-primary btn-xs active" href="adminjsps/admin/order/desc.jsp">发货</a></p>
				</td>
			</tr>
		</table>
		<div class="pull-right">
			<ul class="pagination">
			    <li><a href="#">&laquo;</a></li>
			    <li><a href="#" class="active">1</a></li>
			    <li><a href="#">2</a></li>
			    <li><a href="#">3</a></li>
			    <li><a href="#">4</a></li>
			    <li><a href="#">5</a></li>
			    <li><a href="#">&raquo;</a></li>
			</ul>
		</div>
	</div>
</body>
</html>