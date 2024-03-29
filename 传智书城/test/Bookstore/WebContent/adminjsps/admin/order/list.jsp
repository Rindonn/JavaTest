<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<link rel="stylesheet" type="text/css" href="<c:url value='/adminjsps/admin/css/bootstrap.css'/>">
<script type="text/javascript" src="<c:url value='/adminjsps/admin/js/jquery.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/adminjsps/admin/js/bootstrap.min.js'/>"></script>
</head>
<body>
	<div class="page-header">
		<p class="text-primary" align="right">
			<a href="<c:url value='/adminorderservlet?method=findbystatus&status=1'/>">未付款</a>  | 
			<a href="<c:url value='/adminorderservlet?method=findbystatus&status=2'/>">已付款</a>  | 
			<a href="<c:url value='/adminorderservlet?method=findbystatus&status=3'/>">已发货</a>  | 
			<a href="<c:url value='/adminorderservlet?method=findbystatus&status=4'/>">交易成功</a>  | 
			<a href="<c:url value='/adminorderservlet?method=findbystatus&status=5'/>">已取消</a>
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
			<c:forEach items="${pb.beanList }" var="order">	
				<tr>
					<td>
						<a href="<c:url value='/adminorderservlet?method=load&oid=${order.oid }'/>">${order.oid }</a>
					</td>
					<td>
						<c:forEach items="${order.orderItemList }" var="orderItem">
						    <img border="0" width="70" src="<c:url value='/${orderItem.image_b }'/>"/>
					  	</c:forEach>
					</td>
					<td>${order.ordertime }</td>
					<td style="padding-left: 0">
						<span class="price_t">&yen;${order.total }</span>
					</td>
					<td>
						<c:choose>
							<c:when test="${order.status eq 1 }">(等待付款)</c:when>
							<c:when test="${order.status eq 2 }">(准备发货)</c:when>
							<c:when test="${order.status eq 3 }">(等待确认)</c:when>
							<c:when test="${order.status eq 4 }">(交易成功)</c:when>
							<c:when test="${order.status eq 5 }">(已取消)</c:when>
						</c:choose>	
					</td>
					<td>
						<p><a class="btn btn-primary btn-xs active" href="<c:url value='/adminorderservlet?method=load&oid=${order.oid }'/>">查看</a></p> 
						<c:if test="${order.status eq 1}">
							<p><a class="btn btn-danger btn-xs active" href="<c:url value='/adminorderservlet?method=load&oid=${order.oid }&btn=cancel'/>">取消</a></p>
						</c:if>
						<c:if test="${order.status eq 2}">
							<p><a class="btn btn-primary btn-xs active" href="<c:url value='/adminorderservlet?method=load&oid=${order.oid }&btn=deliver'/>">发货</a></p>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="pull-right">
			<%@include file="/adminjsps/pager/pager.jsp" %>
		</div>
	</div>
</body>
</html>