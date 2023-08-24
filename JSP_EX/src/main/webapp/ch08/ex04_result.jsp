<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
이름 : ${sessionScope.name }<br>
주소 : ${sessionScope.addr }<br>
직업 : ${sessionScope.job }<br>
나이 : ${sessionScope.age }<br>
</body>
</html>