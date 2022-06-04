<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#form01 {
	background-color: white;
	height: 80px;
	margin-left: 25px;
}

#form01 input {
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
	<form id="form01" action="#">
		<input type="button" class="buttons" value="">
		<input type="button" class="buttons" value="">
		<input type="button" class="buttons" value="로그인">
		<input type="button" class="buttons" value="사원등록&#x00A;(관리자로 로그인 후 사용 가능)">
		<input type="button" class="buttons" value="마이페이지">
	</form>
</body>
</html>