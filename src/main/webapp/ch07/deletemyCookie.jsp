<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>

<%Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(int i=0;i<cookies.length;i++){
		cookies[i].setMaxAge(0);
		response.addCookie(cookies[i]);
	}
} %>
<a href="myCookie_result.jsp">결과확인</a>
</body>
</html>