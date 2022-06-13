<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 이름은 <%= request.getParameter("name") %> 입니다. <br>
나이는 <%= request.getParameter("age") %> 입니다.<br>
<!-- http://localhost/web01/ch03/queryStringTest.jsp?name=kim&age=30 
 : 쿼리스트링은 get방식으로 헤더에 데이터 전달함. -->
 
 
 
</body>
</html>