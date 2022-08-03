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
<%
//전체쿠키삭제
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(int i=0;i<cookies.length;i++){
		cookies[i].setMaxAge(0);//바로삭제
		response.addCookie(cookies[i]);//응답헤더에 추가
	}
}
//개별쿠키삭제
/* Cookie cookie = new Cookie("userid","");
cookie.setMaxAge(0);
response.addCookie(cookie);  */
%>
쿠키가 삭제되었습니다.
<a href="useCookie.jsp">쿠키확인</a>
</body>
</html>