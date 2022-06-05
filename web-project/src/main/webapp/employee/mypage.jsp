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
<form action="mypage.do" method="post" name="frm">
	<table>
		<tr>
			<td colspan="2">마이페이지</td>
		</tr>
		<tr>
			<td> 아이디  </td>
			<td> <input type="text" name="userid" size="20"
			value="${eVo.userid}" readonly> </td>
		</tr>
		<tr>
			<td> 비밀번호  </td>
			<td> <input type="password" name="pwd" size="20"></td>
		</tr>
		<tr>
			<td> 이름  </td>
			<td> <input type="text" name="name" size="20"
			value="${eVo.name}" readonly> </td>
		</tr>
		<tr>
			<td> 권한  </td>
			<td>
			<c:choose>
				<c:when test="${eVo.admin == 'A'.charAt(0)}">
					<label> 
					<select name="admin">
							<option value="A">운영자</option>
					</select>
					</label>
				</c:when>
				<c:otherwise>
					<label> 
					<select name="admin">
							<option value="B">일반회원</option>
					</select>
					</label>
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td> 성별  </td>
			<td>
			<c:choose>
				<c:when test="${eVo.gender==0}">
					<label> 
					<select name="gender">
							<option value="0">여자</option>
							<option value="1">남자</option>
					</select>
					</label>
				</c:when>
				<c:otherwise>
					<label> 
					<select name="gender">
							<option value="1">남자</option>
							<option value="0">여자</option>
					</select>
					</label>
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td> 전화번호  </td>
			<td> <input type="text" name="phone" size="20"
			value="${eVo.phone}"> </td>
		</tr>
		<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="수정" onclick="loginCheck()">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</td>
		</tr>
	</table>
	<h4 style="text-align: center;">${message}</h4>
</form>
</body>
</html>