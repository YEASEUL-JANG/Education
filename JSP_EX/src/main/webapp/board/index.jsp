<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<c:redirect url="/board_servlet/list.do"></c:redirect>
<!--response.sendRedirext(request.getContextPath()+"/board_servlet/list.do")와 같음  -->
</body>
</html> 