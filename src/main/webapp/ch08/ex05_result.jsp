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
 <%--    <%@ page import="java.util.ArrayList" %>
<%
ArrayList<String> items = (ArrayList<String>)request.getAttribute("items");
for(String str : items){
	out.println(str+"<br>");
}
%> --%>
<!-- 1) forEach var="변수" begin="시작값  end="끝값"
2) forEach var="개별변수" items="집합변수"-->
<c:forEach var="fruit" items="${requestScope.items }">
 ${fruit }<br>
</c:forEach>

</body>
</html>