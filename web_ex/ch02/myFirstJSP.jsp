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
int kor = 85;
int mat = 98;
int eng = 85;
int sum = kor+mat+eng;
int avg = sum/3;
%>
-----------------------------<br>
이름 : <%= name %><br>
국어 : <%= kor %><br>
수학 : <%= mat %><br>
영어 : <%= eng %><br>
총점 : <%= sum %><br>
평균 : <%= avg %><br>
-----------------------------

</body>
</html>