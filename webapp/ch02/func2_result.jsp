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
String name= request.getParameter("name");
if(name==null|| name.equals("")){ %>
<script type="text/javascript">
alert("이름을 입력하세요")
location.href="func2.html";
</script>	
<%
}
String position = request.getParameter("position");
String department = request.getParameter("department");
String str = name+" "+position + "님의 방문을 환영합니다.<br> 당신의 부서는 "+department+"입니다.";
out.print(str);
%>

</body>
</html>