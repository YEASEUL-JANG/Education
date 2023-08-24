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

<!-- 폼태그에 액션url을 생략하면 자신페이지가 호출되어 실행된다. -->
<form method="get">
이름 : <input name="name" value="${param.name }">
<input type="submit" value="확인">
</form>

이름 : ${param.name }
</body>
</html>