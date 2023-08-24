<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I'm Your Blog</title>
<link rel = "stylesheet" type="text/css" href="blog_css.css">
<style type="text/css">
#sec2{
border-radius: 10px;
background: white;
padding: 25px;
position: absolute;
left: 390px;
top: 650px;
width: 1000px;
border : 1px dashed black;
}
#sec3{
border-radius: 10px;
background: white;
padding: 25px;
position: absolute;
left: 390px;
top: 1850px;
width: 1000px;
border : 1px dashed black;
}
.search{
top: 3160px;}
.top{top: 3080px;
}
#category{
border-radius: 10px;
background: white;
border: 1px dashed black;
width: 1010px;
position: absolute;
left: 390px;
font-color: gray;
font-size: 12px;
padding: 15px;
top: 400px;
}
#category .open {
border: 1px solid gray;
padding : 5px;
}
#category select {
float: right;
}
#category .right{
float: right;
}
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
<h1><a href="myblog.html">&nbsp;&#9998;&nbsp;My Blog 😀</h1></a>
</div>

<div id="nav" align="right">
<b>
<span><a href="introduce.html">소개&nbsp;&nbsp;</a></span>
<span><a href="diary.html">Diary&nbsp;&nbsp;</a></span>
<span><a href="visitor.html">안부게시판&nbsp;&nbsp;</a></span>
<span><a href="book.html">서재&nbsp;&nbsp;</a></span>
<span><a href="map.html">지도&nbsp;&nbsp;&nbsp;</a></span>
<span><a href="deco.html">blog꾸미기</a></span></b>
</div>

<div id="sec1">
<img alt="프로필" src="https://www.nicepng.com/png/detail/105-1053345_comment-from-dj-buck-
perfil-anonimo.png"
width="120px" length="200px"> <br>
<div style="text-align:right; font-size: 8px;"><a href="introduce.html"><b>프로필 설정</b></a></div>
 <div class="feeling">
  <i><strong>Today's feeling...</strong></i><br>
  <%= feeling %><br>
 </div>
 <b><a href="diary.html">✍글쓰기</a></b>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <b><a href="statics.html">📃통계</a></b>
</div>

<div id="category">
<p><b><%= name %></b> 2개의 글</p>
<br>
<span>글제목</span><span class="right">작성일</span>
<b><hr></b>
<p><a href="#sec2"> 맛집 탐방_<%= food %> </a> <span class="right"><%= date %></span></p>
<p><a href="#sec2">MBTI팩폭_<%= MBTI %></a><span class="right"><%= date %></span></p>
<hr><br>
 <span class="open"><a href="#">글관리 열기</a></span>
<select name="rows">
<option value="5rows" selected>5줄보기</option>
<option value="10rows">10줄보기</option>
<option value="15rows">15줄보기</option>
<option value="20rows">20줄보기</option>
</select>
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

<div id="sec3">
<h2>MBTI팩폭_<%= MBTI %></h2>
<div style="text-align:right"><%= name %> &nbsp; <%= date %></div>
<hr>
<p>
<p>
<img alt="엠비티아이 팩폭" src="http://www.visualdive.com/wp-content/uploads/2020/09/1-3-819x1024.jpg" 
width="500px" height="700px">

<p>MBTI 팩폭을 봤는데.. </p>
<p>아닌데?</p>
<p>인정할 수 없어.<p>
<br>
<br>
<br>
<br><br>
<br><br><br>
<u>#MBTI #블로그 #친목 #사실맞아</u>
</div>
<div class="top" align="right">
<a href="#header">⬆ TOP</a>
</div>
<div class="search">
<b>🔍SEARCH </b><input type="search" size="20px"></div>
<div class="up"><a href="#header">⇧</a></div>
<div class="banner"><a href="https://www.kbfg.com/Kor/pr/press/2022_19.htm">
<img alt="이미지가 안보여요ㅠ" src="https://tpc.googlesyndication.com/simgad/7529414382496576195" width="165px" height="280px"></a></div>

<div class="menu" align="center">
<p><a href="introduce.html">소 <br> 개</a></p>·
<p><a href="diary.html">일 <br> 기</a></p>·
<p><a href="visitor.html">안 <br> 부</a></p>·
<p><a href="book.html">서 <br> 재</a></p>·
<p><a href="map.html">지 <br> 도</a></p>·
<p><a href="deco.html">de <br> co</a></p>

</body>
</html>