<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl은 import문 모두 필요없다. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function view(userid){
	document.form1.userid.value = userid; //들어온 아이디를 히든 폼 안으로 보낸다.
	document.form1.submit();
}

</script>
</head>
<body>
등록회원수 :${map.count }명<br>
<table border="1" width="100%">
<tr>
<th>이름</th>
<th>아이디</th>
<th>가입일자</th>
<th>이메일</th>
<th>핸드폰</th>
<th>우편번호</th>
<th>기본주소</th>
<th>상세주소</th>
</tr>
<c:forEach var="dto" items="${map.list }">
<tr>
<td><a href="#" onclick="view('${dto.userid}')">${dto.name }</a></td>
<td>${dto.userid }</td>
<td>${dto.join_date }</td>
<td>${dto.email }</td>
<td>${dto.hp }</td>
<td>${dto.zipcode }</td>
<td>${dto.address1 }</td>
<td>${dto.address2 }</td>
</tr>
</c:forEach>
</table>

<form name="form1" method="post" action="/jsp02/member_servlet/view.do">
 <input type="hidden" name="userid"><!--사용자 몰래 중요한 정보를 보냄  -->
</form>


</body>
</html>