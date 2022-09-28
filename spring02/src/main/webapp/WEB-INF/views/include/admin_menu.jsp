<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<div style="text-align: center;">
 <a><img src="${path}/images/logo.png" width="100" height="40"></a>
 <a href="${path}">Home</a> |
 <a href="${path}/admin/list.do">상품목록</a> |
 <c:if test="${sessionScope.admin_userid != null }">
  <a href="${path}/admin/write.do">상품등록</a> |
 </c:if>
 
 <div style="text-align: right;">
  <c:choose>
   <c:when test="${sessionScope.admin_userid == null}">
     <!-- 로그인하지 않은 상태  -->
    <a href="${path}/member/login.do">일반 로그인</a> |
    <a href="${path}/admin/login.do">관리자 로그인</a> |
   </c:when> 
   <c:otherwise>
     <!-- 로그인한 상태 -->
     ${sessionScope.admin_name}님이 로그인 중입니다.
     <a href="${path}/admin/logout.do">로그아웃</a> |
   </c:otherwise>
  </c:choose> 
 </div>
</div>
<hr>