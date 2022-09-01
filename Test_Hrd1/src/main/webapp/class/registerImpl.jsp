<%@page import="DBPKG.ClassDAO"%>
<%@page import="DBPKG.ClassVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");

	String month = request.getParameter("month");
	String no = request.getParameter("no");
	String area = request.getParameter("area");
	int tution = Integer.parseInt(request.getParameter("tution"));
	String code = request.getParameter("code");
	
	ClassVO vo = new ClassVO();
	ClassDAO dao = new ClassDAO();
	
	vo.setClassSeq(dao.lastSeq() + 1);
	vo.setRegistMonth(month);
	vo.setcNo(no);
	vo.setClassArea(area);
	vo.setTution(tution);
	vo.setTeacherCode(code);

	dao.insertClass(vo);
	response.sendRedirect("classManage.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>