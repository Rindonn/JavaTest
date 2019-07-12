<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert 业主</title>
</head>
<body>
<center><h1>添加业主</h1>
<form action="inservlet" method="post">
<span>姓名：<input type="text" id="name" name="name"></span><br>
<span>联系电话：<input type="text" id="tel" name="tel"></span><br>
<span>楼栋：<input type="text" id="bno" name="bno"></span><br>
<span>单元：<input type="text" id="unit" name="unit"></span><br>
<span>房号：<input type="text" id="roomno" name="roomno"></span><br>
<button type="submit">增加</button><br>
</form></center>
</body>
</html>