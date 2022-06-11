<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="DBPKG.manageDAO"/>
<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="vo" class="DBPKG.manageVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	int lastNO = dao.lastCustNO();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/manage.js"></script>
<style type="text/css">
	* {margin:0;}
	section {width: 1000px; height: 500px; background-color: #D5D5D5; margin:0 auto;}
	section > h2 {text-align: center; line-height: 100px;}
	section > ul {margin-left: 20px;}
	table, th, td  { border:1px solid #666; }
	table {width:600px; margin:10px auto 0;}
	th {padding:5px; width:250px; text-align: center; border:1px solid #666; margin: 2px;}
	td {padding:5px; width:350px; text-align: left; border:1px solid #666; margin: 2px;}
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div>
	<section>
		<h2>쇼핑몰 회원관리 프로그램</h2>
		<form action="join_impl.jsp" name="frm">
		<table>
			<tr>
				<th>회원번호(자동발생)</th>
				<td><input type="text" name="no" readonly
					value="<%=lastNO+1%>"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>회원전화</th>
				<td><input type="text" name="phone" size="30"></td>
			</tr>
			<tr>
				<th>회원주소</th>
				<td><input type="text" name="address" size="40"></td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td><input type="text" name="joindate"></td>
			</tr>
			<tr>
				<th>고객등급[A:VIP,B:일반,C:직원]</th>
				<td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="등록" onclick="return joinCheck()">
					<input type="button" value="조회">
				</td>
			</tr>
		</table>
		</form>
	</section>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>