<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script type="text/javascript">
function memo_view(idx){
	//REST(Representational state transfer)방식, 또는 RESTful한 URI방식
	location.href="${path}/memo/view/"+idx;
	//게시물로 고유한 주소값을 가짐. 게시물 하나가 요정 url 주소 1개값
	//jsp에서는 파라미터가 바뀔뿐이지 주소가 바뀌는 것은 아니었음. 
}

</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>메모장</h2>
<form action="${path }/memo/insert.do" method="post">
 이름 : <input name="writer" size="10"><br>
 메모 : <input name="memo" size="40" id="memo">
 <input type="submit" value="확인">
</form>
<table border="1">
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>메모</th>
		<th>날짜</th>
	</tr>
<c:forEach var="row" items="${list}">
	<tr>
		<td>${row.idx}</td>
		<td>${row.writer}</td>
		<td><a href="#" onclick="memo_view('${row.idx}')">${row.memo}</a></td>
		<td><fmt:formatDate value="${row.post_date}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
		
	</tr>
</c:forEach>		
</table>
</body>
</html>