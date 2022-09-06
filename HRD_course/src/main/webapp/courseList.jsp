<%@page import="java.util.List"%>
<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	CourseDAO dao = new CourseDAO();

	List<Course> list = dao.getCourseList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#all { width: 1125px; margin: 0 auto; border: 1px solid black; }
	#all section { width: 1100px; height: 500px; border: 1px solid black; 
	margin: 0 auto; margin-top: 10px; }
	#all section div { margin: 30px; }
	table { margin: 0 auto; border: 1px solid black; width: 900px; }
	table th, td { border: 1px solid black; text-align: center; }
	th { background-color: orange; }
	section button { margin-left: 900px; margin-top: 50px;
	background-color: white; width: 85px; height: 40px; }
	footer { width: 1100px; height: 75px; border: 1px solid black; 
	margin: 10px auto; text-align: center; }
</style>
</head>
<body>
<div id="all">
	
	<jsp:include page="header.jsp"/>
	<section>
		<div>
		<h2>총 <%=list.size() %>개의 교과목이 있습니다.</h2>
			<table>
				<tr>
					<th>과목코드</th>
					<th>과목명</th>
					<th>학점</th>
					<th>담당강사</th>
					<th>요일</th>
					<th>시작시간</th>
					<th>종료시간</th>
					<th>관리</th>
				</tr>
				
				<%
				for(Course course : list) {
						
					String week = "";
					switch(course.getWeek()) {
					case 1: week = "월"; break;
					case 2: week = "화"; break;
					case 3: week = "수"; break;
					case 4: week = "목"; break;
					case 5: week = "금"; break;
					case 6: week = "토"; break;
					}
				%>
				<tr>
					<td><a href="detailCourse.jsp?id=<%=course.getId()%>"><%=course.getId() %></a></td>
					<td><%=course.getCourseName() %></td>
					<td><%=course.getCredit() %></td>
					<td><%=course.getLecturerName() %></td>
					<td><%=week %></td>
				<%
					if(course.getStartHour() <= 1000) {
							
				%>
					<td>0<%=course.getStartHour() %></td>
				<%
					} else {
				%>
					<td><%=course.getStartHour() %></td>
				<%
					}
				%>
					<td><%=course.getEnd() %></td>
					<td><a href="updateCourse.jsp?id=<%=course.getId()%>">수정</a> / <a href="deleteCourse.jsp?id=<%=course.getId()%>">삭제</a></td>
				</tr>
				<%
				}
				%>
				
			</table>
			
		<button onclick="location.href='insertCourse.jsp'">작성</button>
		</div>
		
	</section>
	<footer>
		<h2>Copyright (C) 2018 정보처리산업기사 All Right Reserved</h2>
	</footer>
</div>
</body>
</html>