<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I'm Your Blog</title>
<style type="text/css">
body
{background-color: #f5f5dc;
}
h1{
font-size:50px;}
strong{
font-size:10px;
}
#music{
float: right;
}
#header{
padding: 20px;
margin: 30px;
text-decoration: underline;
}
#nav{
border: 2px dashed #065535;
padding: 20px;
position: absolute;
left: 17%;
width: 1200px;
font-size:20px;
text-decoration: underline;
color: #065535;
}
#sec1{
border-radius: 10px;
background: white;
padding: 15px 20px;
position: absolute;
left: 17%;
top: 400px;
border : 1px dashed black;
}
#sec2{
border-radius: 10px;
background: white;
padding: 25px;
position: absolute;
left: 28%;
top: 650px;
width: 1000px;
border : 1px dashed black;
}

.feeling{
border-radius: 10px;
border : 1px dashed #065535;
background: white;
width: 120px;
height: 170px;
font-size: 12px;
}
#sec1>b{
font-size: 8px;
}


a:link{
text-decoration: none;
color: #065535;
}
a:visited {
 color: #065535; 
 }
a:hover{
	text-decoration: underline;
	color: lime;

</style>
</head>
<body>

<%
request.setCharacterEncoding("utf-8");
String name= request.getParameter("name");
String hobby1= request.getParameter("hobby1");
String hobby2= request.getParameter("hobby2");
String hobby3= request.getParameter("hobby3");
String MBTI= request.getParameter("MBTI");
String food= request.getParameter("food");
String feeling= request.getParameter("feeling");
feeling=feeling.replace("<", "&lt;");
feeling=feeling.replace(">", "&gt;");
feeling=feeling.replace("\n", "<br>");
feeling=feeling.replace("  ", "&nbsp;&nbsp;");
String date=request.getParameter("date");
%>

<div id="music">
<audio autoplay controls> 
 <source src="https://drive.google.com/uc?export=download&id=1qDTFcIx21YbFmlfcJL4FMimFKq4_R9-L" 
 type="audio/mpeg">
브라우저에서 오디오 파일을 지원하지 않습니다.<br>
</audio>
</div>

<div id="header" align="center">
<h1>&nbsp;&#9998;&nbsp;<%= name %>'s Blog 😀</h1>
</div>

<div id="nav" align="right">
<b>
<span><a href="prolog.html">Prolog&nbsp;|&nbsp;</a></span>
<span><a href="#"><%= hobby1 %> 일기&nbsp;|&nbsp;</a></span>
<span><a href="#"><%= hobby2 %> 일기&nbsp;|&nbsp;</a></span>
<span><a href="#"><%= hobby3 %> 일기&nbsp;|&nbsp;</a></span>
<span><a href="#">My MBTI is <%= MBTI %>&nbsp;|&nbsp;</a></span>
<span><a href="#">Diary</a></span></b>
</div>

<div id="sec1">
<img alt="프로필" src="https://www.nicepng.com/png/detail/105-1053345_comment-from-dj-buck-
perfil-anonimo.png"
width="120px" length="200px"> <br>
<div style="text-align:right; font-size: 8px;"><a href="#"><b>프로필 설정</b></a></div>
 <div class="feeling">
  <i><strong>Today's feeling...</strong></i><br>
  <%= feeling %><br>
 </div>
 <b><a href="#">✍글쓰기</a></b>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <b><a href="#">📃통계</a></b>
</div>


<div id="sec2">
<h2>맛집 탐방_<%= food %></h2>
<div style="text-align:right"><%= name %> &nbsp; <%= date %></div>
<hr>
<p>
<p>
<img alt="맛집" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver
.net%2FMjAyMTEyMjZfMTIw%2FMDAxNjQwNTMwMDYwMzEw.gN7QJ0UZYbABTt8B192t-wY3_ijhqiKiot8-GgVi
Tpkg.H68AZfSZp0V3Q6EW4zAeTaTgFTWzwkWIWrR9txu7Y40g.JPEG.jsol_%2F20211226%25A3%25DF114415.
jpg&type=sc960_832" width="500px" height="700px">

<p>오늘 <%= food %>로 유명한 동네 맛집을 갔다!</p>
<p>양이 많아서 2인분도 3명이 먹기 좋았다. 친구들한테도 추천해줘야지~😮<p>
<br>
<br>
<br>
<br><br>
<br><br><br>
<u>#맛집 #블로그 #친목</u>
</div>




</body>
</html>