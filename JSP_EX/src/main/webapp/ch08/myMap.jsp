<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<%@page import="java.util.HashMap"%>
<%
HashMap<String,String> map = new HashMap<>();
map.put("아이디", "kim");
map.put("이름", "김철수");
map.put("비밀번호", "1234");
map.put("이메일", "kim@gmail.com");
map.put("전화", "010-1234-5678");
%>
<c:set var ="map" value="<%=map %>" scope="request" />
<jsp:forward page="myMap_result.jsp"></jsp:forward>
</body>
</html>