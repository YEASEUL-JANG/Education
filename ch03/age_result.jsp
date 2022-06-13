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
int year=Integer.parseInt(request.getParameter("year"));
int age=2022-year;
String a="";
if(age<19){a="미성년자";}
else if(age<40){a="MZ세대";}
else if(age<50){a="486세대";}
else if(age<60){a="386세대";}
else {a="old세대";}
%>

<%= name %>님의 나이는 <%= age %>세 입니다.<br>
당신은 <%= a %>입니다.
</body>
</html>