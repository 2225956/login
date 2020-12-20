<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/login.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css">   
</head>
<body onload="checkFill()">

	<div class="div1" onkeydown="checkFill()">
			<h1>用户登录</h1>
			<form>
				<input type="text" name="uname" id="username" placeholder="用户名" required autofocus/><br />
				<span  id="us"></span><br />
				<input type="password" name="upwd" id="userpassword" placeholder="密码" required autofocus/><br />
				<span  id="ps"></span><br />
				<input type="text"  name="validateCode" id="validateCode" class="form-control" placeholder="验证码" required autofocus/>
				<img  src="CheckCodeServlet.do" id="validateCodeImg" onclick="changeImg()"></br>
				<span  id="vs"></span><br />
				<input type="checkbox" name="nologin" id="nologin" value="yes" placeholder="一周免登录"/><a>一周免登录</a><br>
				<button type="button" id="login" onclick="submit()">登录</button>
				<button type="button" id="register" onclick="location.href='register.jsp'" >注册</button>
				<span name="span" id="span"></span>
			</form>
			
	</div>
</body>
</html>