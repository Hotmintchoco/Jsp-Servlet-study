<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, DBPKG.*"%>
<jsp:useBean id="dao" class="DBPKG.manageDAO"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String search = request.getParameter("search");
	List<manageVO> list = null;
	
	if(search != null) {
		list = dao.searchMemberList(search);
	} else {
		list = dao.memberList();
	}
	//pageContext.setAttribute("memberlist", list);
%>
<c:set var="memberlist" value="<%=list%>"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	* {margin:0;}
	table {width:900px; margin:10px auto 0;}
	section > h1 {text-align: center; line-height: 100px;}
	section {width: 1000px; height: 500px; background-color: #D5D5D5; margin:0 auto;}
	table, th, td  { border:1px solid #666; text-align: center;}
	a {text-decoration: none; color: white;}
	.input-group {width: 1000px;}
</style>
</head>
<body>
<jsp:include page="header.jsp"/>
	<section>
		<form action="memberForm.jsp">
			<div class="input-group">
				<input type="text" class="form-control" name="search" placeholder="회원목록 검색(회원성명, 주소)">
				<div class="input-group-btn">
					<button class="btn btn-default" type="submit">
						<i class="glyphicon glyphicon-search"></i>
					</button>
				</div>
			</div>
		</form>
		<h1 style="text-align: center">회원목록조회/수정</h1>
			<table>
				<tr>
					<th width=10%>회원번호</th>
					<th width=10%>회원성명</th>
					<th width=15%>전화번호</th>
					<th width=30%>주소</th>
					<th width=15%>가입일자</th>
					<th width=10%>고객등급</th>
					<th width=10%>거주지역</th>
				</tr>
				<c:forEach var="member" items="${memberlist}">
				<tr>
					<td width=10%><a href="updateForm.jsp?no=${member.no}">${member.no}</a></td>
					<td width=10%>${member.name}</td>
					<td width=15%>${member.phone}</td>
					<td width=30%>${member.address}</td>
					<td width=15%>${member.joindate.substring(0, 10)}</td>
					<td width=10%>${member.grade}</td>
					<td width=10%>${member.city}</td>
				</tr>
				</c:forEach>
				
				
				<%-- <%
					String grade = "직원";
					for(manageVO vo : list) {
				%>
				<tr>
					<td width=10%><a href="updateForm.jsp?no=<%=vo.getNo()%>"><%=vo.getNo() %></a></td>
					<td width=10%><%=vo.getName()%></td>
					<td width=15%><%=vo.getPhone()%></td>
					<td width=30%><%=vo.getAddress()%></td>
					<td width=15%><%=vo.getJoindate().substring(0, 10)%></td>
				<%
					if(vo.getGrade() == 'A') {
						grade = "VIP";
					} else if(vo.getGrade() == 'B') {
						grade = "일반";
					}
				%>
					<td width=10%><%=grade%></td>
					<td width=10%><%=vo.getCity()%></td>
				</tr>
				<%
					}
				%> --%>
			</table>
		</section>
<jsp:include page="footer.jsp"/>
</body>
</html>