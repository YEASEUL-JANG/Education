<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<%
String context = request.getContextPath();
response.sendRedirect(context+"/guestbook_servlet/list.do");
%>
</body>
</html>