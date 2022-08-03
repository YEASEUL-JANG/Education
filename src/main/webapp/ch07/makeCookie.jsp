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
<%@ page import="java.net.URLEncoder" %>
<%
//쿠키생성 : new Cookie("쿠키변수명","값") *주의점 : 값은 String 타입만가능
Cookie cookie = new Cookie("id","kim");
Cookie cookie2 = new Cookie("pwd","1234");
Cookie cookie3 = new Cookie("name","김철수");
Cookie cookie4 = new Cookie("age","20");
//쿠키의 유효시간 설정
//cookie.setMaxAge(10); : 10초후에 데이터 삭제됨

response.addCookie(cookie);//응답헤더에 쿠키를 추가함
response.addCookie(cookie2);
response.addCookie(cookie3);
response.addCookie(cookie4);
%>
쿠키가 생성되었습니다.<br>
<a href="useCookie.jsp">쿠키확인</a>

</body>
</html>