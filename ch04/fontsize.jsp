<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
font-size: medium;

}
#t1{
font-size: 1em; font-weight: bold;
}
#t2{
font: italic bold 30px 궁서체; 
}
#t3{
font-size: 2.0em; font-style: italic;
}
#t4{
font-size: 2.5em; font-style: inherit; color: lime;
}
p{
color: blue; font-size: 1.5em;
}
.accent{
font-weight: bold;
font-size: 2em;
color: red;
}
#wrapper{
width: 300px;
padding: 50px;
margin: 50px;
border: solid black;

}

</style>
</head>
<body>

<p id="t1">문단1</p>
<p id="t2">문단2</p>
<p id="t3">문단3</p>
<p id="t4">문단4</p>

<div id="wrapper">
<h1>표준 웹 기술</h1>
<p><span class="accent">H</span>TML</p>
<p><span class="accent">C</span>SS</p>
<p><span class="accent">J</span>avascript</p>
</div>

</body>
</html>