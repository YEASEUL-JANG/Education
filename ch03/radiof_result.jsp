<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>radiof_result.jsp</title>
</head>
<body>

<!-- 한글처리 따로 해줘야함 -->

<%
//기본 인코딩(iso-8859-1에서 utf-8로 변경)
request.setCharacterEncoding("utf-8");

String name=request.getParameter("name"); //request라는 객체에서 제공하는 getParameter
String age=request.getParameter("age");
int days=Integer.parseInt(age)*365; //String을 숫자로 변환

String gender=request.getParameter("gender");

//삼항연산자
gender=gender.equals("male")? "남자":"여자";
%>

이름 : <%= name %> <br>
나이 : <%= age %> <br>
성별 : <%= gender %> <br>
살아온 날 : <%= days %>





</body>
</html>