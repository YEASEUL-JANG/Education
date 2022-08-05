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
<%-- <%@page import="member.MemberDTO"%>
<%
MemberDTO dto = (MemberDTO)request.getAttribute("dto");
if(dto != null){
	out.print("이름 : "+dto.getName()+"<br>");
	out.print("아이디 : "+dto.getUserid()+"<br>");
	out.print("비밀번호 : "+dto.getPasswd()+"<br>");
}else{
	out.println("출력값이 없습니다.");
	
}
%> --%>
이름 : ${dto.name }<br> <!-- requestScope.dto.name -->
아이디 : ${dto.userid }<br>
비밀번호 : ${dto.passwd }<br>

</body>
</html>