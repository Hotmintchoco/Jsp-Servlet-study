<%@page import="DBPKG.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	VoteDAO dao = new VoteDAO();
	List<VoteVO> list = dao.getMemberList();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#section { width: 1100px; height: 500px; }
	#section h1 { text-align: center; line-height: 100px; }
	
	table { width: 800px; border: 1px solid }
	table tr, td { border: 1px solid; text-align: center; }
</style>
</head>
<body>

<jsp:include page="header.jsp"/>

	<div id="section">
		<h1>후보조회</h1>
		
		<table>
			<tr>
				<td>후보번호</td>
				<td>성명</td>
				<td>소속정당</td>
				<td>학력</td>
				<td>주민번호</td>
				<td>지역구</td>
				<td>대표전화</td>
			</tr>
			
			<%
			for(VoteVO vo : list) {
				String school = vo.getP_SCHOOL();				
				if(school.equals("1")) school = "고졸";
				else if(school.equals("2")) school = "학사";
				else if(school.equals("3")) school = "석사";
				else if(school.equals("4")) school = "박사";
			%>
			<tr>
				<td><%=vo.getM_NO() %></td>
				<td><%=vo.getM_NAME() %></td>
				<td><%=vo.getP_NAME() %></td>
				<td><%=school %></td>
				<td><%=vo.getM_JUMIN() %></td>
				<td><%=vo.getM_CITY() %></td>
				<td><%=vo.getTel() %></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>


<jsp:include page="footer.jsp"/>

</body>
</html>