<%@page import="java.util.List"%>
<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	CourseDAO dao = new CourseDAO();
	
	List<Course> list = dao.getLecturerList();
	Course course  = dao.getCourse(id);
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
	#all section div h2 { text-align: center; }
	table { margin: 0 auto; border: 1px solid black; width: 900px; }
	table th, td { border: 1px solid black; text-align: center; height: 35px; }
	th { background-color: orange; }
	#buttons { text-align: center; }
	section #buttons input { background-color: white; width: 85px;
	 height: 40px; }
	footer { width: 1100px; height: 75px; border: 1px solid black; 
	margin: 10px auto; text-align: center; }
</style>
</head>
<body>
<div id="all">
	
	<jsp:include page="header.jsp"/>
	<section>
		<div>
		<h2>교과목 추가</h2>
		
		<form action="updateCourseImpl.jsp" method="post">
		
		<table>
			<tr>
				<td>교과목 코드</td>
				<td><input name="id" size="90%" value="<%=course.getId() %>"></td>
			</tr>
			<tr>
				<td>과목명</td>
				<td><input name="courseName" size="90%" value="<%=course.getCourseName() %>"></td>
			</tr>
			<tr>
				<td>담당강사</td>
				<td>
					<select name="lecturerName">
						<option><%=course.getLecturerName() %></option>
						<%
						for(Course lecturer : list) {
							if(!(course.getLecturerName().equals(lecturer.getLecturerName()))) {
						%>
						<option><%=lecturer.getLecturerName() %></option>
						<%
							}
						}
						%>
					</select>
				</td>
			</tr>
			<tr>
				<td>학점</td>
				<td><input name="credit" size="90%" value="<%=course.getCredit() %>"></td>
			</tr>
			<tr>
				<td>요일</td>
				<td>
					<input type="radio" name="week" value="1" checked="checked">월
					<input type="radio" name="week"  value="2">화
					<input type="radio" name="week"  value="3">수
					<input type="radio" name="week"  value="4">목
					<input type="radio" name="week"  value="5">금
					<input type="radio" name="week"  value="6">토
				</td>
			</tr>
			<tr>
				<td>시작</td>
				<%
				if(course.getStartHour() <= 1000) {
							
				%>
				<td><input name="start" size="90%" value="0<%=course.getStartHour() %>"></td>
				<%
				} else {
				%>
				<td><input name="start" size="90%" value="<%=course.getStartHour() %>"></td>
				<%
				}
				%>
			</tr>
			<tr>
				<td>종료</td>
				<td><input name="end" size="90%" value="<%=course.getEnd() %>"></td>
			</tr>
		</table>
		
		<div id="buttons">
		<input type="button" value="목록" onclick="location.href='courseList.jsp'">
		<input id="submit" type="submit" value="완료">
		</div>
		
		</form>
		
		</div>
		
	</section>
	<footer>
		<h2>Copyright (C) 2018 정보처리산업기사 All Right Reserved</h2>
	</footer>
</div>
</body>
</html>