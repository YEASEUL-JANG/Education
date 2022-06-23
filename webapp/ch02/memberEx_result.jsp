<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String id=request.getParameter("id");
String password=request.getParameter("password");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
%>

<h3>고객정보</h3>
<table border="1">
 <tr>
  <td>아이디</td>
  <td><%= id %></td>
 </tr>
 <tr>
  <td>비밀번호</td>
  <td><%= password %></td>
 </tr>
 <tr>
  <td>이름</td>
  <td><%= name %></td>
 </tr>
 <tr>
  <td>이메일</td>
  <td><%= email %></td>
 </tr>
 <tr>
  <td>전화번호</td>
  <td><%= phone %></td>
 </tr>

</table>

</body>
</html>