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
String name=request.getParameter("name");
String job=request.getParameter("job");
int bonus=Integer.parseInt(request.getParameter("bonus"));
int basic=Integer.parseInt(request.getParameter("basic"));
switch(job){
case "사원" : bonus=basic*2; break;
case "주임" : bonus=(int)(basic*2.5);break;
case "과장" : bonus=basic*3;break;
case "부장" : bonus=basic*4;break;
}
int total = (basic*12)+bonus;
int tax = (int)(total *0.03);
int money= total-tax;

%>

이름 : <%= name %> <br>
직급 : <%= job %> <br>
기본급 : <%= String.format("%,d",basic) %> <br>
보너스 : <%= bonus %> <br>
세금 : <%= tax %> <br>
총액 : <%= String.format("%,d",total) %> <br>
<!-- String.format("%,d",money) : 천단위 표시 
%d :정수처리, %f: 실수, %s:문자열, %c:문자-->
실수령 : <%= String.format("%,d",money) %> <br>




</body>
</html>