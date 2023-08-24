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
Cookie cookie = new Cookie("id","kim");
Cookie cookie2 = new Cookie("pwd","1234");
Cookie cookie3 = new Cookie("name","김철수");
Cookie cookie4 = new Cookie("email","kim@gmail.com");

response.addCookie(cookie);
response.addCookie(cookie2);
response.addCookie(cookie3);
response.addCookie(cookie4);
%>
<a href="myCookie_result.jsp">결과확인</a>

</body>
</html>