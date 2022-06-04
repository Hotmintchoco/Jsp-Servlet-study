<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.do'/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="employee/header.jsp"/>
<body>
<div align="center">
	<h2 style="font-weight: bold;">회원 전용 페이지</h2>
	<img src="https://t1.daumcdn.net/cfile/tistory/99FB41375E33859D36"
	 alt="My Image">
</div>
</body>
</html>