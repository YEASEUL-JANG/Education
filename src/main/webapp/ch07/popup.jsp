<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>popup</title>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
/* 1) 유효기간 쿠키생성방법 : document.cookie = "Name=값;Expires"
 * 2) 날짜 추출(반환) : date.getDate() 또는 date.getTime()
   3) 날짜 지정 : date.setDate(설정할 날짜) 또는 date.setTime(설정 초)
 */
function setCookie(cname, cvalue, days){
	   var d = new Date();
	   //만료시간 설정 : (현재시간 + 만료시간)
	   d.setTime(d.getTime()+(days * 24 * 60 * 60 * 1000));//초로 설정
	   //d.setDate(d.getDate()+days);//날짜로 설정하는 방법
	   var expires = "expires=" + d.toGMTString();//쿠키유효시간값
	   document.cookie = cname + "=" + cvalue + ";" + expires;
	   window.close();//현재 창 닫기
}
 
$(function() {
	$("#nopopup").click(function() {
		var now = new Date();
		var val = "";
		if(this.checked == true){//체크 상태이면
			val = "N";//7일간 팝업 안함
		}else{
			val = "Y";
		}
		setCookie("showCookies", val, 7);
	});
}); 
</script>

</head>
<body>
 <input type="checkbox" id="nopopup"> 7일간 보이지 않기
</body>
</html>