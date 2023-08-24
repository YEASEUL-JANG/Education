<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="common.Util" %>
    <%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../include/jquery-3.3.1.min.js"></script>
</head>
<body>

<%
String count=Util.getCookie(request.getCookies(), "count");
int intCount=0;

//방문시간값 저장
Date date = new Date();
long now_time = date.getTime();//현재시간 저장(1970년1월1일부터 현재까지의 초)
//쿠키변수
String visitTime = Util.getCookie(request.getCookies(), "visit_time");
/* out.println(visitTime+"<br>");//리턴받은 방문시각값 출력
out.println(visitTime.getClass().getSimpleName()+"<br>");//visitTime의 데이터타입 확인 */

long visit_time=0;//String 타입으로 return받은 방문시각을 계산할 수 있는 변수로 준비

//방문시각(visitTime)이 null이아니고 빈문자열이 아닐때(값이 있다면)
if(visitTime!=null && !visitTime.equals("")){
	visit_time = Long.parseLong(visitTime);//계산을 위해 String을 long으로 변환
}
out.print("현재시각 : "+now_time+"<br>");
out.print("방문시각 : "+visit_time+"<br>");



if(count==null||count.equals("")){//페이지가 첫방문일경우
	//쿠키변수 생성
	response.addCookie(new Cookie("count","1"));
	//첫방문 시간 저장
	response.addCookie(new Cookie("visit_time",Long.toString(now_time)));
}else{//재방문일 시
	//방문시간 변경
	long period = now_time - visit_time;//방문시간=현재시간-이전방문시간
	
	intCount = Integer.parseInt(count)+1;
	//조회수 방지를 위한 조건설정
	if(period>5*1000){//24*60*60*1000:하루, 일정시간이 경과하면 카운터 수정
	//카운터값 변경(스트링값으로)
	response.addCookie(new Cookie("count",Integer.toString(intCount)));
	//방문시간 업데이트
	response.addCookie(new Cookie("visit_time",Long.toString(now_time)));
	}
}

/*String counter = Integer.toString(intCount);//숫자->문자
out.println("첫번째(인덱스 0) 숫자 : "+ counter.charAt(0)+"<br>");
String img = "<img src='../images/"  +counter.charAt(0)+  ".gif'>";
out.println(img);
out.println("<br>");

for(int i=0;i<counter.length(); i++){
	String img3 = "<img src='../images/"  +counter.charAt(i)+  ".gif'>";
	out.println(img3);
}*/


%>
방문횟수 : <%= intCount %>

</body>
</html>