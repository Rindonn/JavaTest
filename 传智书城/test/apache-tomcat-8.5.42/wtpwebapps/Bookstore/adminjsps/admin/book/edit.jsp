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
<title>添加图书</title>
<link rel="stylesheet" type="text/css" href="adminjsps/admin/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="jquery/jquery.datepick.css">
<script type="text/javascript" src="adminjsps/admin/js/jquery.min.js"></script>
<script type="text/javascript" src="jquery/jquery.datepick.js"></script>
<script type="text/javascript" src="jquery/jquery.datepick-zh-CN.js"></script>
<script type="text/javascript" src="adminjsps/admin/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function () {
	$("#publishtime").datepick({dateFormat:"yy-mm-dd"});
	$("#printtime").datepick({dateFormat:"yy-mm-dd"});

	$("#btn").click(function() {
		var bname = $("#bname").val();
		var currPrice = $("#currPrice").val();
		var price = $("#price").val();
		var discount = $("#discount").val();
		var author = $("#author").val();
		var press = $("#press").val();
		var pid = $("#pid").val();
		var cid = $("#cid").val();
		var image_w = $("#image_w").val();
		var image_b = $("#image_b").val();
		
		if(!bname || !currPrice || !price || !discount || !author || !press || !pid || !cid || !image_w || !image_b) {
			alert("图名、当前价、定价、折扣、作者、出版社、1级分类、2级分类、大图、小图都不能为空！");
			return false;
		}
		
		if(isNaN(currPrice) || isNaN(price) || isNaN(discount)) {
			alert("当前价、定价、折扣必须是合法小数！");
			return false;
		}
		$("#form").submit();
	});
});

</script>
</head>
<body>
	<div class="page-header">
		<h3 align="center">修改图书</h3><br/>
		<p style="font-weight: 900; color: red;">${msg }</p>
		<form class="form-horizontal" action="javascript:alert('添加图书成功！')"
			enctype="multipart/form-data" method="post" id="form">
			<input type="hidden" class="form-control" id="bid" name="bid"/>
			<div class="form-group">
				<label for="bname" class="col-sm-2 control-label">书名：</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" id="bname" name="bname"
						value="Spring实战(第3版)（In Action系列中最畅销的Spring图书，近十万读者学习Spring的共同选择）"/>
				</div>
			</div>
			<div class="form-group">
				<label for="image_w" class="col-sm-2 control-label">大图：</label>
				<div class="col-sm-6">
					<input type="file" class="form-control" id="image_w" name="image_w"/>
				</div>
			</div>
			<div class="form-group">
				<label for="image_b" class="col-sm-2 control-label">小图：</label>
				<div class="col-sm-6">
					<input type="file" class="form-control" id="image_b" name="image_b"/>
				</div>
			</div>
			<div class="form-group">
				<label for="price" class="col-sm-2 control-label">当前价格：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="price" name="price"/>
				</div>
			</div>
			<div class="form-group">
				<label for="disprice" class="col-sm-2 control-label">定价：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="disprice" name="disprice"/>
				</div>
				<label for="discount" class="col-sm-1 control-label">折扣：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="discount" name="discount"/>
				</div>
				<label for="discount" class="control-label pull-left" style="" >折</label>
			</div>
			<hr/>
			<div class="form-group">
				<label for="author" class="col-sm-2 control-label">作者：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="author" name="author" value="Craig Walls"/>
				</div>
			</div>
			<div class="form-group">
				<label for="press" class="col-sm-2 control-label">出版社：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="press" id="press" value="人民邮电出版社"/>
				</div>
			</div>
			<div class="form-group">
				<label for="publishtime" class="col-sm-2 control-label">出版时间：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="publishtime" name="publishtime" value="2013-6-1"/>
				</div>
			</div>
			<div class="form-group">
				<label for="edition" class="col-sm-2 control-label">版次：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="edition" id="edition" value="1"/>
				</div>
				<label for="pageNum" class="col-sm-1 control-label">页数：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="pageNum" id="pageNum" value="374"/>
				</div>
				<label for="wordNum" class="col-sm-1 control-label">字数：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="wordNum" id="wordNum" value="48700"/>
				</div>
			</div>
			<div class="form-group">
				<label for="printtime" class="col-sm-2 control-label">印刷时间：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="printtime" id="printtime" value="2013-6-1"/>
				</div>
				<label for="booksize" class="col-sm-1 control-label">开本：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" name="booksize" id="booksize" value="16"/>
				</div>
				<label for="paper" class="col-sm-1 control-label">纸张：</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" ame="paper" id="paper" value="胶版纸"/>
				</div>
			</div>
			<div class="form-group">
				<label for="pid" class="col-sm-2 control-label">一级分类：</label>
				<div class="col-sm-3">
					<select name="pid" id="pid" class="form-control" onchange="loadChildren()">
						<option value="">==请选择1级分类==</option>
			    		<option value="1" selected='selected'>程序设计</option>
			    		<option value="2">办公室用书</option>
			    		<option value="3">图形 图像 多媒体</option>
			    		<option value="4">操作系统/系统开发</option>
					</select>
				</div>
				<label for="cid" class="col-sm-2 control-label">二级分类：</label>
				<div class="col-sm-3">
					<select name="cid" id="cid" class="form-control" >
						<option value="">==请选择2级分类==</option>
			    		<option value="1" selected='selected'>Java Javascript</option>
			    		<option value="2">JSP</option>
			    		<option value="3">C C++ VC VC++</option>
					</select>
				</div>
			</div>
			<br/>
			<div class="form-group">
				<div class="col-sm-offset-8 col-sm-3">
					<button type="submit" class="btn btn-primary">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button" class="btn btn-primary" onclick="history.go(-1)">返回列表</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>