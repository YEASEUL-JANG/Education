<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	list();
});
function list(){
	//회원목록을 가져와 div에 출력, 백그라운드로 실행
	$.ajax({
		type : "post",
		url : "/jsp02/member_servlet/list.do",
		success : function(result){
			console.log(result);//f12콘솔에서 확인가능
			$("#memberList").html(result);
		}
	});
};
</script>
</head>
<body>
<h2>회원관리</h2>
<div id="memberList">

</div>
</body>
</html>