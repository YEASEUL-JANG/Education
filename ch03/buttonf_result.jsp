<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--String으로 값이 들어옴  -->
<%
int price=Integer.valueOf(request.getParameter("price"));
int amount=Integer.parseInt(request.getParameter("amount"));
int money= price*amount;
%>

가격 : <%= price %><br>
수량 : <%= amount %><br>
금액 : <%= money %>





</body>
</html>