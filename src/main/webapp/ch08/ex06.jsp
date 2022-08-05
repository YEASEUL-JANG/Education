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
map.put("포도", "grape");
map.put("사과", "apple");
map.put("메론", "melon");
map.put("오렌지", "orange");
request.setAttribute("map", map);
%>
<jsp:forward page="ex06_result.jsp"></jsp:forward>

</body>
</html>