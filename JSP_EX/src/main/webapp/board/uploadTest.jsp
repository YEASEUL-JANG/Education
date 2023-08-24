<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadTest</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>
<h2>파일 업로드 테스트</h2>
<!--파일 업로드 시 method는 post, enctype="multipart/form-data" 속성 꼭 지정(파일 업로드 타입을 지정)  -->
<form name="form1" method="post" enctype="multipart/form-data" action="upload_result.jsp">
이름 : <input name="name"><br>
제목 : <input name="subject"><br>
파일1 : <input type="file" name="file1"><br>
파일2 : <input type="file" name="file2"><br>
<input type="submit" value="업로드">

</form>
</body>
</html>