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
<%--<h2>Java코드</h2>
 <%@ page import="java.util.Enumeration" %>
<%
//request객체의 헤더변수의 집합
//getHeaderNames()는 배열이라서 일반for문으로는 못돌림 
Enumeration<String> headerNames = request.getHeaderNames();
while(headerNames.hasMoreElements()){//다음요소가 있으면
	String key=(String)headerNames.nextElement();//다음요소를 읽음
	String value=request.getHeader(key);//헤더값 조회
	out.print(key+" : "+value+"<br>");
}
%> --%>

<h2>JSTL코드</h2>
<!-- ${header} = request.getHeaderNames()와 같음 -->
<c:forEach var="h" items="${header}">
 ${h.key } => ${h.value }<br>
</c:forEach>

<hr>
<c:set var="browser" value="${header['user-agent']}" scope="page"/>
JSTL출력 : <c:out value="${browser }"/><br>
EL출력 : ${browser }<br>
<hr>
변수 없애기<br>
<c:remove var="browser"/>
<c:out value="${browser }"></c:out> <br>


</body>
</html>