<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<!-- ckeditor js파일 연결 -->
<script src="${path }/ckeditor/ckeditor.js"></script>
<script type="text/javascript">
function product_delete(){
	/* if(confirm("삭제하시겠습니까?")){
		document.form1.action="${path}/shop/product/delete.do";
		document.form1.submit();
	} */
	//위의 코드를 난독화
	function _0x1bde(_0x784b53,_0x5b9dc3){
		var _0x2bf4e5=_0x2bf4();return _0x1bde=
			function(_0x1bde99,_0x1b75bd){_0x1bde99=_0x1bde99-0x139;
			var _0x12506e=_0x2bf4e5[_0x1bde99];return _0x12506e;
			},_0x1bde(_0x784b53,_0x5b9dc3);}var _0x4c9361=_0x1bde;
			(function(_0x47fe22,_0x3eb799){var _0x552d49=_0x1bde,_0x35c941=_0x47fe22();
			while(!![]){try{
				var _0x4a7420=-parseInt(_0x552d49(0x13c))/0x1*(-parseInt(_0x552d49(0x13b))/0x2)+parseInt
				(_0x552d49(0x13e))/0x3*(-parseInt(_0x552d49(0x146))/0x4)+-parseInt(_0x552d49(0x13f))
				/0x5*(-parseInt(_0x552d49(0x147))/0x6)+parseInt(_0x552d49(0x143))/0x7+parseInt
				(_0x552d49(0x145))/0x8+parseInt(_0x552d49(0x13d))/0x9+-parseInt(_0x552d49(0x142))
				/0xa*(parseInt(_0x552d49(0x139))/0xb);if(_0x4a7420===_0x3eb799)break;
				else _0x35c941['push'](_0x35c941['shift']());}
			catch(_0x5599d0){_0x35c941['push'](_0x35c941['shift']());}}}(_0x2bf4,0x41ece));
			function _0x2bf4(){var _0xcc7d05=
				['form1','9701080sZZsAX','2116919kwgkAy','action','1966528hTGwMx','176wuzQKv','1662TlxCjq','11BMJUrq','submit','44PPJujP','19687GjXvBs','2714544iVrXGG','27831pErFxQ','6595dpHmnl','/spring02/shop/product/delete.do'];
			_0x2bf4=function(){return _0xcc7d05;};return _0x2bf4();
			}confirm('삭제하시겠습니까?')&&(document[_0x4c9361(0x141)][_0x4c9361(0x144)]
			=_0x4c9361(0x140),document[_0x4c9361(0x141)][_0x4c9361(0x13a)]());
}
//상품 수정
function product_update(){
  //태그를 name으로 조회할 경우(계층구조로 접근)
	//var product_name=document.form1.product_name.value;
	//태그를 id로 조회할 경우
	var product_name=$("#product_name").val();
	var price=$("#price").val();
	var description=$("#description").val();
	if(product_name==""){//빈값이면
		//문자열 비교 : java는 a.equals(b), javascript는 a==b
		alert("상품이름을 입력하세요");
		$("#product_name").focus();//입력포커스 이동
		return;//리턴값없이 함수 종료
	}
	if(price==""){
		alert("가격을 입력하세요");
		$("#price").focus();//입력포커스 이동
		return;//리턴값없이 함수 종료
	}
	if(description==""){
		alert("상품설명을 입력하세요");
		$("#description").focus();//입력포커스 이동
		return;//리턴값없이 함수 종료
	}
	document.form1.action="${path}/shop/product/update.do";
	document.form1.submit();
}
</script>
</head>
<body>
<%@ include file="../include/admin_menu.jsp" %>
<h2>상품 정보 편집</h2>
<form name="form1" method="post" enctype="multipart/form-data">
<table>
 <tr>
  <td>상품명</td>
  <td><input name="product_name" id="product_name" value="${dto.product_name}"> </td>
 </tr>
 <tr>
  <td>가격</td>
  <td><input name="price" id="price" value="${dto.price}"> </td>
 </tr>
 <tr>
  <td>상품설명</td>
  <td>
   <textarea rows="5" cols="60" name="description" id="description">${dto.description}</textarea>
  <script type="text/javascript">
   //id가 description인 태그에 ckeditor를 적용하겠다.
   CKEDITOR.replace("description",{
	   filebrowserUploadUrl: "${path}/imageUpload.do"
   });
   
   </script>
  </td>
 </tr>
 <tr>
  <td>상품이미지</td>
  <td>
   <img src="${path}/images/${dto.picture_url}" width="300px" height="300px"> <br>
   <input type="file" name="file1" id="file1">
  </td>
 </tr>
 <tr>
  <td colspan="2" align="center">
  <!-- 수정,삭제에 필요한 상품코드값을 hidden 태그로 넘김 -->
   <input type="hidden" name="product_id" value="${dto.product_id}">
   <input type="button" value="수정" onclick="product_update()">
   <input type="button" value="삭제" onclick="product_delete()">
   <input type="button" value="목록" onclick="location.href='${path}/shop/product/list.do'">
  </td>
 </tr>
</table>
</form>
</body>
</html>
