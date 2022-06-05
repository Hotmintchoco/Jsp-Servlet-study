<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#header {
	background-color: white;
	height: 80px;
}

input {
	vertical-align: top;
	margin: 0px;
	height: 100%;
	box-sizing: border-box;
}

.buttons {
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	cursor: pointer;
	width: 19.5%;
	height: 80px;
	position: relative;
	border: 1px solid black;
	background-color: white;
}

.buttons:hover {
	background-color: #D5D5D5;
}
</style>
</head>
<body>
<%
	if(session.getAttribute("loginUser")==null){
		request.getParameter("name");
%>
<div id="header">
	<form action="login.do">
		<input type="button" class="buttons" value="">
		<input type="button" class="buttons" value="">
		<input type="submit" class="buttons" value="로그인">
		<input type="button" class="buttons" value="사원등록&#x00A;(관리자로 로그인 후 사용 가능)">
		<input type="button" class="buttons" value="마이페이지&#x00A;(로그인 후 사용 가능)">
	</form>
</div>
<%
	} else {
%>
<c:choose>
	<c:when test="${loginUser.admin == 'A'.charAt(0)}">
	<div id="header">
		<form action="logout.do">
			<input type="button" class="buttons" value="${loginUser.name}님 반갑습니다.">
			<input type="button" class="buttons" value="레벨 : ${loginUser.admin}">
			<input type="submit" class="buttons" value="로그아웃">
			<input type="button" class="buttons" value="사원등록"
					onclick="location.href='registration.do?userid=${loginUser.userid}'">
			<input type="button" class="buttons" value="마이페이지"
					onclick="location.href='mypage.do?userid=${loginUser.userid}'">
		</form>
	</div>
	</c:when>
	<c:otherwise>
	<div id="header">
		<form action="logout.do">
			<input type="button" class="buttons" value="${loginUser.name}님 반갑습니다.">
			<input type="button" class="buttons" value="레벨 : ${loginUser.admin}">
			<input type="submit" class="buttons" value="로그아웃">
			<input type="button" class="buttons" value="사원등록&#x00A;(관리자로 로그인 후 사용 가능)">
			<input type="button" class="buttons" value="마이페이지"
					onclick="location.href='mypage.do?userid=${loginUser.userid}'">
		</form>
	</div>
	</c:otherwise>
</c:choose>
<%
	}
%>
</body>
</html>