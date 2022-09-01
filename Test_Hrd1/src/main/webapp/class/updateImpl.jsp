<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="DBPKG.*"%>
<% 
	request.setCharacterEncoding("UTF-8");

	int seq = Integer.parseInt(request.getParameter("seq"));
	String month = request.getParameter("month");
	String no = request.getParameter("no");
	String area = request.getParameter("area");
	int tution = Integer.parseInt(request.getParameter("tution"));
	String code = request.getParameter("code");
	
	ClassVO vo = new ClassVO();
	ClassDAO dao = new ClassDAO();
	
	vo.setClassSeq(seq);
	vo.setRegistMonth(month);
	vo.setcNo(no);
	vo.setClassArea(area);
	vo.setTution(tution);
	vo.setTeacherCode(code);

	dao.updateClass(vo);
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