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
String id = "kim@nate.com";
String passwd="1234";
int age=20;
double height=170.5;
//세션은 쿠키와 드리게 자료형의 제한이 없다. 인코딩도 안해도 됨

session.setAttribute("id", id);//("String","Object")
session.setAttribute("passwd", passwd);
session.setAttribute("age", age);
session.setAttribute("height", height);

%>
세션변수가 저장되었습니다.
<a href="getSession.jsp">확인하러가기</a>
</body>
</html>