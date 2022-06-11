<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="DBPKG.manageDAO"/>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="vo" class="DBPKG.manageVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	dao.customerInsert(vo);
	response.sendRedirect("joinCustomer.jsp");
%>