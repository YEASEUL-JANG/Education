<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<%
ArrayList<String> items = new ArrayList<>();
items.add("오렌지");
items.add("사과");
items.add("포도");
items.add("딸기");
request.setAttribute("items", items);
%>
<jsp:forward page="ex05_result.jsp"></jsp:forward>
<!-- 포워딩방식 : 주소가 고정(첫 시작페이지값), 대량의 데이터 전달 가능, 컨텍스트패스값이 포함
sendRedirect: 주소가 변경, 소량의 데이터, 컨텍스트패스값을 추가해줘야함. -->

</body>
</html>