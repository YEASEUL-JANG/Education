<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function winclose(){
	//opener : 팝업창을 오픈한 메인창: popup2(부모창)
	//메인창의 dan값을 팝업창의 dan값으로 변경시킴
	//팝업창도 또 다른 팝업창을 만들 수 있다
	//popup2.html로 가려면 opener.opener.~
	opener.document.getElementById("dan").value = document.form1.dan.value; // 메인창으로 다시 값을 보냄
	window.close();
}


</script>
</head>
<body>
<!-- http://localhost/web02/ch04/gugu.jsp?dan=3 에서의 dan변수를 getPa~("dan") -->
<%
int dan = Integer.parseInt(request.getParameter("dan")); %>
<h2><%=dan %></h2>
<%
for(int i=0;i<=9;i++){
	out.println(dan +"x"+i+"="+dan*i+"<br>");
}
%>
<form name="form1">
메인창에 전달할 값을 입력하세요. <input type="text" name="dan">
<input type="button" value="닫기" onclick="winclose()">
</form>
</body>
</html>