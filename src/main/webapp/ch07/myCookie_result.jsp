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
아이디 : ${cookie.id.value}<br>
비번 : ${cookie.pwd.value}<br>
이름 : ${cookie.name.value}<br>
이메일 : ${cookie.email.value}<br>

<a href="deletemyCookie.jsp">쿠키삭제</a>

</body>
</html>