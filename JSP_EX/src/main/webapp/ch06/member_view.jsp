<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btnUpdate").click(function(){
		//폼에 있는 데이터를 제출할 주소처리
		document.form1.action = "/jsp02/member_servlet/update.do";
		document.form1.submit();
	});
	$("#btnDelete").click(function(){
		if(confirm("삭제하시겠습니까?")){
		//폼에 있는 데이터를 제출할 주소처리
		document.form1.action = "/jsp02/member_servlet/delete.do";
		document.form1.submit();
	}
	});
});
</script>
</head>
<body>
<%
MemberDTO dto = (MemberDTO)request.getAttribute("dto");
%>

<form name="form1" method="post">
<table>
 <tr>
 <td>아이디</td>
 <td><%= dto.getUserid() %></td>
 </tr>
 <tr>
 <td>비밀번호</td>
 <td><input type="password" name="passwd" value="<%= dto.getPasswd() %>"></td>
 </tr>
  <tr>
 <td>회원가입일자</td>
 <td><%= dto.getJoin_date() %></td>
 </tr>
 <tr>
 <td>이름</td>
 <td><input name="name" value="<%= dto.getName() %>"></td>
 </tr>
  <tr>
 <td>이메일</td>
 <td><input name="email" value="<%= dto.getEmail() %>"></td>
 </tr>
 <tr>
 <td>번호</td>
 <td><input name="hp" value="<%= dto.getHp() %>"></td>
 </tr>
 <tr>
 <td>우편번호</td>
 <td><input name="zipcode" value="<%= dto.getZipcode() %>"></td>
 </tr>
 <tr>
 <td>기본주소</td>
 <td><input name="address1" value="<%= dto.getAddress1() %>"></td>
 </tr>
 <tr>
 <td>상세주소</td>
 <td><input name="address2" value="<%= dto.getAddress2() %>"></td>
 </tr>
 <tr>
 <td colspan ="2" align="center">
 <!-- primary키 기준으로 실행되기 때매 값을 같이 보낸다.(hidden) -->
 <input type="hidden" name="userid" value="<%= dto.getUserid() %>"></td>
 <button type="button" id="btnUpdate">수정</button>
 <button type="button" id="btnDelete">삭제</button>
 </tr>
</table>
</form>

</body>
</html>