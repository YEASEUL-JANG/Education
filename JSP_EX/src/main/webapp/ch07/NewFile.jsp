<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
 MemberDTO dto = new MemberDTO();
 dto.setUserid("kim");
 dto.setName("홍길동");
 request.setAttribute("dto",dto);//리퀘스트에 저장
 
 MemberDTO dto2 = new MemberDTO();
 dto2.setUserid("shin");
 dto2.setName("신사임당");
 session.setAttribute("dto",dto2);//세션에 저장
 
%>
<table border="1">
<tr>
<td>request dto값</td><td><%=request.getAttribute("dto") %></td>
</tr>
<tr>
<td>session dto값 </td><td><%=session.getAttribute("dto") %></td>
</tr>
<tr>
<td>request영역 </td><td>${requestScope.dto}</td>
</tr>
<tr>
<td>session영역 </td><td>${sessionScope.dto}</td>
</tr>
<tr>
<td>아이디(request) </td><td>${dto.getUserid() }</td><!-- requestScope.가 기본값이라 생략가능 -->
</tr>
<tr>
<td>아이디(request) </td><td>${dto.userid }</td>
</tr>
<tr>
<td>아이디(session) </td><td>${sessionScope.dto.getUserid() }</td>
</tr>
<tr>
<td>아이디(session) </td><td>${sessionScope.dto.userid }</td>
</tr>
</table>
</body>
</html>