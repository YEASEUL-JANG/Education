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

String cars=request.getParameter("cars");
String name="";
/*switch(cars){
case "bmw": name="BMW"; break;
case "benz" : name="Benz"; break;
case "hyundai" : name="현대"; break;
case "kia" : name="기아"; break;*/

if(cars.equals("bmw")) {name="BMW";}
else if(cars.equals("benz")){ name="Benz";}
else if(cars.equals("hyundai")){ name="현대";}
else if(cars.equals("kia")) {name="기아";}

%>

선택한 차량 : <%= name %>




</body>
</html>