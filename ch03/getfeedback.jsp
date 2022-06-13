<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String feedback=request.getParameter("feedback");
//특수문자 변경처리: 문자열.replace(a,b)= a를 b로교체
feedback=feedback.replace("<", "&lt;");
feedback=feedback.replace(">", "&gt;");
feedback=feedback.replace("\n", "<br>");
feedback=feedback.replace("  ", "&nbsp;&nbsp;");
%>
고객의견 : <br>
<%= feedback %>
</body>
</html>