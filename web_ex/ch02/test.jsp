<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- jsp지시어(page directive)
    jsp(java server pages의 약어 (서버에서 실행되는 자바 웹페이지 html+java 혼재) 
    java이기 때문에 컴파일이 필요 => apache-tomcat 웹서버가 java코드를 컴파일 함.
    => html로 변환 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //자바코드영역으로 선언함(스크립틀릿)
	int sum = 0;
	for(int i=1;i<=10; i++){
		sum= sum+i;
	}
	//out: 내장객체(웹브라우저에 출력한다(콘솔x))
	out.println(sum);
%>

<%
for(int i=6; i>=1; i--){
	out.println("<h"+i+">문자열테스트</h"+i+">");
}
%>



</body>
</html>