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
String name = "홍길동";
out.print("이름: "+name+"<br>");

%>
<!-- "=" 출력용도이며 ;을 쓰지 않는다.=> expression 형태 -->
이름 : <%= name %><br>
이름 : <% out.print(name); %>



</body>
</html>