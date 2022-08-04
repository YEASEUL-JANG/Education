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
	   let d = new Date();
	   d.setTime(d.getTime()+(days * 24 * 60 * 60 * 1000));//초로 설정(현재시간+만료시간)
	   //d.setHours(24);//시간으로 설정하는 방법
	   //d.setDate(d.getDate()+days);//날짜로 설정하는 방법
	   let expires = "expires=" + d.toUTCString();//설정한 시간을 쿠키유효시간값으로 설정
	   document.cookie = cname + "=" + cvalue + ";" + expires;//showCookies="Y"; expires=만료일자;
	   window.close();//현재 창 닫기
}
 
$(function() {
	$("#close").click(function() {
		let now = new Date();
		let val = "";
		if($("#nopopup").is(":checked")){//체크 상태이면
			val = "Y";//7일간 팝업 안함
		}else{
			val = "N";
		}
		setCookie("showCookies", val, 7);
	});
}); 
</script>

</head>
<body>
 <input type="checkbox" id="nopopup"> 7일간 보이지 않기
 <input type="button" id="close" value="닫기">
</body>
</html>