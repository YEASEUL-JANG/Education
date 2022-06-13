<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="gugu2.jsp">
단을 입력하세요.
<select name="dan">
<%for (int i=2; i<=9;i++){ %>
 <option value="<%= i %>"><%= i %>단</option>
 <%} %>
 
 
 
 </select>
 
 <input type="submit" value="확인">
</form>



</body>
</html>