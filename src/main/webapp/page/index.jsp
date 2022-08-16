<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<%@ include file="../include/header.jsp" %>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {//페이지가 로딩되자마자 자동 실행
	list('1');//1페이지란뜻,
});

function list(curPage){
	var param="curPage="+curPage;
	$.ajax({
		type: "post",
		url: "${path}/page_servlet/list.do",
		data: param,
		success: function(result){//콜백함수(서버의 응답 처리)
			$("#result").html(result);
		}
	});
	
}
</script>
</head>
<body>
<h2>페이지 나누기</h2>
<div id="result"></div>
</body>
</html>