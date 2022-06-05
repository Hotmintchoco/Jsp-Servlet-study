<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {width:700px; margin:10px auto 0;}
	td {padding:5px; width:300px; text-align: center;
			 border:1px solid #666; margin: 2px;}
</style>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
<jsp:include page="header.jsp"/>
<form action="login.do" method="post" name="frm">
	<table>
		<tr>
			<td colspan="2">
				<h3>사원 정보</h3> <br>
				<p style="color: #A6A6A6">${message}</p>
			</td>
		</tr>
		<tr>
			<td> 아이디  </td>
			<td>
			<input type="hidden" name="userid" value="${loginUser.userid}"> 
			${loginUser.userid} 
			</td>
		</tr>
		<tr>
			<td> 비밀번호  </td>
			<td>
			<input type="hidden" name="pwd" value="${loginUser.pwd}">
			 ${loginUser.pwd} 
			 </td>
		</tr>
		<tr>
			<td> 이름  </td>
			<td> ${loginUser.name} </td>
		</tr>
		<tr>
			<td> 권한  </td>
			<td>
			<c:choose>
				<c:when test="${loginUser.admin == 'A'.charAt(0)}">
					운영자
				</c:when>
				<c:otherwise>
					일반회원
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td> 성별  </td>
			<td>
			<c:choose>
				<c:when test="${loginUser.gender==0}">
					여자
				</c:when>
				<c:otherwise>
					남자
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td> 전화번호  </td>
			<td> ${loginUser.phone} </td>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="메인 페이지로 이동">
			</td>
		</tr>
	</table>
</form>
</body>
</html>