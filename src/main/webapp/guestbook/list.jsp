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
<h2>방명록</h2>
전체글 : ${count }<br>
<c:forEach var="dto" items="${list }">
 <form method="post">
 <table border="1" width="600px">
   <tr>
	<td>이름</td> 
	<td>${dto.name }</td> 
	<td>날짜</td> 
	<td>${dto.post_date }</td> 
  </tr>
    <tr>
	<td>이메일</td> 
	<td colspan="3">${dto.email }</td> 
  </tr>
  <tr>
	<td colspan="4">${dto.content }</td> 
  </tr>
  <tr>
   <td colspan="4">
    비밀번호 <input type="password" name="passwd">
    <input type="submit" value="수정/삭제">
   </td>
  </tr>
 </table>
 </form>
</c:forEach>

</body>
</html>