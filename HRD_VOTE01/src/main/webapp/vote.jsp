<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="voteCheck.js"></script>
<style type="text/css">
	#section { width: 1100px; height: 500px; }
	#section h1 { text-align: center; line-height: 100px; }
	
	table { width: 800px; border: 1px solid }
	table tr, th, td { border: 1px solid; height: 35px; }
	th { text-align: center; }
</style>
</head>
<body>

<jsp:include page="header.jsp"/>

	<div id="section">
		<h1>투표하기</h1>
		
		<form action="voteImpl.jsp" name="frm" method="post">
		
		<table>
			<tr>
				<th>주민번호</th>
				<td>&nbsp;<input type="text" name="jumin" size="50">&nbsp;&nbsp;&nbsp; 예 : 8906153154726</td>
			</tr>
			<tr>
				<th>성명</th>
				<td>&nbsp;<input type="text" name="name"></td>
			</tr>
			<tr>
				<th>투표번호</th>
				<td>&nbsp;
					<select name="num">
						<option value="0"></option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>투표시간</th>
				<td>&nbsp;<input type="text" name="time"></td>
			</tr>
			<tr>
				<th>투표장소</th>
				<td>&nbsp;<input type="text" name="area"></td>
			</tr>
			<tr>
				<th>유권자확인</th>
				<td>&nbsp;
					<input type="radio" name="check" value="Y"> <label>확인</label>
					<input type="radio" name="check" value="N"> <label>미확인</label>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="투표하기" onclick="return vote()"> <button type="button" onclick="return reset()">다시쓰기</button>
				</td>
			</tr>
		</table>
		
		</form>
	</div>


<jsp:include page="footer.jsp"/>

</body>
</html>