<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<%
//개별적 삭제
//session.removeAttribute("id");

session.invalidate();//세션초기화
%>
세션이 삭제되었습니다.<br>
<a href="getSession.jsp">확인</a>
</body>
</html>