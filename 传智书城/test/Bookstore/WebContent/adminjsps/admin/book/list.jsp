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
<title>图书分类</title>
<link rel="stylesheet" type="text/css"
	href="adminjsps/admin/css/bootstrap.css">
<script type="text/javascript" src="adminjsps/admin/js/jquery.min.js"></script>
<script type="text/javascript" src="adminjsps/admin/js/bootstrap.min.js"></script>
<style type="text/css">
.td {
	white-space:nowrap;
   	overflow:hidden;
   	text-overflow:ellipsis;  
}
</style>
</head>
<body>
	<div class="page-header">
		<div align="right">
			<a class="btn btn-primary btn-xs active"
				href="adminjsps/admin/book/add.jsp">添加图书</a>
		</div>
		<form class="form-inline">
			<div class="form-group">
				<label for="exampleInput">一级分类:</label> <select
					class="form-control input-sm" id="exampleInput">
					<option value="" selected='selected'>===选择1级分类===</option>
					<option value="1">程序设计</option>
					<option value="2">办公室用书</option>
					<option value="3">图形 图像 多媒体</option>
				</select>
			</div>

			<div class="form-group">
				<label for="exampleInput2 input-sm">二级分类:</label> <select
					class="form-control" id="exampleInput2">
					<option value="" selected='selected'>===选择2级分类===</option>
					<option value="1">Java Javascript</option>
					<option value="2">JSP</option>
					<option value="3">C C++ VC VC++</option>
				</select>
			</div>
			<div class="input-group">
				<input type="text" class="form-control" placeholder="请输入你要查询的书名">
				<span class="input-group-btn">
					<button class="btn  btn-info" type="submit">搜索</button>
				</span>
			</div>
			<!-- /input-group -->
		</form>
		<br/>
		<table class="table table-condensed" style="table-layout:fixed;">
			<tr>
				<th width="200px">书名</th>
				<th>封面</th>
				<th>定价</th>
				<th>折扣</th>
				<th>现价</th>
				<th>一级分类</th>
				<th width="160px">二级分类</th>
				<th>操作</th>
			</tr>
			<tr>
				<td class="td"><a href="adminjsps/admin/book/desc.jsp">Spring实战(第3版)（In
					Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）</a></td>
				<td>
					<a href="adminjsps/admin/book/desc.jsp">
						<img border="0" width="70"src="<%=path%>/book_img/23254532-1_b.jpg" />
					</a>
				</td>
				<td>&yen;59</td>
				<td>6.7折</td>
				<td>&yen;40.7</td>
				<td>程序设计</td>
				<td>Java JavaScript</td>
				<td><a class="btn btn-primary btn-xs active"
					href="adminjsps/admin/book/edit.jsp">修改</a> <a
					class="btn btn-danger btn-xs active"
					onclick="return confirm('您是否真要删除该二级分类？')"
					href="javascript:alert('删除二级分类成功！');">删除</a></td>
			</tr>
			<tr>
				<td class="td"><a href="adminjsps/admin/book/desc.jsp">Spring实战(第3版)（In
					Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）</a></td>
				<td>
					<a href="adminjsps/admin/book/desc.jsp">
						<img border="0" width="70"src="<%=path%>/book_img/23254532-1_b.jpg" />
					</a>
				</td>
				<td>&yen;59</td>
				<td>6.7折</td>
				<td>&yen;40.7</td>
				<td>程序设计</td>
				<td>Java JavaScript</td>
				<td><a class="btn btn-primary btn-xs active"
					href="adminjsps/admin/book/edit.jsp">修改</a> <a
					class="btn btn-danger btn-xs active"
					onclick="return confirm('您是否真要删除该图书？')"
					href="javascript:alert('删除成功！');">删除</a></td>
			</tr>
		</table>
		<div class="pull-right">
			<ul class="pagination">
			    <li><a href="#">&laquo;</a></li>
			    <li><a href="#">1</a></li>
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