<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {margin:0;}
	section {width: 1000px; height: 500px; background-color: #D5D5D5; margin:0 auto;}
	section > h2 {text-align: center; line-height: 100px;}
	section > ul {margin-left: 20px;}
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div>
	<section>
		<h2>쇼핑몰 회원관리 프로그램</h2>
		<ul>
			<li>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</li>
			<li>프로그램 작성 순서</li>
			<li>1.회원정보 테이블을 생성한다.</li>
			<li>2.매출정보 테이블을 생성한다.</li>
			<li>3.회원정보, 매출정보 테이블에 제시된 문제지와 참조데이터를 추가 생성한다.</li>
			<li>4.회원정보 입력 화면프로그램을 작성한다.</li>
			<li>5.회원정보 조회 프로그램을 작성한다.</li>
			<li>6.회원매출정보 조회 프로그램을 작성한다.</li>
		</ul>
	</section>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>