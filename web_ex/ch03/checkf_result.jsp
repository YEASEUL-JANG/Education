<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 체크박스로 넘어온 값은 여러개의 값을 담고있기때문에 배열로 처리하며, 
배열은 request.getParameterValues로 처리한다. 
일반값(한개) 은 request.getParameter-->

<%
request.setCharacterEncoding("utf-8");
String[] fruits= request.getParameterValues("fruits");

if(fruits != null){
	for( int i=0; i<fruits.length; i++){
		out.println(fruits[i]+"<br>");
	}
}else{
	out.println("체크를하세요");
}

%>



</body>
</html>