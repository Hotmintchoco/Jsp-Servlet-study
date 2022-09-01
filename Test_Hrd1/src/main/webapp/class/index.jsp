<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* { margin: 0; border: 0; }
	header { width: 1100px; height: 100px; background-color: navy; 
	margin: 0 auto; }
	header h1 { text-align: center; line-height: 100px; color: white; }
	nav { width: 1100px; height: 50px; background-color: blue;
	margin: 0 auto; }
	nav a { float: left; font-size: 20px;  margin: 15px 40px 0 10px; 
	color: white; text-decoration: none; } 
	section { width: 1100px; height: 500px; margin: 0 auto;
	border: 1px solid navy; }
	section div { margin: 30px; }
	div p { margin : 10px; }
	footer { width: 1100px; height: 100px; background-color: navy;
	margin: 0 auto; }
	footer p { text-align: center; line-height: 100px; 
	color: white; }
</style>
</head>
<body>
	<header>
		<h1>수강관리 프로그램 ver 1.0</h1>
	</header>
	
	<nav>
		<a href="classManage.jsp">과정관리</a>
		<a href="#">수강생 정보</a>
		<a href="#">교사정보</a>
		<a href="index.jsp">홈으로..</a>
	</nav>
	
	<section>
		<div>
			<p>과정 등록 및 조회, 과정 정보 수정 및 삭제, 수강 신청 정보 및 조회,
			정보수정, 삭제 업무가 가능하도록 하는 프로그램이다.</p>
			<p>1. 과정 테이블을 생성한다.</p>
			<p>2. 수강생 테이블을 생성한다.</p>
			<p>3. 교사 테이블을 생성한다.</p>
			<p>4. 과정 테이블, 수강생 테이블, 교사 테이블에 제시된 문제지의 참조 데이터를 추가한다.</p>
			<p>5. 과정 관리 목록과 과정 등록 화면을 작성한다.</p>
			<p>6. 과정 정보의 조회 화면을 작성한다.</p>
			<p>7. 과정 정보의 수정 화면을 작성한다.</p>
			<p>8. 수강생 정보 목록과 수강 신청 화면을 작성한다.</p>
			<p>9. 수강 정보의 조회 화면을 작성한다.</p>
			<p>10. 수강 정보의 수정 화면을 작성한다.</p>
			<p>11. 교사 목록과 교사 등록 화면을 작성한다.</p>
			<p>12. 교사 정보의 조회 화면을 작성한다.</p>
			<p>13. 교사 정보의 수정 화면을 작성한다.</p>
		</div>
	</section>
	
	<footer>
		<p>HRDKOREA Copyright@2022 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
</body>
</html>