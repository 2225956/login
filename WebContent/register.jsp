<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/register.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css"> 
</head>
<body>
	<div class="div1">
			<h1>用户注册</h1>
			<form action="">
				<input type="text" name="uname" id="username1" placeholder="用户名" required autofocus/><br />
				<span  id="us"></span><br />
				<input type="password" name="upwd" id="userpassword1" placeholder="密码" required autofocus/><br />
				<span  id="ps"></span><br />
				<button type="button" id="login" onclick="register()">注册</button>
				<button type="button"onclick="location.href='index.jsp'">返回登录</button>
			</form>
			<span name="span" id="span"></span>
	</div>
</body>
</html>