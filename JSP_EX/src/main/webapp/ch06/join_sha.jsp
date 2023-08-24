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
	$("#btnSave").click(function(){
		insert();
	});
});
function insert(){
	var param = "userid="+$("#userid").val()+"&passwd="+$("#passwd").val()
	+"&name="+$("#name").val()+"&email="+$("#email").val()+"&hp="+$("#hp").val()
	+"&zipcode="+$("#zipcode").val()+"&address1="+$("#address1").val()+"&address2="+$("#address2").val(); //값을 쿼리스트링방식으로 보냄
	
	$.ajax({//request영역으로 보냄.
		type : "post",
		url : "/jsp02/member_servlet/join_sha.do",
		data : param,
		success : function(){//받아올 값은 없음
			list();//갱신
			$("#userid").val("");//값초기화
			$("#passwd").val("");
			$("#name").val("");
			$("#email").val("");
			$("#hp").val("");
			$("#zipcode").val("");
			$("#address1").val("");
			$("#address2").val("");
		}
		
	});
}
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
<h2>회원가입(SHA256)</h2>
아이디 : <input id="userid"><br>
비밀번호 : <input type="password" id="passwd"><br>
이름 : <input id="name"><br>
이메일 : <input id="email"><br>
폰 : <input id="hp"><br>
우편번호 : <input id="zipcode"><br>
기본주소 : <input id="address1"><br>
상세주소 : <input id="address2"><br>
<button type="button" id="btnSave">추가</button>

<div id="memberList">

</div>
</body>
</html>