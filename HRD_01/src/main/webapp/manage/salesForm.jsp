<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, DBPKG.*"%>
<jsp:useBean id="dao" class="DBPKG.manageDAO"/>
<%
	List<SalesVO> list = dao.salesList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {margin:0;}
	table {width:600px; margin:10px auto 0;}
	section > h1 {text-align: center; line-height: 100px;}
	section {width: 1000px; height: 500px; background-color: #D5D5D5; margin:0 auto;}
	table, th, td  { border:1px solid #666; text-align: center;}
	
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
		<section>
		<h1 style="text-align: center">회원목록조회/수정</h1>
			<table>
				<tr>
					<th width=20%>회원번호</th>
					<th width=20%>회원성명</th>
					<th width=30%>고객등급</th>
					<th width=30%>매출</th>
				</tr>
				<%
					String grade = "직원";
					for(SalesVO vo : list) {
						if(vo.getGrade() == 'A') {
							grade = "VIP";
						} else if(vo.getGrade() == 'B') {
							grade = "일반";
						}
				%>
				<tr>
					<td width=20%><%=vo.getNo() %></td>
					<td width=20%><%=vo.getName()%></td>
					<td width=30%><%=grade%></td>
					<td width=30%><%=vo.getSales()%></td>
				</tr>
				<%
					}
				%>
			</table>
		</section>
<jsp:include page="footer.jsp"/>
</body>
</html>