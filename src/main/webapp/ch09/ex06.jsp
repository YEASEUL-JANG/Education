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
<%@ page import="java.util.Date" %>
<%
Date date = new Date();
out.println(date+"<br>");
%>
<!-- 날짜표현 -->
<c:set var="date" value="<%=date %>"></c:set>
${date }<br>
<fmt:formatDate value="${date }"/><br> <!-- 2022.08.08 -->
<fmt:formatDate value="${date }" type="date"/><br> <!-- 2022.08.08 -->
<fmt:formatDate value="${date }" type="time"/><br> <!-- 오후 5:03:18 -->
<fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm:ss"/><br> <!-- 2022-08-08 17:03:54 -->
<hr>
<!-- 숫자표현 -->
<c:set var="num" value="123456789.12"/>
${num }<br>
<fmt:formatNumber value="${num }" groupingUsed="true"/><br><!--천단위로 잘라서 표현해줌 123,456,789.12 -->
<fmt:formatNumber value="${num }" pattern="#,####.#"/><br><!--1,2345,6789.1 -->
<fmt:formatNumber value="${num }" pattern="###,###.000"/><br><!--123,456,789.120 -->
</body>
</html>