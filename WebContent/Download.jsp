<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<style  type="text/css">
		div
		{
			margin: 0;
			padding: 0;
		}
		.div1
		{
			width: 70%;
			height: 250px;
			margin-left: auto;
			margin-right: auto;
			background-image:;
		}
		.div2
		{
			width: 15%;
			float: left;
			height: 150px;	
			padding: 10px 15px;
		}
		.div3
		{
			width: 70%;
			float: left;
			height: 200px;
			padding: 10px 15px;
		}
		.div4
		{
			float: right;
			height: 50px;
		}
		.img1
		{
			width: 100%;
			height: 100%;
		}
		.div3_1 
		{
			float: left;
			width: 100px;
			margin: 5px;
		}
		.div3_2 
		{
			float: left;
			width: 100px;
			margin: 5px;
		}
		.div3_3
		{
			float: left;
			width: 100px;
			margin: 5px;
		}
		.div3_4
		{
			float: left;
			margin: 5px;
		}
		h1
		{
			text-align: center;
		}
		h2
		{
			text-align: center;
		}
		button
		{
			height: 50px;
			width: 80px;
			border-radius: 5px;
			
		}
</style>
<body>
	<h1>资源下载</h1>
	<c:forEach items="${load}" var="download">				
		<div class="div1">
			<div class="div2">
				<img src="${download.image}" class="img1"/>
			</div>
			<div class="div3">
				<h2>${download.name}</h2>
				<div>
					<div class="div3_1"><p>大小：${download.size}kb</p></div>
					<div class="div3_2"><p>时间：</p></div>
					<div class="div3_3"><p>星级：${download.star}星</p></div>
					<div class="div3_4">
						<h4>简介:${download.description}</h4>
						<p></p>
					</div>	
				</div>
				<div class="div4">
					<form action="DownloadServlet.do?fileid=${download.id}" method="post">
						<button type="submit">立即下载</button>
					</form>
				</div>
			</div>
		</div>
	</c:forEach>
</body>
</html>