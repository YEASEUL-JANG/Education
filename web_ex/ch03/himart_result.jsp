<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String location= request.getParameter("location");
String product_name= request.getParameter("product_name");
String product_code= request.getParameter("product_code");
int price=Integer.parseInt(request.getParameter("price"));
int amount=Integer.parseInt(request.getParameter("amount"));
String chk=request.getParameter("chk");
int tax=0;
int val=0;
int total=price * amount;

if(chk == null){//과세
	val = (int)(total/1.1);
	tax = total-val;
}else{//비과세
	val = 0;
	tax = 0;
}

%>
지점 : <%= location %><br>
상품명 : <%= product_name %><br>
면세여부 : <%= chk %><br>
가격 : <%= price %><br>
부가세 물품가액 : <%= val %><br>
수량 : <%= amount %><br>
세액 : <%= tax %><br>
총액 : <%= total %><br>
<button type="button" onclick="history.back()">이전화면</button>

</body>
</html>