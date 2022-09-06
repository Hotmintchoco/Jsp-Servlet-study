<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");	

	String id = request.getParameter("id");
	
	CourseDAO dao = new CourseDAO();
	dao.deleteCourse(id);	
	
	response.sendRedirect("courseList.jsp");
%>