<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie_login</title>
<script src="../include/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
//저장된 쿠키를 검사(저장된 여러개 쿠키중 들어오는 이름의 값 찾기 메서드)
function getCookie(cname) {
	console.log(cname);
	let cookie = document.cookie + ";";
	console.log(cookie);
	let idx = cookie.indexOf(cname);//이름을 찾지못하면 -1반환, 찾으면 이름의 첫번째 인덱스 반환
	console.log(idx);
	let val = "";
	if (idx != -1){//이름이 저장되어 있으면
		console.log(idx + "," + cookie.length);
		//showCookies=값; userid=값; 을 substring으로 발췌함
		cookie = cookie.substring(idx, cookie.length);//이름=값;
		begin = cookie.indexOf("=") + 1;//값의 첫번째 인덱스
		end = cookie.indexOf(";", begin);//값의 첫번째 인덱스부터 시작하여 ;을 찾는다.
		console.log(begin + ","+ end);
		val = cookie.substring(begin, end);//찾는 이름의 값만 저장됨.
	}
	return val;
}

//setCookie(쿠키변수명, 쿠키값, 유효날짜)
function setCookie(name, value, days){
	var today = new Date();
	//쿠키의 유효시간 설정
	today.setDate(today.getDate() + days);
	//쿠키변수명=쿠키값;path=저장경로;expires=쿠키유효기간;
	document.cookie = name + "=" + value + ";path=/jsp02;expires="+today.toUTCString()+";";
}

function saveCookie(id){
	if(id != ""){//아이디저장체크
		setCookie("userid", id, 7);//7일
	}else{//아이디저장 미체크
		setCookie("userid", id, -1);//삭제
	}
}

//메인
$(function(){
	//팝업창 열기
	var show = getCookie("showCookies");
	if(show != "Y"){//N일때
		window.open("popup.jsp", "", "width=300,height=400");
	}
	//저장된 쿠키 조회
	var cookie_userid = getCookie("userid");
	//저장된 쿠키가 있으면
	if(cookie_userid != ""){
		$("#userid").val(cookie_userid);
		//html방식으로 체크박스에 체크상태로 설정
		$("#chkSave").attr("checked", 'checked');
	}
	//로그인 버튼 클릭
	$("#btnLogin").click(function() {
		if($("#chkSave").is(":checked")){//check
			saveCookie($("#userid").val());
		}else{//uncheck
			saveCookie("");
		}
		alert("로그인 처리 되었습니다.");
	});
	
	//쿠키삭제(기존파일 활용)
	$("#btnDelete").click(function() {
		location.href="deleteCookie.jsp";
	});
	
	//아이디 저장 클릭
	$("#chkSave").click(function() {
		if($("#chkSave").is(":checked")){//체크박스에 체크가 되어있다면
			if(!confirm("로그인 정보를 저장하시겠습니까?")){
				$("#chkSave").prop("checked", true);//자바스크립트방식으로 체크박스에 체크상태로 기억
				//.prop( propertyName, value ) : 속성값을 추가한다.
				//.prop()는 지정한 선택자를 가진 첫번째 요소의 속성값을 가져오거나 속성값을 추가한다.
				//주의할 점은 HTML 입장에서의 속성(attribute)이 아닌 JavaScript 입장에서의 속성(property)이라는 것.
			}
		}
	});
});
</script>
</head>
<body>
<form method="post" name="form1">
 <table border="1">
  <tr>
   <td>아이디</td>
   <td>
    <input name="userid" id="userid">
    <input type="checkbox" id="chkSave">아이디 저장
   </td>
  </tr>
  <tr>
   <td>비밀번호</td>
   <td><input type="password" name="passwd"> </td>
  </tr>
  <tr>
   <td colspan="2" align="center">
     <input type="button" value="로그인" id="btnLogin">
     <input type="button" value="쿠키삭제" id="btnDelete">
   </td>
  </tr>
 </table>
</form>
</body>
</html>