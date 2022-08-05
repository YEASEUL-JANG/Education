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
<h2>forEach문</h2>
<c:forEach var="i" items="${map }">
	${i.key } : ${i.value }<br>
</c:forEach>

<h2>EL방식</h2>
아이디 : ${map["아이디"] }<br>
이름 : ${map["이름"] }<br>
비밀번호 : ${map["비밀번호"] }<br>
이메일 : ${map["이메일"] }<br>
전화 : ${map["전화"] }<br>
</body>
</html>