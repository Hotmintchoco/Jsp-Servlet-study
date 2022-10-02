<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String jumin = request.getParameter("jumin");
	String name = request.getParameter("name");
	String num = request.getParameter("num");
	String time = request.getParameter("time");
	String area = request.getParameter("area");
	String check = request.getParameter("check");
	
	time = (time.substring(0,2) + time.substring(3,5));
	
	VoteVO vo = new VoteVO();
	
	VoteDAO dao = new VoteDAO();
	
	vo.setV_JUMIN(jumin);
	vo.setV_NAME(name);
	vo.setM_NO(num);
	vo.setV_TIME(time);
	vo.setV_AREA(area);
	vo.setV_CONFIRM(check);
	
	dao.insertVote(vo);
	
	response.sendRedirect("index.jsp");
%>