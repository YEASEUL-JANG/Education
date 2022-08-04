<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<%
/* String id = (String)session.getAttribute("id"); */
//Enumeration을 활용하면 세션의 ket set을 가져올 수 있다.
Enumeration<String> attr=session.getAttributeNames();
while(attr.hasMoreElements()){//다음요소가 있을 때
	String key = attr.nextElement();//다음요소를 읽음
	Object ob = session.getAttribute(key);
	out.println("변수명 : "+key+", 값 : "+ob+"<br>");
}
String id=(String)session.getAttribute("id");
String passwd=(String)session.getAttribute("passwd");
int age =0;
//숫자같은경우는 nullpointException이 자주나기 때문에 if문으로 한번 조건을 걸어주는것이 좋다.
if(session.getAttribute("age") != null){
	age=(int)session.getAttribute("age");
}
double height=0;
if(session.getAttribute("height") != null){
	height=(double)session.getAttribute("height");
}
%>

<hr>
아이디 : <%= id %><br>
나이 : <%= age %><br>
키 : <%= height %><br>
비밀번호 : <%= passwd %><br>
<hr>
[EL로 출력하기] <br>
아이디 : ${sessionScope.id}<br>
나이 : ${sessionScope.age}<br>
키 : ${sessionScope.height}<br>
비밀번호 : ${sessionScope.passwd}<br>

<a href="deleteSession.jsp">세션삭제</a>
</body>
</html>