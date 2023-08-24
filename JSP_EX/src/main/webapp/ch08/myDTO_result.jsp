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
아이디 : ${dto.userid }<br>
이름 : ${dto.name }<br>
비번 : ${dto.passwd }<br>
이메일 : ${dto.email }<br>
전화 : ${dto.hp }<br>
</body>
</html>