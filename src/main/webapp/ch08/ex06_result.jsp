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
<%@page import="java.util.HashMap"%>
<%
HashMap<String,String> map = (HashMap<String,String>)request.getAttribute("map");
for(String str:map.keySet()){//키셋은 키값을 배열로 만들어 가져온다.
	out.println(str+":"+map.get(str)+"<br>");//map.get("키"), map.set("키","값")
}
%>
<hr>
<c:forEach var="str" items="${map}">
  ${str.key} : ${str.value}<br>
</c:forEach>
<hr>
${map["포도"] }<br><!-- 변수["속성"]:키값이 한글일 때 -->
${map["사과"] }<br>
${map["오렌지"] }<br>
${map["메론"] }<br>

<hr>
<c:forEach var="fruit" items="${requestScope.map }">
${fruit }<br>
</c:forEach>
</body>
</html>