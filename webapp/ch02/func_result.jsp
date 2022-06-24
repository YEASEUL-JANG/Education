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
String name= request.getParameter("name");
//해킹을 당해자바스크립트는 코드가 노출됨
if(name == null || name.equals("")){
%>
<script type="text/javascript">
alert("이름을 입력하세요");
location.href="func.html";
</script> 
<%
}
String position= request.getParameter("position");
String str = name+" "+position + "님의 방문을 환영합니다.";
out.print(str); //웹브라우저에 출력
System.out.println(str); //톰캣콘솔에 출력됨
%>

</body>
</html>