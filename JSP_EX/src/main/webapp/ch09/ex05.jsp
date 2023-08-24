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
<%-- <c:redirect url="ex04.jsp?start=3&end=3"> 

 <c:redirect url="ex04.jsp">
  <c:param name="start" value="3"></c:param>
  <c:param name="end" value="5"></c:param>
</c:redirect>--%>

<%
response.sendRedirect("ex04.jsp?start=2&end=5");
%>
</body>
</html>