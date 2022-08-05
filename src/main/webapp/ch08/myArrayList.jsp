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
<%@page import="java.util.ArrayList"%>
<%
ArrayList<String> list = new ArrayList<String>();
list.add("아이디");
list.add("이름");
list.add("비번");
list.add("이메일");
list.add("전화");

ArrayList<String> list2 = new ArrayList<String>();
list2.add("kim");
list2.add("김철수");
list2.add("1234");
list2.add("kim@gmail.com");
list2.add("010-1234-5678");
%>
<c:set var ="list" value="<%=list %>" scope="request" />
<c:set var ="list2" value="<%=list2 %>" scope="request" />
<jsp:forward page="myArray_result.jsp"></jsp:forward>
</body>
</html>