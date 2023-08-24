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
<h2>세션의 유효시간</h2>
<%
//코드로 세션유효시간값을 변경
session.setMaxInactiveInterval(300);//5분으로 변경
int timeout=session.getMaxInactiveInterval();//세션의 유효시간값을 알아보는 메서드
out.println(timeout);//초단위로 나옴 30*60

%>

</body>
</html>