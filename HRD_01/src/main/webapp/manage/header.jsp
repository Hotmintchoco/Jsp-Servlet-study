<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {margin:0;}
	ul,ol.li {list-style: none; margin: 0; padding: 0;}
	header {width: 1000px; height: 100px; background-color: blue; margin:0 auto;}
	header > h1 {color: white; text-align: center; line-height: 100px;}
	nav {width: 1000px; height: 50px; background-color: pink; margin:0 auto;}
	nav > ul > li > a {float: left; color: white; text-decoration: none; margin: 15px 30px 0 30px;}
</style>
</head>
<body>
<header>
	<h1>쇼핑몰 회원관리 ver1.0</h1>
</header>

<div>
	<nav>
		<ul>
			<li><a href="joinCustomer.jsp">회원등록</a></li>
			<li><a href="memberForm.jsp">회원목록조회/수정</a></li>
			<li><a href="salesForm.jsp">회원매출조회</a></li>
			<li><a href="main.jsp">홈으로.</a></li>
		</ul>
	</nav>
</div>
</body>
</html>