<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
<style>
	table {width:700px; margin:10px auto 0;}
	td {padding:5px; width:300px; text-align: center;
		 border:1px solid #666; margin: 2px;}
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div>
	<form action="login.do" method="post" name="frm">
		<table>
			<tr>
				<td colspan="2"> 로그인 </td>
			</tr>
			<tr>
				<td> 아이디 </td>
				<td><input type="text" name="userid" value="${userid}"></td>
			</tr>
			<tr>
				<td> 비밀번호 </td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td> 레벨 </td>
				<td>
					<label>
						<select name="admin">
							<option value="B">일반회원</option>
							<option value="A">운영자</option>
						</select>
					</label>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인"
						onclick="loginCheck()">&nbsp;&nbsp;
					<input type="reset" value="취소"> &nbsp;&nbsp;
				</td>
			</tr>
		</table>
		<h4 style="text-align: center;">${message}</h4>
	</form>
</div>
</body>
</html>