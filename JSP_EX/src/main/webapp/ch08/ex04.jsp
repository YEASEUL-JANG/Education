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
<%-- <%
session.setAttribute("name","김길동");
session.setAttribute("age",25);
session.setAttribute("job","DBA");
session.setAttribute("addr","서울 강남구 역삼동");
%> --%>
<c:set var="name" value="김길동" scope="session"/>
<c:set var="age" value="25" scope="session"/>
<c:set var="job" value="DBA" scope="session"/>
<c:set var="addr" value="서울 강남구 역삼동" scope="session"/>

세션변수가 생성되었습니다.
<a href="ex04_result.jsp">확인</a>


</body>
</html>