<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<style>
		body
		{
			padding: 0;
			margin: 0;
			background-color: darkseagreen;
		}
		.head
		{
			border-bottom: 1px solid #000;
			height: 50px;
			background-color: blanchedalmond;
		}
		div
		{
			margin: 0;
			padding: 0;
		}
		.div1
		{
			height: 50px;
			float: left;
			padding-left: 20px;
		}
		.div1 img
		{
			opacity: 0.5;
			border-radius: 10px;
			display: inline-block;
  			height: auto;
  			max-width: 100%;
		}
		.div3
		{
			height: 50px;
			float: left;
			margin-top: 25px;
			margin-left: 20px;
			font-size: 20px;
		}
		.div1_2
		{
			float: left;
		}
		.div2
		{
			float: right;
			margin-top: 15px;
			font-size: 25px;
			
		}
		.div2 a
		{
			text-decoration: none;
			color: black;
			margin-left: 50px;
			margin-top: px;
			padding: 0 10px;
			border-right: 3px solid #000;
			border-left:3px solid #000;
		}
		.a1
		{
			margin-top: 100px;
			padding:0px 0;
		}
	</style>
<body>
<div class="head">
		<div class="div1">
				<img src="img/t1.jpg" width="50px" height="50px"/>
		</div>			
		<div class="div3">
			<a class="a1">当前用户：${name}</a>
		</div>
		<div class="div2">
			<a href="main.jsp">首页</a>
			<a href="DownloadListServlet.do">资源下载</a>
			<a href="userManage.jsp">用户管理</a>
			<a href="resourceManage.jsp">资源管理</a>
			<a href="QuitLogin.do">退出登录</a>
		</div>
</div>

</body>
</html>