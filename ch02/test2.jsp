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
int a=10;
int b=20;
out.println(a+b);

String name = "김철수";
int age=20;
out.println("<br>" + name+"의 나이 : "+age+"<br>");
//println은 줄바꿈처리 안됨 (웹), <br>, <p>등을 활용해 줄바꿈 처리한다.
//자바태그내에서 <br>만 쓰면 에러, 반드시 out.println()문 내에서 처리함.
out.print("100"+"200"+"<br>");
out.print(100+200+"<br>");
out.println(100+"200"+"<br>");

%>




</body>
</html>