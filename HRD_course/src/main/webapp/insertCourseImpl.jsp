<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");	

	String id = request.getParameter("id");
	String courseName = request.getParameter("courseName");
	String lecturerName = request.getParameter("lecturerName");
	int week = Integer.parseInt(request.getParameter("week"));
	int credit = Integer.parseInt(request.getParameter("credit"));
	int start = Integer.parseInt(request.getParameter("start"));
	int end = Integer.parseInt(request.getParameter("end"));
	
	
	CourseDAO dao = new CourseDAO();
	Course course = new Course();
	
	course.setId(id);
	course.setCourseName(courseName);
	course.setLecturerName(lecturerName);
	course.setWeek(week);
	course.setCredit(credit);
	course.setStartHour(start);
	course.setEnd(end);
	
	dao.insertCourse(course);
	
	response.sendRedirect("courseList.jsp");
%>