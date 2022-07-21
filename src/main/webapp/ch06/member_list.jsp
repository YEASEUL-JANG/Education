<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Map" %>
    <%@ page import="java.util.List" %>
    <%@ page import="member.MemberDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
function view(userid){
	document.form1.userid.value = userid; //들어온 아이디를 히든 폼 안으로 보낸다.
	document.form1.submit();
}

</script>
</head>
<body>
<%
Map<String,Object> map = (Map<String,Object>)request.getAttribute("map");
List<MemberDTO> list = (List<MemberDTO>)map.get("list");
int count = (int)map.get("count");
%>

등록회원수 : <%= count %>명<br>
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
<% for(MemberDTO dto : list){ %>
<tr> <!--수정삭제를 할때는 primary키를 중심으로 진행한다.(중복값 오류예방)  -->
<td><a href="#" onclick="view('<%=dto.getUserid() %>')"><%= dto.getName() %></a></td>
<td><%= dto.getUserid() %></td>
<td><%= dto.getJoin_date() %></td>
<td><%= dto.getEmail() %></td>
<td><%= dto.getHp() %></td>
<td><%= dto.getZipcode() %></td>
<td><%= dto.getAddress1() %></td>
<td><%= dto.getAddress2() %></td>
</tr>
<%} %>
</table>

<form name="form1" method="post" action="/jsp02/member_servlet/view.do">
 <input type="hidden" name="userid"><!--사용자 몰래 중요한 정ㅂ조를 보냄  -->
</form>


</body>
</html>