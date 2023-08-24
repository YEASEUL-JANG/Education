<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<!-- EL의 특징 :
jsp에 내장되어 있고 코드가 깔끔하다.
조건문이나 반복문과 같은 제어문 기능이 없다.
간단한 계산(사칙연산)은 가능하다.
JSTL의 특징 : 
외부 라이브러리가 필요.(jar) 제어문 사용이 가능.
 -->
 
 ${2+5 }<br>
 ${4/5 }<br>
 ${7 mod 5 }<br><!-- mod: 나머지연산 -->
 ${2<3 }<br>
 ${3.1 le 3.2 }<br><!-- le: less(작다) -->
 ${(5>3)?5:3 }<br><!--삼항연산자  -->
 
</body>
</html>