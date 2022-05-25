<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1부터 10까지 자연수 합 구하기</h2>

<%
	int end = Integer.parseInt(request.getParameter("end"));
	int sum = 0; 
			
	for(int i = 1; i < end; i++) { 
%>	<b> <%=i %> + </b>
<%	sum += i;
	} %>
	<b> <%= end %> = <%=sum+end %> </b>

</body>
</html>